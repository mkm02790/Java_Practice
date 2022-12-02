package Questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		int left = 3;
		int right = 8;
		List<Integer> list1 = new LinkedList<>(list);
		for (int i = left; i < right; i++) {

			list1.add(left, list.get(right));
		}

		System.out.println(list1);
	}

	public LinkedList<Integer> reverseBetween(List<Integer> list, int left, int right) {
		List<Integer> list1 = new LinkedList<>(list);
		for (int i = left; i < right; i++) {

			list1.add(left, list.get(right));
		}

		return (LinkedList<Integer>) list1;
	}

}
