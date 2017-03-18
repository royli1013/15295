import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Additional2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mm = sc.nextInt();
		
		List<Long> connections = new ArrayList<Long>();
		Set<Long> s = new HashSet<Long>();
		for (int i = 0; i < mm; i++) {
			long j = sc.nextLong();
			long k = sc.nextLong();
			connections.add(j);
			connections.add(k);
			s.add((j << 32) + k);
		}
		
		int l = connections.size();
		for (int i = 0; i < l-2; i += 2) {
			for (int j = i+2; j < l; j += 2) {
				long num1 = connections.get(i);
				long num2 = connections.get(i + 1);
				long num3 = connections.get(j);
				long num4 = connections.get(j + 1);
				long a;
				long b;
				
				
				if (num1 == num3) {
					a = num2;
					b = num4;
				}
				else if (num1 == num4) {
					a = num2;
					b = num3;
				}
				else if (num2 == num3) {
					a = num1;
					b = num4;
				}
				else if (num2 == num4) {
					a = num1;
					b = num3;
				}
				else {
					continue;
				}
				
				if (!s.contains((a << 32) + b) && !s.contains((b << 32) + a)) {
					System.out.println("NO");
					return;
				}
				
				
			}
		}
		System.out.println("YES");
		
//		Map<Integer, List> map = new HashMap<Integer, List>();
//		for (int i = 1; i <= n; i++) {
//			map.put(i, new ArrayList<Integer>());
//		}
//		
//		for (int i = 0; i < m; i++) {
//			
//			int j = sc.nextInt();
//			int k = sc.nextInt();
//			map.get(j).add(k);
//			map.get(k).add(j);
//			
//		}
//		
//		for (int key : map.keySet()) {
//			List<Integer> con = map.get(key);
//			int l = con.size();
//			if (l <= 1) continue;
//			for (int i = 0; i < l - 1; i++) {
//				List<Integer> first = map.get(con.get(i));
//				for (int j = i + 1; j < l; j++) {
//					if (!first.contains(con.get(j))) {
//						System.out.println("NO");
//						return;
//					}
//				}
//			}
//		}
//		System.out.println("YES");
		
	}


}
