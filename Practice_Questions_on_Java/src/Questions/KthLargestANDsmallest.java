package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestANDsmallest {	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Totel Number of Elements in Array");
		 int len = sc.nextInt();
		 int[] arr = new int[len];
		 System.out.println("enter elements of array");
		 for(int i=0;i<len;i++) {
			 arr[i] = sc.nextInt();
		 }
		 Arrays.sort(arr);
		 System.out.println("enter value of k");
		 int k = sc.nextInt();
		 System.out.println(arr[len-k]);
	 }
}
