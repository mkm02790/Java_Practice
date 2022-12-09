package Java_100_Question_Series;

import java.util.ArrayList;
import java.util.Arrays;

/*Have the function ArrayAddition(arr) take the array of numbers stored in arr and return the string true if any combination of numbers in the array
(excluding the largest number) can be added up to equal the largest number in the array, otherwise return the string false.
For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true because 4 + 6 + 10 + 3 = 23. 
The array will not be empty, will not contain all the same elements, and may contain negative numbers.
Examples
Input: new int[] {5,7,16,1,2}
Output: false
Input: new int[] {3,5,-1,8,12}
Output: true*/
public class ArrayAddition {

	public static void main(String[] args) throws Exception {
		int[] arr = new int[]{5,7,16,1,2};
		System.out.println(ArrayAddition.ArrayAdditions(arr));
		
	}
	
	public static boolean ArrayAdditions(int[] arr) throws Exception{
		if(arr.length < 0 ) {
			throw new Exception();
		}
			
		Arrays.sort(arr);
		int largestElement=arr[arr.length-1];
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0 ;i<arr.length-1 ;i++) {
			if(largestElement!=arr[i]) {
				al.add(arr[i]);
			}
		}
	int sum =al.stream().reduce((a ,b) -> a+b).get();
	if(sum < largestElement)
		return false;
	else return true ;
		}

}

