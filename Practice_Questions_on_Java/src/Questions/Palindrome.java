package Questions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number which needs to check wheather palndrome or not");
		String num = sc.nextLine();
		int len = num.length();
		System.out.println(len);
		String rev = "";
		int i = num.length() - 1;
		for (char ch : num.toCharArray()) {
			rev = rev + num.charAt(i);
			i--;
		}
		System.out.println(rev);
		if (num.equals(rev)) {
			System.out.println(num + " is Palindrome");
		} else
			System.out.println(num + " is not Palindrome");
	}

}
