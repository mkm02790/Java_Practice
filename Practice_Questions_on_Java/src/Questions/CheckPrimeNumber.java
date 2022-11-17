package Questions;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
     System.out.println("Enter a number");
     Scanner sc= new Scanner(System.in);
     int num = sc.nextInt();
     System.out.println(checkPrime(num));

	}
	
	
	public static  boolean checkPrime(int num) {
		boolean op =false ;
		if(num > 0 & num%2 !=0) {
			for(int i=2;i<num/2 ;i++) {
				if(num%i==0) {
					op=false;
				}else 
					op =true;
			}
			
		}else {
			return false;
			}
		
		return op;}

}
