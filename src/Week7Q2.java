import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week7Q2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> A = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			A.add(sc.nextInt());
		}
		
		solve(A, n);
		
	}

	private static void solve(List<Integer> A, int n) {
		
		int rest = 0;
		int noRest = 0;
		
		int prev = A.get(0);
		if (prev == 0) {
			rest++;
		}
		else {
			noRest++;
		}
		
		
		for (int i = 1; i < n; i++) {
			
			int day = A.get(i);
			
			if (prev == 3) {
				prev = day;
				if (day > 0) {
					noRest++;
				}
				else {
					rest++;
				}
			}
			else if (prev == 2) {
				if (day == 0 || day == 2) {
					prev = 0;
					rest++;
				}
				else {
					prev = 1;
					noRest++;
				}
			}
			else if (prev == 1) {
				if (day == 1 || day == 0) {
					prev = 0;
					rest++;
				}
				else {
					prev = 2;
					noRest++;
				}
			}
			else {
				if (day == 0) {
					rest++;
				}
				else {
					noRest++;
				}
				prev = day;
			}
			
		}
		
		System.out.println(rest);
		
	}

}
