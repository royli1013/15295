import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Week8Q4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 1; i < 1000; i *= 2) {
			m.put(i, 0);
		}
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(n);
		//System.out.println(values);
		System.out.println(solve(values, m));
		
		
	}
	
	public static int solve(List<Integer> vals, Map<Integer, Integer> m) {
		
		int firstMove = 0;
		int moves = 0;
		while (vals.size() > 0) {
			
			int k = vals.get(0);
			vals.remove(0);
			//System.out.println(vals.size());
			if (m.containsKey(k)) {
				moves += m.get(k);
				continue;
			}
			
			for (int piles = (int) Math.ceil(Math.sqrt(k)); piles >= 2; piles--) {
				
				if (piles % 2 == 0) {
					if ((k - piles/2) % piles == 0) {
						int mid = k / piles;
						int start = mid - (piles / 2 - 1);
						for (int i = start; i < start+piles; i++) {
							vals.add(i);
						}
						if (firstMove == 0) firstMove = piles;
						moves++;
						break;
					}
				}
				else {
					if (k % piles == 0) {
						int mid = k / piles;
						int start = mid - (piles / 2);
						for (int i = start; i < start + piles; i++) {
							vals.add(i);
						}
						if (firstMove == 0) firstMove = piles;
						moves++;
						break;
					}
				}
				
			}
			
		}
		if (moves % 2 == 0) return -1;
		return firstMove;
		
	}

}
