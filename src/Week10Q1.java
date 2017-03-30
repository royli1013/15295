import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week10Q1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Integer> L = new ArrayList<Integer>();
		for (int i = 0; i < 24; i++) {
			L.add(0);
		}
		
		int most = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int j = a; j < b; j++) {
				int prev = L.remove(j);
				int next = prev + 1;;
				if (next > most) most = next;
				L.add(j, next);
			}
		}
		System.out.println(most);
		
	}

}
