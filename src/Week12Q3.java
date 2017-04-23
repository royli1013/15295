import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Week12Q3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> c = new ArrayList<Integer>();
		Map<Integer, Integer> has = new HashMap<Integer, Integer>();
		c.add(0);
		for (int i = 0; i < n; i++) {
			c.add(sc.nextInt());
			has.put(i + 1, 0);
		}
		char cur = 'a';
		int curIndex = 0;
		char[] result = new char[n];
		
		for (int i = n; i > 0; i--) { // i = num reps
			int rep = c.get(i);
			int repsNeeded = rep - has.get(i);
			for (int j = 0; j < repsNeeded; j++) {
				for (int k = 0; k < i; k++) {
					result[curIndex] = cur;
					curIndex++;
				}
				cur = next(cur);
				for (int k = i-1; k > 0; k--) {
					int nums = (i + 1) - k;
					int newSum = has.get(k) + nums;
					has.put(k, newSum);
				}
			}
		}
		System.out.println(String.valueOf(result));
		
	}

	private static char next(char cur) {
		if (cur == 'z') return 'a';
		return (char) (cur + 1);
	}

}
