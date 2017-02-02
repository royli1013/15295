import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week2Q1 {
	
	private static double MIN_DIST = Math.pow(10, -6);
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().trim().split("\\s+");
		int inputs = Integer.parseInt(input[0]);
		
		for (int i = 0; i < inputs; i++) {
			
			String[] val = sc.nextLine().trim().split("\\s+");
			int p = Integer.parseInt(val[0]);
			int x = Integer.parseInt(val[1]);
			int y = Integer.parseInt(val[2]);
			
			if (isBlack(p, x, y)) {
				System.out.println("Case #" + (i+1) + ": black");
			}
			else {
				System.out.println("Case #" + (i+1) + ": white");
			}
			
		}

	}
	
	static boolean isBlack(int p, int x, int y) {
		
		if (p == 0) return false;
		if (distance(x, y, 50, 50) > 50 /*+ MIN_DIST*/) return false;
		if (p <= 50 && x < 50) return false;
		
		if (p <= 25) {
			if (inQuadrant(x, y) != 1) return false;
			return isIn(y - 50, x - 50, p);
		}
		else if (p <= 50) {
			if (inQuadrant(x, y) == 1) return true;
			if (inQuadrant(x, y) > 2) return false;
			return isIn(x - 50, 50 - y, p - 25);
		}
		else if (p <= 75) {
			if (inQuadrant(x, y) < 3) return true;
			if (inQuadrant(x, y) > 3) return false;
			return isIn(50 - y, 50 - x, p - 50);
		}
		else {
			if (inQuadrant(x, y) < 4) return true;
			return isIn(50 - x, y - 50, p - 75);
		}
		
	}
	
	static boolean isIn(int x, int y, int progress) {
		
		double angle = ((double) progress) / 100 * 2 * Math.PI;
		
		assert (angle >= 0 && angle <= Math.PI / 2);
		
		return Math.atan2(y, x) < angle;
		
	}
	
	static int inQuadrant(int x, int y) {
		
		if (x >= 50 && y >= 50) return 1;
		else if (x >= 50) return 2;
		else if (x < 50 && y <= 50) return 3;
		else if (x < 50 && y > 50) return 4;
		
		else {
			assert(false);
			return 5;
		}
		
	}
	
	static double distance(int x1, int y1, int x2, int y2) {
		
		int dx = x2 - x1;
		int dy = y2 - y1;
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		
	}

}
