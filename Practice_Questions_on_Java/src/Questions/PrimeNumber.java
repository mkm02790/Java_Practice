package Questions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int temp =0;
		int num=sc.nextInt();
		
		
		for(int i=2 ; i<num-1;i++) {
		if( num % i==0) {
			 temp++;
		}
		
		}
		System.out.println(temp);
         if(temp > 0) System.out.println("Number is not a prime number");
         else 
        	 System.out.println("Number is  a prime number");
		
		
	}

}
