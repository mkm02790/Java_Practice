package Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class OOOOOOOOO {

	public static void main(String[] args) {
		
		String str="Appends all of the elements in the specified Collection to the end of this list, in the order that they are returned by the specified Collection's Iterator. The behavior of this operation is undefined if the specified Collection is modified while the operation is in progress";
		String[] strArray = str.split(" ");
		ArrayList<String> al = new ArrayList<>(Arrays.asList(strArray));
	
		System.out.println(al);
		
		String[] str2 = al.toArray(new String[al.size()]);
		String str3= Arrays.toString(str2);
		System.out.println(str3);
	}
}