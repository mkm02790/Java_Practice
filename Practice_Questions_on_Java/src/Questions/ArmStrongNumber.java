package Questions;

import java.util.Scanner;

// parsing String to integer int num1=Integer.parseInt(num);  
// power of number Math.pow(N, P);
// character to Integr 
//  Char -> String -> Integer
// Integer.parseInt(String.valueOf(char));
public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pow = 0;
		System.out.println("Enter a Number");
		String num = sc.nextLine();
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


