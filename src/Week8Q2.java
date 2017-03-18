
import java.util.Scanner;

public class Week8Q2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			long l = sc.nextLong();
			long r = sc.nextLong();
			System.out.println(solve(l, r));
			
		}
		
		
	}

	private static long solve(long l, long r) {
	
		if (l == r) return l;
		long result = l;
		long prev = l;
		while(result <= r) {
			prev = result;
			result += firstZero(result);
		}
		
		return prev;
	
	}
	
	private static long firstZero(long l) {
		
		if (l % 2 == 0) return 1L;
		long result = 1;
		
		while(l % 2 == 1) {
			l /= 2;
			result *= 2;
		}
		return result;
		
	}

}
