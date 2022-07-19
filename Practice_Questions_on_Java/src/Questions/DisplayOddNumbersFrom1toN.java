package Questions;

import java.util.Scanner;

public class DisplayOddNumbersFrom1toN {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
       int num = sc.nextInt();
       
       for(int i=0;i<=num;i++) {
    	   if(!(i%2 == 0)) {
    		   System.out.println(i);
    	   }
       }
       
	}

}
