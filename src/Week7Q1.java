import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Week7Q1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().trim().split("\\s+");
		
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		input = sc.nextLine().trim().split("\\s+");
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> I = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			A.add(Integer.parseInt(input[i]));
		}
		
		for (int i = 0; i < m; i++) {
			I.add(sc.nextInt());
		}
		
		solve(n, m, A, I);
		
	}

	private static void solve(int n, int m, List<Integer> A, List<Integer> I) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Set<Integer> vals = new HashSet<Integer>();
		
		for (int index = n - 1; index >= 0; index--) {
			
			vals.add(A.get(index));
			map.put(index, vals.size());
			
		}
		
		for (int i = 0; i < m; i++) {
			
			System.out.println(map.get(I.get(i) - 1));
			
		}
		
	}


}
