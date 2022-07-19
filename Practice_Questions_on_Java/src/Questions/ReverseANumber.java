package Questions;

public class ReverseANumber {
//Reverse=Reverse*10+Reminder;     
	public static void main(String[] args) {
		  int number =123456;
		  int reverse =0,reminder=0;
		  while(number!=0) {
		  reminder =number%10;
		  reverse=reverse*10+reminder;
		  number=number/10;
		  }
		  System.out.println(reverse);
	}

}
