package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
// String bulilder class does have a reverse function
public class ReverseaString {

	public static void main(String[] args) {
		
  String st= "Hello my name is mukul";
	String reverse=reverseStringUsingStack(st);
  String rverseString =reverse(st);
// System.out.println(rverseString);
  System.out.println(reverse);
	/*
	 * int len = str.length(); String rev=""; for (int i =len-1;i>=0;i--) {
	 * rev=rev+str.charAt(i); } System.out.println(rev);
	 */
	}
static String reverse(String st) {
	
	/*
	 * String str =st; String rev = ""; int strln=str.length(); while(strln>0) {
	 * rev=rev+ str.charAt(strln-1); strln--; }
	 */
	  
	String str =st;
	String rev= "";
	int strln= str.length();
	while(strln>0) {
		rev =rev +str.charAt(strln-1);
		strln--;
	}
	  return rev;
	 
}
	
static String reverseStringUsingStack(String str) {
	String rev ="";
	str.replaceAll("//s", "");	
	Stack<String> stackList =new Stack<String>();	
		stackList.add(str);
		while(stackList.size()>0) {
			rev = rev+stackList.peek();
			stackList.pop();
		}	
	return rev;
	
}
}
