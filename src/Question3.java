import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question3 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().trim().split("\\s+");
		
		long n = Long.parseLong(input[0]);
		long k = Long.parseLong(input[1]);
		boolean perfSq = false;
		List<Long> divisors = new ArrayList<Long>();
		
		int numDivisors = 0;
		int inc = 1;
		
		long sqrtn = (long) Math.sqrt(n);
		if (sqrtn * sqrtn == n) perfSq = true;
		
		if (n % 2 != 0) inc = 2;
		
		for (long divisor = 1; divisor <= sqrtn; divisor += inc) {
			
			if (n % divisor == 0) {
				numDivisors++;
				if (numDivisors == k) {
					System.out.println(divisor);
					return;
				}
				divisors.add(0, n / divisor);
				//System.out.println("added " + n / divisor);
			}
			
		}
		
		int totalDivisors;
		if (perfSq) {
			totalDivisors = numDivisors*2 - 1;
		}
		else {
			totalDivisors = numDivisors*2;
		}
		
		if (k > totalDivisors) {
			System.out.println(-1);
			return;
		}
		
		if (perfSq) {
			//System.out.println("perf");
			System.out.println(divisors.get((int) (k-numDivisors)));
			return;
		}
		else {
			//System.out.println("not perf");
			System.out.println(divisors.get((int) (k-numDivisors-1)));
			return;
		}
		
		
	
	}

}
