package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OOOOOOOOO {

	public static void main(String[] args) {
		
		/*
		 * String
		 * str="Appends all of the elements in the specified Collection to the end of this list, in the order that they are returned by the specified Collection's Iterator. The behavior of this operation is undefined if the specified Collection is modified while the operation is in progress"
		 * ; String[] strArray = str.split(" "); ArrayList<String> al = new
		 * ArrayList<>(Arrays.asList(strArray));
		 * 
		 * System.out.println(al);
		 * 
		 * String[] str2 = al.toArray(new String[al.size()]); String str3=
		 * Arrays.toString(str2); System.out.println(str3);
		 */
		int[] arr = {1,322,32,43,1,54,46,675,53,65,87,534,57,53,645,754,3453,86};
		List<Integer> ls =Arrays.stream(arr).boxed().filter(e -> e>50).limit(5).collect(Collectors.toList());
		System.out.println(ls);
	}
}