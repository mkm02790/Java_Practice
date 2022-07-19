package Questions;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
	 int n= sc.nextInt();
	 
		
	 int arr[] = new int[n];
	 System.out.println("Enter Element of array");
	 for(int i=0;i<n;i++) {
		 arr[i]= sc.nextInt();
		 	 }
	 for(int i=0;i<n;i++) {
		 System.out.println(arr[i]);
		 	 }
	 
	 
	}
	public static void swap(int arr[] ,int i,int j)
    {
      int  temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	public static void bubble(int arr[]) {
		int m= arr.length;
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				
			}
		}
		
	}
}
