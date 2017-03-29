import java.util.Scanner;

public class Additional3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int l = 0;
		int s = 0;
		boolean mul = false;
		
		if (c % a == 0) {
			l = c;
			s = a;
			mul = true;
		}
		if (a % c == 0) {
			l = a;
			s = c;
			mul = true;
		}
		if (mul) {
			if (((int)Math.abs(b - d)) % s == 0) {
				
			}
			else {
				System.out.println(-1);
				return;
			}
		}
		
		int rick = b;
		int morty = d;
		
		while (true) {
			
			if (rick == morty) {
				System.out.println(rick);
				return;
			}
			if (rick < morty) {
				rick += a;
			}
			else {
				morty += c;
			}
			
		}
		
	}


}
