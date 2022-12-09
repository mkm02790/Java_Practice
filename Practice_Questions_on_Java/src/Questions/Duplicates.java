package Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class Duplicates{

	public static void main(String[] args) {
		
		
      List<Integer> list =Arrays.asList(1,2,3,43,121,342,1,1,3,4,4,4,5,6,5);
 }
	
	static HashSet<Integer> withhashSet(List<Integer> list)
	 {
			HashSet<Integer> hs = new HashSet<>();
			HashSet<Integer> hs1 = new HashSet<>();
			for (Integer itr : list) {
				if(hs.add(itr)) {				
				}else hs1.add(itr);
				}
			System.out.println(hs1);
			return hs1;
			
	 }

	 
}
