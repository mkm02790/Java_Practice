package Questions;

import java.util.HashMap;
import java.util.Map.Entry;

public class NumberOcceringOddNumberOfTIme {

	public static void main(String[] args) {

		Integer array[] = new Integer[] { 20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20, 50 };
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (Integer it : array) {
			if (!hm.containsKey(it)) {
				hm.put(it, 1);
			} else {
				Integer count = hm.get(it);
				count++;
				hm.put(it, count);
			}
		}
		for (Entry<Integer, Integer> me : hm.entrySet()) {
			if (me.getValue() % 2 != 0) {
				System.out.println(me.getKey() + " is occering odd number of time ");
			}
		}
		System.out.println("No key is occering odd number of time");
	}

}
