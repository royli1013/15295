
import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().trim().split("\\s+");
		
		int month = Integer.parseInt(input[0]);
		int startDay = Integer.parseInt(input[1]);
		int days;
		int columns = 1;
		
		if (month == 1 || month == 3 || month == 5 ||
		    month == 7 || month == 8 || month == 10 ||
		    month == 12) {
			days = 31;
		}
		
		else if (month == 4 || month == 6 || 
				 month == 9 || month == 11) {
			days = 30;
		}
		
		else {
			days = 28;
		}
		
		for (int i = 1; i <= days; i++) {
			
			if (startDay > 7) {
				columns++;
				startDay = 1;
			}
			startDay++;
			
		}

		System.out.println(columns);
	}

}
