import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Week11Q1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		String s1 = "CARS";
//		String s2 = "Unil";
//		String s3 = "cars";
//		String s4 = "EPFL";
//		String s5 = "IuVEJxTXs UvOHhng yZKfAYmaqolM";
//		String s6 = "vpVZzBNtL SCubWma ocIYneAPqxDs";
//		String s7 = "NtGQibw djPrCpek FWzL";
//		String s8 = "hRkMGgJ fHrFUQTj XOwd";
//		String s9 = "aySBaPyb RM gzYMynY";
//		String s10 = "PolyProg is awesome";
		Map<Character, String> m = new HashMap<Character, String>();
//		addMap(m, s1, s2);
//		addMap(m, s3, s4);
//		addMap(m, s5, s6);
//		addMap(m, s7, s8);
//		addMap(m, s9, s10);
		m.put(' ', " ");
		m.put('A', "n");
		m.put('B', "y");
		m.put('C', "U");
		m.put('D', "K");
		m.put('E', "Z");
		m.put('F', "X");
		m.put('G', "k");
		m.put('H', "b");
		m.put('I', "v");
		m.put('J', "z");
		m.put('K', "I");
		m.put('L', "d");
		m.put('M', "s");
		m.put('N', "h");
		m.put('O', "u");
		m.put('P', "r");
		m.put('Q', "M");
		m.put('R', "i");
		m.put('S', "l");
		m.put('T', "N");
		m.put('U', "S");
		m.put('V', "V");
		m.put('W', "O");
		m.put('X', "t");
		m.put('Y', "e");
		m.put('Z', "c");
		m.put('a', "P");
		m.put('b', "g");
		m.put('c', "E");
		m.put('d', "f");
		m.put('e', "T");
		m.put('f', "Y");
		m.put('g', "a");
		m.put('h', "W");
		m.put('i', "G");
		m.put('j', "H");
		m.put('k', "j");
		m.put('l', "D");
		m.put('m', "A");
		m.put('n', "m");
		m.put('o', "x");
		m.put('p', "Q");
		m.put('q', "q");
		m.put('r', "F");
		m.put('s', "L");
		m.put('t', "R");
		m.put('u', "p");
		m.put('v', "C");
		m.put('w', "J");
		m.put('x', "B");
		m.put('y', "o");
		m.put('z', "w");
//		for (char c : m.keySet()) {
//			System.out.println("m.put('" + c + "', \"" + m.get(c) + "\");");
//		}
		sc.nextLine();
		String s = sc.nextLine();
		//String message = "";
		int len = s.length();
		for (int i = 0; i < len; i++) {
			//char c = s.charAt(i);
			//message += m.get(c);
			System.out.print(m.get(s.charAt(i)));
		}
		System.out.println(/*message*/);
		
	}

//	private static void addMap(Map<Character, String> m, String s1, String s2) {
//
//		int len = s1.length();
//		for (int i = 0; i < len; i++) {
//			char key = s1.charAt(i);
//			String val = s2.substring(i, i+1);
//			m.put(key, val);
//		}
//		
//	}

}
