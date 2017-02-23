import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Week7Q3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int T = sc.nextInt();
		
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		for (int i = 1; i <= n; i++) {
			map.put(i, new ArrayList<Integer>());
		}
		
		for (int i = 0; i < m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int time = sc.nextInt();
			map.get(start).add(end);
			map.get(start).add(time);
		}
		
		solve(map, n, T);
		
	}

	private static void solve(Map<Integer, List<Integer>> map, int n, int T) {
		
		List<List<Integer>> answers = new ArrayList<List<Integer>>();
		List<Integer> start = new ArrayList<Integer>();
		start.add(1);
		recurse(map, start, 1, n, T, answers);
		
		int max = 0;
		List<Integer> best = null;
		
		for (List<Integer> answer : answers) {
			
			if (answer.size() > max) {
				max = answer.size();
				best = answer;
			}
			
		}
		System.out.println(max);
		for (int i = 0; i < max; i++) {
			if (i < max - 1) {
				System.out.print(best.get(i) + " ");
			}
			else {
				System.out.print(best.get(i));
			}
		}
		System.out.println();
		
	}

	private static void recurse(Map<Integer, List<Integer>> map, List<Integer> curPath, 
								int last, int n, int timeRemaining, List<List<Integer>> answers) {
		
		List<Integer> next = map.get(last);
		//System.out.println(next + " " + timeRemaining);
		int numPaths = next.size();
		for (int i = 0; i < numPaths; i += 2) {
			int node = next.get(i);
			int newTimeRemaining = timeRemaining - next.get(i+1);
			//System.out.println(newTimeRemaining);
			if (newTimeRemaining < 0) {
				//System.out.println(curPath);
				continue;
			}
			else {
				//System.out.println(node);
				if (node == n) {
					List<Integer> answer = new ArrayList<Integer>(curPath);
					answer.add(n);
					answers.add(answer);
				}
				else {
					List<Integer> newPath = new ArrayList<Integer>(curPath);
					newPath.add(node);
					recurse(map, newPath, node, n, newTimeRemaining, answers);
				}
			}
			
		}
		
	}
	
	

}
