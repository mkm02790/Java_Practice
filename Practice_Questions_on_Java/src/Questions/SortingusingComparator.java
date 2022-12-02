package Questions;

import java.util.Comparator;

public class SortingusingComparator {

	public static void main(String[] args) {
		String str = "Mukul";
		String answer = ""; 
		
		int n = str.length()-1;

		for (int i = 0; i <str.length(); i++) {
			
			char ch = str.charAt(n-i);
			
			
			answer = answer + ch;
			   
		}
		System.out.println(answer);
	}
}