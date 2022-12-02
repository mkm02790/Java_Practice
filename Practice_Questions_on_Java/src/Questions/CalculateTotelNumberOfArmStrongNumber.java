package Questions;

import java.util.Scanner;

public class CalculateTotelNumberOfArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pow = 0;
		System.out.println("Enter a Number");
		String num = "11";
		
		int len = num.length();
		char[] chr = num.toCharArray();
		
		for (char ch : chr) {
			int integer = Integer.parseInt(String.valueOf(ch));
 			pow = pow + (int) Math.pow(integer,len );
		}
		
        if(Integer.parseInt(num)==pow) {
        	System.out.println(num+" Number is armstrong number");
        }else
       	    System.out.println(num+" Number is not armstrong");}

}
