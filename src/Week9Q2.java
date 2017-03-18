import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Week9Q2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = sc.nextInt();
		
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < k; i++) {
			s.add(sc.nextInt());
		}
		
		solve(n, k, r, s);
		
	}

	private static void solve(int n, int k, int r, Set<Integer> s) {

		Set<Integer> curLights = new HashSet<Integer>();
		int add = 0;
		int begin = 1;
		int end = r;
		for (int i = begin; i <= r; i++) {
			if (s.contains(i)) {
				curLights.add(i);
			}
		}
		int size = curLights.size();
		if (size == 0) {
			add += 2;
			curLights.add(end);
			curLights.add(end - 1);
		}
		else if (size == 1) {
			add += 1;
			if (curLights.contains(end)) {
				curLights.add(end - 1);
			}
			else {
				curLights.add(end);
			}
		}
		
		for (end = r + 1; end <= n; end++) {
			begin++;
			assert(end - begin == r - 1);
			if (s.contains(end)) {
				curLights.add(end);
			}
			if (curLights.remove(begin - 1)) {
				if (curLights.size() < 2) {
					assert(curLights.size() == 1);
					add++;
					if (curLights.contains(end)) {
						curLights.add(end - 1);
					}
					else {
						curLights.add(end);
					}
				}
			}
			
		}
		System.out.println(add);
		
	}

}
