
import java.util.Scanner;

public class Additional1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int years = 0;
		
		for (years = 1; years < 100; years++) {
			a *= 3;
			b *= 2;
			if (a > b) break;
		}
		System.out.println(years);
		
	}

}
