package Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountPercentageoccrunceOfCharacterInAString {

	public static void main(String[] args) {
		String string = "Given a string and a character, the task is to make a function"
				+ "string using";

		HashMap<Character, Integer> hm = countRep(string);
        int sum =0;
		for (Entry<Character, Integer> entry : hm.entrySet()) {
			 sum=entry.getValue()+sum;
			System.out.println(entry.getKey() + " " + entry.getValue()+"% ");			
		}
		System.out.println(sum);
	}
	public static HashMap<Character, Integer> countRep(String string) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		char[] chr = string.replaceAll("[,\\s]", "").toCharArray();
		int length = chr.length;
		int count = 1;
		for (char it : chr) {
			if (!hm.containsKey(it)) {
				hm.put(it, 1);
			} else
				count = hm.get(it) + 1;
			hm.put(it, count);
		}
		hm = calculatePercentage(hm, length);
		return hm;
	}

	public static HashMap<Character, Integer> calculatePercentage(HashMap<Character, Integer> hm, int length) {
		Integer per = 0;

		for (Entry<Character, Integer> entry : hm.entrySet()) {
			per = (entry.getValue() * 100) / length;
			hm.put(entry.getKey(), per);
		}
		return hm;
	}

}
