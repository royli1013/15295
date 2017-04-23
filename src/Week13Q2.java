import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Week13Q2 {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		Set<Character> letters = new HashSet<Character>();
		letters.add('A');
		letters.add('H');
		letters.add('I');
		letters.add('M');
		letters.add('O');
		letters.add('T');
		letters.add('U');
		letters.add('V');
		letters.add('W');
		letters.add('X');
		letters.add('Y');
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine().trim();
			//System.out.println(s);
			solve(s, letters);
		}
		
	}

	private static void solve(String s, Set<Character> letters) {
		
		int len = s.length();
		for (int index = 0; index <= len / 2; index++) {
			char c1 = s.charAt(index);
			char c2 = s.charAt(len - index - 1);
			if (c1 != c2 || !letters.contains(c1)) {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
		
	}

}
