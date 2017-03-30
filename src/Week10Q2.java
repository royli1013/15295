import java.util.Scanner;

public class Week10Q2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		char[][] martian = new char[n][m];
		char[][] student = new char[n][m];
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			char[] l = new char[m];
			String s = sc.nextLine();
			l = s.trim().toCharArray();
			for (int j = 0; j < m; j++) {
				martian[i][j] = l[j];
				student[i][j] = l[j];
			}
		}
		for (int i = 0; i < k; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			student[x][y] = '.';
		}

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				System.out.print(student[i][j]);
//			}
//			System.out.println();
//		}
		
		int studentSteps = solve(student, n, m);
		int martianSteps = solve(martian, n, m);
		//System.out.println(studentSteps);
		//System.out.println(martianSteps);
		if (studentSteps < 0) {
			System.out.println("NO");
			return;
		}
		if (martianSteps < 0) {
			System.out.println("YES");
			return;
		}
		if (studentSteps + 5 < martianSteps) {
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
		
	}

	private static int solve(char[][] map, int n, int m) {
		
		boolean[][] seen = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				seen[i][j] = false;
			}
		}
		//seen[0][0] = true;
		return checkPos(map, seen, 0, 0, n, m);
		
	}
	
	private static int checkPos(char[][] map, boolean[][] seen, int curX, int curY, int n, int m) {
		
		//System.out.println("X = " + curX + "    Y = " + curY);
		// up, down, left, right
		int[] mov = {-1, -1, -1, -1};
		int[] ver = {1, -1, 0, 0};
		int[] hor = {0, 0, -1, 1};
		seen[curX][curY] = true;
		
		if (curX == n - 1 && curY == m - 1) {
			return 0;
		}
		
		int nextX, nextY, steps;
		for (int dir = 0; dir < 4; dir++) {
			nextX = curX + ver[dir];
			nextY = curY + hor[dir];
			if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < m &&
				!seen[nextX][nextY] && map[nextX][nextY] == '.') {
				
				steps = checkPos(map, seen, nextX, nextY, n, m);
				if (steps >= 0) {
					mov[dir] = steps + 1;
					//System.out.println(steps);
				}
				
			}
		}
		boolean hasPath = false;
		int least = 100;
		for (int i = 0; i < 4; i++) {
			if (mov[i] > -1) {
				hasPath = true;
				if (mov[i] < least) {
					least = mov[i];
				}
			}
		}
		
		if (hasPath) return least;
		return -1;
		
	}

}
