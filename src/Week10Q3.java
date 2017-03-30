import java.util.List;
import java.util.Scanner;

public class Week10Q3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int[] pos = new int[N+1];
			int[] pos1 = new int[N+1];
			for (int j = 0; j < N; j++) {
				int p = sc.nextInt();
				pos[p] = j;
				pos1[j] = p;
			}
			solve(N, pos, pos1, i+1);
		}
		
	}
	
	private static void solve(int n, int[] vals, int[] rev, int caseNum) {
		
		char[] solution = new char[n];
		char curChar = 'A';
		boolean fail = false;
		int prev = n + 1;
		int p1 = vals[1];
		int p2 = 0;
		solution[p1] = curChar;
		for (int i = 2; i <= n; i++) {
			
//			int p = vals[i];
//			if (p > prev) {
//				if (curChar == 'Z') {
//					fail = true;
//					break;
//				}
//				curChar++;
//			}
//			solution[p] = curChar;
//			prev = p;
			p2 = vals[i];
			if (p2 > p1) {
				if ( (p2 == n) || !(rev[p2+1] > rev[p1+1]) ) {
					if (curChar == 'Z') {
						fail = true;
						break;
					}
					curChar++;
				}
			}
			else {
				if ( !(p1 == n) && (rev[p2+1] < rev[p1+1]) ) {
					if (curChar == 'Z') {
						fail = true;
						break;
					}
					curChar++;
				}
			}
			solution[p2] = curChar;
			p1 = p2;
			
		}
		System.out.print("Case #" + caseNum + ": ");
		if (fail) {
			System.out.println(-1);
		}
		else {
			System.out.println(String.valueOf(solution));
		}
		
	}

}
