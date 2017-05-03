import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Week14Q1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int N = sc.nextInt();
			solve(a, b, N);
		}
		
	}

	private static void solve(int a, int b, int n) {
		
		Set<Integer> s = new HashSet<Integer>();
		int x = 1;
		while(true) {
			int y = a * x * x + b * x;
			if (y > n) {
				break;
			}
			s.add(y);
			x++;
		}
		//System.out.println(s);
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < 10; i++) {
			m.put(i, 0);
		}
		if (s.size() == 0) {
			System.out.println(-1);
			return;
		}
		Map<Integer, Integer> m2 = new HashMap<Integer, Integer>();
		for (int y : s) {
			for (int i = 0; i < 10; i++) {
				m2.put(i, 0);
			}
			if (y == 0) assert(false);
			while (y > 0) {
				int digit = y % 10;
				int freq = m2.get(digit);
				m2.put(digit, freq + 1);
				y /= 10;
			}
			int max = 0;
			for (int i = 0; i < 10; i++) {
				int freq = m2.get(i);
				if (freq > max) {
					max = freq;
				}
			}
			for (int i = 0; i < 10; i++) {
				if (m2.get(i) == max) {
					int freq = m.get(i);
					m.put(i, freq + 1);
				}
			}
		}
		int max = 0;
		int maxI = -1;
		for (int i : m.keySet()) {
			int freq = m.get(i);
			if (freq > max) {
				maxI = i;
				max = freq;
			}
			else if (freq == max) {
				if (i < maxI) {
					maxI = i;
				}
			}
		}
//		System.out.println();
//		System.out.println(s);
//		System.out.println(m);
		System.out.println(maxI);
		return;
		
	}

}
