import java.util.Scanner;

public class Week13Q1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int rows = sc.nextInt();
			int cols = sc.nextInt();
			solve(rows, cols);
		}
		
	}

	private static void solve(int rows, int cols) {

		int diagonals = rows + cols;
		int[][] seating = new int[rows][cols];
		int total = rows * cols;
		int posX = 0;
		int posY = 0;
		int diagonalNum = 0;
		for (int i = 0; i < total; i++) {
			seating[posX][posY] = i + 1;
			
			if (posX == 0 || posY == cols - 1) {
				diagonalNum++;
				if (diagonalNum >= rows) {
					posX = rows - 1;
					posY = diagonalNum - rows + 1;
				}
				else {
					posX = diagonalNum;
					posY = 0;
				}
			}
			else {
				posX--;
				posY++;
			}
		}
		
		for (int i = rows-1; i >= 0; i--) {
			for (int j = cols-1; j>= 0; j--) {
				if (j == 0) {
					System.out.print(seating[i][j]);
				}
				else {
					System.out.print(seating[i][j] + " ");
				}
			}
			//if (i != 0) {
				System.out.println();
			
		}
		
	}

}
