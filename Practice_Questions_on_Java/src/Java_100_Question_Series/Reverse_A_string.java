package Java_100_Question_Series;

public class Reverse_A_string {

	public static void main(String[] args) {
	String str1 = "muk,  ul   kum   arm   aurya   ";
	String str = str1.trim().replaceAll("[,\\s]", "");
	
	
	
	StringBuffer sb= new StringBuffer(str);
	sb.reverse();
	System.out.println(sb);
	
	/*
	 * String newstr=""; for(int i=str.length()-1;i>=0;i--) { newstr = newstr
	 * +str.charAt(i);
	 * 
	 * // newstr=newstr+String.valueOf(str.charAt(str.length()-1-i)); }
	 * System.out.println(newstr);
	 */
	
	}

}
