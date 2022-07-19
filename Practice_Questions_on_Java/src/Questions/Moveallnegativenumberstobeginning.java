package Questions;

import java.util.Scanner;

public class Moveallnegativenumberstobeginning {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n= sc.nextInt();
		int[] arr = new int[n];
		int x = 0;
try {		for(int i=0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
}
catch(Exception e) {
    System.out.println("Something went wrong.in 1st part");
  }
	try {	for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[j]<0) {
				x =arr[i];
					arr[i]=arr[j];
					arr[j]=x;
					i++;
				}
			}
			
	}	}
	catch(Exception e) {System.out.println("error in 2nd part");}
			
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
