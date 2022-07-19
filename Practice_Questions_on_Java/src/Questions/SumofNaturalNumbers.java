package Questions;

import java.util.Scanner;

public class SumofNaturalNumbers {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number");
	int num = sc.nextInt();
	/*
	 * int sum = (num * (num+1)) /2; System.out.println(sum);
	 */
	int i=1 ,sum=0;
  while(i<=num) {
	  sum =sum +i;
	  i++;
  }
  System.out.println(sum);
	}

}
