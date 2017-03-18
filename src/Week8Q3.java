import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Week8Q3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().trim().toCharArray();
		
		
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		int l = s.length;
		for (int i = 0; i < l; i++) {
			
			if (m.containsKey(s[i])) {
				m.put(s[i], m.get(s[i]) + 1);
			}
			else {
				m.put(s[i], 1);
			}
			
		}
		int odds = 0;
		for (char k : m.keySet()) {
			if (m.get(k) % 2 == 1) {
				odds++;
			}
		}
		if ((odds-1) % 2 == 1) {
			System.out.println("Second");
		}
		else {
			System.out.println("First");
		}
		
		
	}

}
