import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Additional4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//String cancel = "NO";
		
		for (int i = 0; i < m; i++) {
			int k = sc.nextInt();
			Set<Integer> s = new HashSet<Integer>();
			boolean con = false;
			for (int j = 0; j < k; j++) {
				if (con) {
					sc.nextInt();
					continue;
				}
				int v = sc.nextInt();
				if (s.contains(-v)) {
					con = true;
				}
				s.add(v);
			}
			if (!con) {
				//cancel = "YES";
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		
	}


}
