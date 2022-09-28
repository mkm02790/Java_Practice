package Java_100_Question_Series;

public class Method_Overriding {

	public static void main(String[] args) {
	SBI sbi = new SBI();
	PNB pnb = new PNB();
	System.out.println(sbi.getIntrest());
	System.out.println(pnb.getIntrest());

	}

}
abstract class Bank 
{
  abstract float getIntrest();
}	
class SBI extends Bank {

	@Override
	float getIntrest() {
		
		return 7.5f;
	}}
class PNB extends Bank {
	float getIntrest() {
		return 5.6f;
		
	}
	
}