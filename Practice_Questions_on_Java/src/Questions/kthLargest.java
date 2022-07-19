package Questions;


import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.*;

public class kthLargest {
	public static void main(String args[])	{
		int arr[] = {20,10,60,30,50,40};
		int k=3;
		kthlargest(arr,k);
	}

	private static int kthlargest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i =0;i<k;i++) {
		pq.offer(arr[i]);		
		}
		for(int i=arr.length - k ;i<arr.length;i++) {
			if(pq.peek()<arr[i]) {
				pq.poll();
				pq.offer(arr[i]);
			}
		}
		
			System.out.println(pq.peek());
		
		
		/*
		 * for(int i=0; i<arr.length ; i++) { if(pq.peek()<arr[i]) { pq.poll();
		 * pq.add(arr[i]); } }
		 */
		return pq.peek();
		
	}
	
}
