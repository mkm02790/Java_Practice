package sorting;

import java.util.ArrayList;

public class Merge2SortedArray {

	public static void main(String[] args) {
		int a[] = {12,23,34,45,56,67,78,89};
		int b[] = {21,32,43,54};	
		ArrayList<Integer> al = new ArrayList<>();
		merge(a,b,al);
		

	}

	private static void merge(int[] a, int[] b, ArrayList<Integer> al) {
		int aleft=0;
		int bleft=0;
	while(aleft < a.length-1 && bleft < b.length-1) {	
		if(a[aleft] < b[bleft]) {
			al.add(a[aleft]);
			aleft++;
			
		}
		if(b[bleft] < a[aleft]) {
			al.add(b[bleft]);
			bleft++;
			
		}}
		if(aleft >= a.length-1) {
			while(bleft < b.length) {
				al.add(b[bleft]);
				bleft++;
				
							}
		}
		if(bleft >= b.length-1) {
			while(aleft < a.length) {
				al.add(a[aleft]);
				aleft++;
				
			}
		}
		System.out.println(al);
	
	}

	
		
}