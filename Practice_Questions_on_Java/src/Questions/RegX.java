package Questions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean result =validate(str);
		if(result==true) {
		System.out.println(str + " is valid email");
		}else {System.out.println("false email");}
	}
   public static boolean validate(String str) {
	   String regx ="^[a-zA-Z0-9._-]+@[a-zA-Z0-9_-]+$";
	return Pattern.matches(regx, str);
	
}}
