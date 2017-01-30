import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().trim().split("\\s+");
		
		int beds = Integer.parseInt(input[0]);
		int pillows = Integer.parseInt(input[1]);
		int k = Integer.parseInt(input[2]);
		
		int pillowsRemaining = pillows - beds;
		if (pillowsRemaining == 0) {
			System.out.println(1);
			return;
		}
		if (pillowsRemaining < 3) {
			System.out.println(2);
			return;
		}
		int left = k-1;
		int right = beds-k;
		int leftPillows;
		int rightPillows;
		
		for (int guess = 2; guess < pillows; guess++) {
			
			int mostPillows = guess-1;
			if (left == 0) {
				leftPillows = 0;
			}
			else if (left >= mostPillows) {
				leftPillows = (mostPillows + 1) * mostPillows / 2;
			}
			else {
				leftPillows = (mostPillows + (mostPillows-left+1)) * left;
			}
			
			
			if (right == 0) {
				rightPillows = 0;
			}
			else if (right >= mostPillows) {
				rightPillows = (mostPillows + 1) * mostPillows / 2;
			}
			else {
				rightPillows = (mostPillows + (mostPillows-right+1)) * right;
			}
			
			if (rightPillows + leftPillows + guess > pillowsRemaining) {
				System.out.println(guess);
				return;
			}
			
		}
		
	}

}
