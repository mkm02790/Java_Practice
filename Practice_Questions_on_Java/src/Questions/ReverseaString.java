package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// String bulilder class does have a reverse function
public class ReverseaString {

	public static void main(String[] args) {
		
  String str= "Hello my name is mukul";
	/*
	 * char[] chtr =str.toCharArray(); char[] rev= new char[chtr.length]; for(int i=
	 * (chtr.length-1);i>0;i--) {
	 * 
	 * rev[] =chtr[i];
	 * 
	 * }
	 */
	/* StringBuilder stbr = new StringBuilder(str); */
  int len = str.length();
  String rev="";
  for (int i =len-1;i>=0;i--) {
	  rev=rev+str.charAt(i);
  }
  System.out.println(rev);
	}

}
