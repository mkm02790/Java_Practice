package Questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NumberOfOccurenceOfaNumber {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
		
//		List<Integer> arr = Arrays.asList(13,13,32,13,3343,53,4343,23,23,43,2232,2232,10,10,10,10,12,12,13);
		List<Integer> arr = Arrays.asList(1,2,3,33,3,3,4,4,4,3,5,5,6,6,6,3,4,5,8,9,9,9,8,7);
		System.out.println(arr.size());
		int count =1;
		for (Integer it : arr) {
			if(!hm.containsKey(it)) {
				hm.put(it,count);
			}else {
				count = hm.get(it)+1;
				hm.put(it, count);
				}
					}
		
		
	for(Map.Entry<Integer, Integer>  entry: hm.entrySet()) {
		System.out.println(entry.getKey() +" "+ entry.getValue());		
	}
		
	}
}
