package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ElementPercentage {

	public static void main(String[] args) {
		Integer[] arr = new Integer[]{1,10,20,30,15};
	List<Integer> it=	new ArrayList<Integer>(Arrays.asList(arr));
	
	
	
	Iterator itt =it.iterator();
		while(itt.hasNext()) {		
		System.out.println(itt.next());
		
		System.out.println(itt.next());
		}
		
	}

	
}
