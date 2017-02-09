import java.util.Scanner;

public class Week3Q2 {
	
	private final static double HOUR_HAND_MOVE_PER_SECOND = 360.0 / (12 * 3600);
	private final static double MINUTE_HAND_MOVE_PER_SECOND = 360.0 / 3600;
	private final static double diff = MINUTE_HAND_MOVE_PER_SECOND - HOUR_HAND_MOVE_PER_SECOND;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().trim().split("\\s+");
		int inputs = Integer.parseInt(input[0]);
		
		for (int i = 0; i < inputs; i++) {
			
			String[] val = sc.nextLine().trim().split("\\s+");
			int a = Integer.parseInt(val[0]);
			String word = val[1];
			int b = Integer.parseInt(val[2]);
			
//			if (a == 0 && word.equals("after") && b == 12) {
//				System.out.println("Case " + (i+1) + ": 1:05:27");
//				continue;
//			}
			
			if (word.equals("after")) {
				doAfter(a, b, i+1);
			}
			else if (word.equals("til")) {
				doBefore(a, b, i+1);
			}
			else {
				assert(false);
			}
			
		}
		
	}
	
	public static void getMinutes(int hour, int secondsPassed, int c) {
		
		if (secondsPassed >= 3600) {
			//hour++;
			secondsPassed -= 3600;
		}
		int mins = secondsPassed / 60;
		int secs = secondsPassed % 60;
		System.out.println("Case " + c + ": " + hour + ":" + mins + ":" + secs);
		
	}
	
	public static void doAfter(int a, int b, int c) {
		
		boolean lookForSecond = ((b * 30) + a) % 360 == 0;
		if (lookForSecond) {
			b = b % 12 + 1;
		}
		double hourStart = b / 12.0 * 360;
		double secondsPassed = ( (a + hourStart) % 360) / diff;
		if (lookForSecond) {
			secondsPassed += 3600;
		}
		getMinutes(b, (int)Math.round(secondsPassed), c);
		
	}
	
	public static void doBefore(int a, int b, int c) {
		
		if (360 - b * 30 <= a) {
			
			
			
		}
		
		else {
			
			double hourStart = (b-1) / 12 * 360;
			double secs = (360 - hourStart - a) / diff;
			getMinutes2(b, (int)Math.round(secs), c);
			
		}
		
		
	}
	
	public static void getMinutes2(int hour, int secsPassed, int c) {
		
		if (secsPassed >= 3600) {
			secsPassed -= 3600;
			hour -= 1;
			if (hour == 0) hour = 12;
		}
		
		int min = secsPassed / 60;
		int secs = secsPassed % 60;
		int realMin = 0;
		int realSec = 0;
		
		if (min > 0 && secs > 0) {
			realMin = 60 - min - 1;
			realSec = 60 - secs;
		}
		else if (min > 0 && secs == 0) {
			realMin = 60 - min;
		}
		else if (min == 0 && secs > 0) {
			realMin = 59;
			realSec = 60 - secs;
		}
		else {
			
		}
		System.out.println("Case " + c + ": " + hour + ":" + realMin + ":" + realSec);
		
	}

}
