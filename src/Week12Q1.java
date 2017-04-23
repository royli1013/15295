import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week12Q1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int indexl = l-1;
		int indexr = r-1;
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			b.add(sc.nextInt());
		}
		for (int i = 0; i < indexl; i++) {
			int ai = a.get(i);
			int bi = b.get(i);
			if (ai != bi) {
				System.out.println("LIE");
				return;
			}
		}
		for (int i = indexr+1; i < n; i++) {
			int ai = a.get(i);
			int bi = b.get(i);
			if (ai != bi) {
				System.out.println("LIE");
				return;
			}
		}
//		for (int i = 0; i < l - 1; i++) {
//			if (!(a.get(i) == b.get(i))) {
//				System.out.println("LIE");
//				return;
//			}
//		}
//		for (int i = r; i < n; i++) {
//			if (!(a.get(i) == b.get(i))) {
//				System.out.println("LIE");
//				return;
//			}
//		}
		System.out.println("TRUTH");
		
	}

}
