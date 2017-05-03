import java.util.Scanner;

public class Week14Q2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int L = sc.nextInt();
			int A = sc.nextInt();
			double rad = ((double)A) / 180.0 * Math.PI;
			double sectionArea = rad / (2 * Math.PI) * L*L*Math.PI;
			double a = L * Math.cos(rad / 2);
			double b = L * Math.sin(rad / 2);
			double triangleArea = a * b;
			
			//System.out.printf("A: %.6f section: %.6f triangle: %.6f", rad, sectionArea, triangleArea);
			System.out.printf("%.6f", sectionArea - triangleArea);
			System.out.println();
		}
		
	}

}
