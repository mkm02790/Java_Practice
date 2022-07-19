package Questions;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallest {

	public static void main(String[] args) {
	
			int arr[] = {7,10,4,3,20,15};
			int k=3;
			kthsmall(arr,k);
		}

	private static void kthsmall(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i =0;i<k;i++) {
			pq.offer(arr[i]);		
			}
		for(int i=k;i<arr.length;i++) {
			if(pq.peek() < arr[i]) {
				continue ;
							}
			if(pq.peek() >arr[i]) {
				pq.poll();
				pq.offer(arr[i]);
				
			}
			
		}
		System.out.println(pq.peek());
	}

	
}
