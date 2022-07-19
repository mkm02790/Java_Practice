package Questions;

import java.util.Scanner;

public class Factorial {
     
	public static void main(String[] args) {
		/*
		 * int fact=1; Scanner sc = new Scanner(System.in);
		 * System.out.println("enter a number for factorial"); int num= sc.nextInt();
		 * 
		 * for(int i=1;i<=num;i++) { fact =fact* i;
		 * 
		 * }System.out.println(fact);
		 */
		
	int fact =1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number");
	int num = sc.nextInt();
	for(int i =2;i<=num;i++) 
		fact = fact * i;		
	System.out.println(fact);
	}
}
