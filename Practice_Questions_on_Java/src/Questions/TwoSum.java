package Questions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoSum {

	public static void main(String[] args) {
		int [] al = {3,3};
		List<Integer> nums = IntStream.of(al)
                .boxed()
                .collect(Collectors.toList());
		
		int target = 6;
		
		for(int i=0;i<nums.size();i++) {
			for( int j=0 ;j <nums.size();j++  ) {
				
				if(nums.get(i) +nums.get(j) == target  && i != j) {
					System.out.println(i+" "+j);
					nums.remove(i);
					nums.remove(j-1);
					
				}
				
			}
		}
		
		
	}

}
