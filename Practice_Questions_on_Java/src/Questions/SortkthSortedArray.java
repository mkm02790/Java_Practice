 package Questions;

import java.util.Iterator;
import java.util.PriorityQueue;

public class SortkthSortedArray {

	public static void main(String[] args) {
		 int k = 3;
	        int arr[] = {  6,2, 3, 12, 56, 8 };
	        int n = arr.length;
	        kSort(arr, n, k);
	        System.out.println("Following is sorted array");
	        printArray(arr, n);

	}

	private static void printArray(int[] arr, int n) {

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
		
	}

	private static void kSort(int[] arr, int n, int k) {
		PriorityQueue<Integer> pq =new PriorityQueue<>();
		
		for(int i=0; i<k+1 ;i++) {
			pq.offer(arr[i]);
		}
		int index= 0;
		for(int i=k+1 ;i<arr.length;i++) {
			arr[index] = pq.peek();index++;
			pq.poll();
			
			
			pq.offer(arr[i]);				
		}
		
		Iterator<Integer> itr = pq.iterator();
		while(itr.hasNext()) {
			arr[index] =pq.peek();
			pq.poll();
			index++;
			
		}
	}

}
