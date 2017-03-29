import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Additional6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long b = sc.nextLong();
		long q = sc.nextLong();
		long l = sc.nextLong();
		int m = sc.nextInt();
		
		Set<Long> s = new HashSet<Long>();
		for (int i = 0; i < m; i++) {
			s.add(sc.nextLong());
		}
		
		if (Math.abs(b) > l) {
			System.out.println(0);
			return;
		}
		
		if (b == 0) {
			if (s.contains(b)) {
				System.out.println(0);
			}
			else {
				System.out.println("inf");
			}
			return;
		}
		if (q == 0) {
			if (!s.contains(q)) {
				System.out.println("inf");
			}
			else if (s.contains(b)) {
				System.out.println(0);
			}
			else {
				System.out.println(1);
			}
			return;
		}
		if (Math.abs(q) == 1) {
			if (s.contains(b) && s.contains(b*q)) {
				System.out.println(0);
			}
			else {
				System.out.println("inf");
			}
			return;
		}
		
		long nums = 0;
		long bi = b;
		while(Math.abs(bi) <= l) {
			if (!s.contains(bi)) {
				nums++;
			}
			bi = bi * q;
			if (Math.abs(bi) > l) break;
		}
		System.out.println(nums);
		
	}

}
