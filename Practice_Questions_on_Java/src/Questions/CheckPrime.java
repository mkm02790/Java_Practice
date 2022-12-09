package Questions;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		var num = sc.nextInt();
		
	  
		int n1=0;
		for(int i=2;i<num/2;i++) {			
		 n1 =num % i;
		  if(n1==0) {
			  break;
		  }
		}
		
if(!(n1==0) || num==2)System.out.println("Number is  a prime nubmer");
else System.out.println("Number is not prime number");		
		
		

	

}
}