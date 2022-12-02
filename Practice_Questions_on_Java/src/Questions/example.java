package Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class example {

	public static void main(String[] args) {
		List<Integer> ls =  Arrays.asList(1,2,3,4,5,5);
		HashSet<Integer> hs = new HashSet<>(ls);
		
		hs.add(5);
		System.out.println(hs);

	}

}
