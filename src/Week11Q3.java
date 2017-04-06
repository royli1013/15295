import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Week11Q3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		Map<Integer, Integer> leftM = new HashMap<Integer, Integer>();
		Map<Integer, Integer> rightM = new HashMap<Integer, Integer>();
		List<Integer> leftL = new ArrayList<Integer>();
		List<Integer> rightL = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int m = sc.nextInt();
			if (x > 0) {
				rightM.put(x, m);
				rightL.add(x);
			}
			else {
				leftM.put(-x, m);
				leftL.add(-x);
			}
		}
		Collections.sort(leftL);
		Collections.sort(rightL);
		Collections.reverse(leftL);
		Collections.reverse(rightL);
		
		int mailsLeft = 0;
		long total = 0;
		for (int x : leftL) {
			int mails = leftM.get(x);
			
			if (mailsLeft < mails) {
				mails -= mailsLeft;
				mailsLeft = 0;
			}
			else {
				mailsLeft -= mails;
				continue;
			}
			int tripsNeeded = mails / k;
			if (mails % k != 0) tripsNeeded++;
			total += ((long)tripsNeeded) * ((long)x) * 2;
			if (mails % k != 0) mailsLeft = k - (mails % k);
			else mailsLeft = 0;
		}
		mailsLeft = 0;
		for (int x : rightL) {
			int mails = rightM.get(x);
			//System.out.println(x + " " + mailsLeft + " " + mails);
			if (mailsLeft < mails) {
				mails -= mailsLeft;
				mailsLeft = 0;
			}
			else {
				mailsLeft -= mails;
				continue;
			}
			int tripsNeeded = mails / k;
			if (mails % k != 0) tripsNeeded++;
			total += ((long)tripsNeeded) * ((long)x) * 2;
			//System.out.println(total);
			if (mails % k != 0) mailsLeft = k - (mails % k);
			else mailsLeft = 0;
		}
		
		System.out.println(total);
	}

}
