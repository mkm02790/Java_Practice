package Questions;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargestandkthsmallest {
	public static int k  =3;
	public static int arr[] = {1,2,3,4,5,6,7,9,8,10,11,12,13,14,15,16,17,18};		
	public static void main(String[] args) {
		
		
	int kmax=kthmax(arr ,k);
	int kmin=kthmin(arr ,k);
	int sum=0;
	for(int i =0;i<arr.length ;i++) {
		if(arr[i]<kmax && arr[i]>kmin) {
			sum =sum +arr[i];
		}
	}
		
			System.out.println("kth maximum element is " +kmax +" and kth Minimum element is array is "+kmin);
			System.out.println("Sum of numbers lies between kth max and kth min is " +sum);
		
	}
	private static int kthmin(int[] arr2, int k2) {
		PriorityQueue<Integer> pqmin =  new PriorityQueue<>(Collections.reverseOrder());
		for(int i =0 ;i<k;i++) {
			pqmin.offer(arr[i]);}
		for(int i=k;i<arr.length ;i++) {	
		int largest = i;
		int left=2*i+1;
		int right= 2*i+2;
		if(arr[i]<pqmin.peek()) {
			pqmin.poll();
			pqmin.offer(arr[i]);
						}
		}
		return pqmin.peek();
		
	}
	private static int kthmax(int[] arr2, int k2) {
		PriorityQueue<Integer> pqmax =  new PriorityQueue<>();
		for(int i =0 ;i<k;i++) {
			pqmax.offer(arr[i]);
		}
		for(int i=k;i<arr.length ;i++) {
			int smallest = i;
			int left=2*i+1;
			int right= 2*i+2;
			if(arr[i]>pqmax.peek()) {
				pqmax.poll();
				pqmax.offer(arr[i]);
							}
			
		}
		return pqmax.peek();
	}
}
	


