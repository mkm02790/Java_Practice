package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class nthLargest {

	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4,5,6,7,9,8,10,11,12,13,14,15,16,17,18};
		List<Integer> ls = new ArrayList<Integer>(Arrays.asList(arr));
		
	Integer it= ls.stream().map(v -> v).max(Integer::compare).get();
	 Collections.sort(ls , Collections.reverseOrder());
	Optional<Integer> itr= ls.stream().limit(4).skip(3).findAny();
	
	
	System.out.println(itr.get());

	}

}
