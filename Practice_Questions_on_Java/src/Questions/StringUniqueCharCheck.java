package Java_100_Question_Series;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class StringUniqueCharCheck {

	public static void main(String[] args) {
		String str = "mukul";
		char[] cha= str.toCharArray();
		ArrayList<Character> al = new ArrayList<>();
		for(char ch : cha) {
			if(al.contains(ch)) {
				System.out.println("false");
				
			}else {
				al.add(ch);
				
			}
		}
		
	}

}
