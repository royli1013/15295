import java.util.Scanner;

public class Additional8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine().trim();
		int diffs = 0;
		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1)) {
				diffs++;
			}
		}
		if (diffs == 0) {
			if (len % 2 == 0) {
				System.out.println("NO");
				return;
			}
			System.out.println("YES");
			return;
		}
		if (diffs > 2) {
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
		
	}

}
