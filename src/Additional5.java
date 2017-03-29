import java.util.Scanner;

public class Additional5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int days;
		
		int total = 0;
		for (int i = 0; i < n; i++) {
			int w = sc.nextInt();
			total += w / k;
			if (w % k > 0) total++;
		}
		//System.out.println(total);
		if (total % 2 == 0) {
			days = total / 2;
		}
		else {
			days = total / 2 + 1;
		}
		System.out.println(days);
	}

}
