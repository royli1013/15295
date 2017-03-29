import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Additional7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> diff = new ArrayList<Integer>();
		
		int prev = sc.nextInt();
		int next = 0;
		for (int i = 1; i < n; i++) {
			
			next = sc.nextInt();
			diff.add(Math.abs(next - prev));
			prev = next;
			
		}
		int size = diff.size();
		int max = 0;
		for (int l = 0; l < size; l++) {
			int sum = 0;
			for (int i = l; i < size; i++) {
				if ((i - l) % 2 == 0) {
					sum += diff.get(i);
				}
				else {
					sum -= diff.get(i);
				}
				if (sum > max) max = sum;
				if (sum <= 0) break;
			}
		}
		System.out.println(max);
		
	}

}
