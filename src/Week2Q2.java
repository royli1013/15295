import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Week2Q2 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().trim().split("\\s+");
		int days = Integer.parseInt(input[0]);
		
		for (int i = 0; i < days; i++) {
			
			int items = Integer.parseInt(sc.nextLine().trim());
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < items; j++) {
				list.add(Integer.parseInt(sc.nextLine().trim()));
			}
			int trips = solve(list, items);
			System.out.println("Case #" + (i+1) + ": " + trips);
		}
		
	}
	
	public static int solve(List<Integer> items, int n) {
		
		Collections.sort(items);
		//System.out.println(items);
		
		int trips = 0;
		int itemsLeft = n;
		while(true) {
			//System.out.println("ok ");
			trips++;
			if (itemsLeft == 0) break;
			int weight = items.get(itemsLeft - 1);
			int itemsNeeded = 50 / weight;
			if (50 % weight != 0) itemsNeeded++;
			
			if (itemsNeeded > itemsLeft) break;
			
			else {
				items.remove(itemsLeft - 1);
				itemsLeft -= itemsNeeded;
				for (int i = 0; i < itemsNeeded-1; i++) {
					items.remove(0);
				}
			}
		}
		
		return trips - 1;
		
	}

}
