import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Additional9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		String s = sc.nextLine().trim();
		int len = s.length();
		Map<Integer, Integer> rotations = new HashMap<Integer, Integer>();
		for (int i = 0; i < len; i++) {
			rotations.put(i, i);
		}
		
		String s2 = s + s;
		for (int i = 1; i < n; i++) {
			String s1 = sc.nextLine().trim();
			if (s1.length() != len) {
				System.out.println(-1);
				return;
			}
			int pos = s2.indexOf(s1);
			if (pos == -1) {
				System.out.println(-1);
				return;
			}
			for (int j = 0; j < len; j++) {
				int rots = rotations.get(j);
				if (j < pos) {
					int diff = pos - j;
					int newRots = len - diff;
					rotations.put(j, rots + newRots);
				}
				else {
					int newRots = j - pos;
					rotations.put(j, rots + newRots);
				}
			}
		}
		int smallest = 2500;
		for (int j = 0; j < len; j++) {
			int rots = rotations.get(j);
			if (rots < smallest) {
				smallest = rots;
			}
		}
		System.out.println(smallest);
		
	}

}
