import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week9Q1 {
	
	private static int needs;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().trim().toCharArray();
		
		List<Integer> starts; // indexes
		starts = getStarts(s);
		
		//System.out.println(starts);
		needs = 0;
		recurse(starts, s, 0);
		System.out.println(26 - needs);
		
	}
	
	private static int recurse(List<Integer> l, char[] s, int round) {
		
		round++;
		for (int i : l) {
			List<Integer> next = getNext(s, i);
			//System.out.println(next);
			if (next.size() == 0) {
				if (round > needs) needs = round;
			}
			else {
				recurse(next, s, round);
			}
		}
		
		return 0;
		
	}

	private static List<Integer> getStarts(char[] s) {
		
		List<Integer> l = new ArrayList<Integer>();
		int len = s.length;
		int low = (int) s[0];
		l.add(0);
		
		for (int i = 0; i < len; i++) {
			if ((int)s[i] < low) {
				l.add(i);
				low = (int)s[i];
			}
		}
		
		return l;
	}
	
	private static List<Integer> getNext(char[] s, int index) {
		
		List<Integer> l = new ArrayList<Integer>();
		int len = s.length;
		int low = 9999;
		for (int i = index; i < len; i++) {
			if ((int)s[i] < low && (int)s[i] > (int)s[index]) {
				l.add(i);
				low = (int)s[i];
			}
		}
		
		return l;
		
	}

}
