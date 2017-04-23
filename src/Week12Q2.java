import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Week12Q2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.nextLine();
		Set<String> allStrings = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			allStrings.add(sc.nextLine().trim());
		}
		String wanted = sc.nextLine().trim();
		int length = wanted.length();
		
		int lettersFound = 0;
		int tries = 0;
		while (lettersFound < length) {
			String next = wanted.substring(lettersFound);
			int largest = findFit(next, allStrings);
			if (largest == 0) {
				System.out.println(-1);
				return;
			}
			lettersFound += largest;
			tries++;
		}
		System.out.println(tries);
		return;
		
	}

	private static int findFit(String next, Set<String> allStrings) {
		
		int largest = 0;
		for (String s : allStrings) {
			int n = calc(next, s);
			if (n > largest) largest = n;
		}
		return largest;
		
	}

	private static int calc(String next, String s) {
		
		int curIndex = 0;
		int nextL = next.length();
		int sL = s.length();
		for (int i = 0; i < sL; i++) {
			if (s.charAt(i) == next.charAt(curIndex)) {
				curIndex++;
				if (curIndex >= nextL) {
					return curIndex;
				}
			}
		}
		return curIndex;
		
	}

}
