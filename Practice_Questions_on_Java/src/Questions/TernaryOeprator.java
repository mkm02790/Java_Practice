package Questions;

import java.util.Scanner;

public class TernaryOeprator {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc= new Scanner(System.in);
		int num =sc.nextInt();

		if(num ==1) {System.out.println(num);}
		else if (num ==2) {System.out.println(num);}
		else if (num ==3) {System.out.println(num);}
		else if (num ==4) {System.out.println(num);}
		else if (num ==5) {System.out.println(num);}
		else if (num ==6) {System.out.println(num);}
		else if (num ==7) {System.out.println(num);}
		else if (num ==8) {System.out.println(num);}
		else if (num ==9) {System.out.println(num);}
		else if (num ==10) {System.out.println(num);}
//		Object obj = (condition == true)? Excute This : otherWiseExcute This;
		String str = (num ==1) ? "one" :(num==2) ? "Two" : (num ==3) ? "Three" : (num ==4)? "Four" :(num ==5)? "Five" : (num ==6) ? "Six" :"Number is greator that six"   ;                                                   
	    System.out.println(str);
	}

}
