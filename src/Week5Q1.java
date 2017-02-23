import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week5Q1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().trim().split("\\s+");
		
		int start = Integer.parseInt(input[0]);
		int end = Integer.parseInt(input[1]);
		
		if (end <= start) {
			System.out.println(start - end);
			return;
		}
		
		//List<Integer> seen = new ArrayList<Integer>();
		
		int least = recurse(start, end, 10000, 0);
		System.out.println(least);
		
	}

	private static int recurse(int start, int end, int least, int steps) {
//		if (seen.contains(start)) {
//			return least;
//		}
//		
//		seen.add(start);
		if (start == end) return steps;
		if (start > 20000) return least;
		if (start == 1) {
			int a = recurse(start * 2, end, least, steps+1);
			if (a < least) {
				return a;
			}
			return least;
		}
		
		else {
			if (start > end) {
				int a = steps + (start - end);
				if (a < least) {
					return steps + (start - end);
				}
				return least;
			}
			
			else {
				int a = recurse(start*2, end, least, steps+1);
				int b = recurse(start-1, end, least, steps+1);
				if (a <= b && a <= least) return a;
				else if (b <= least) return b;
				else return least;
			}
			
		}
	}

}
