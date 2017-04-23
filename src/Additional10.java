import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Additional10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		List<Integer> nums = new ArrayList<Integer>();
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a < smallest) {
				smallest = a;
			}
			nums.add(a);
		}
		
		long secs = 0;
		for (int i = 0; i < n; i++) {
			int a = nums.get(i);
			if ((a - smallest) % k != 0) {
				System.out.println(-1);
				return;
			}
			secs += (a - smallest) / k;
		}
		System.out.println(secs);
	}
	
}
