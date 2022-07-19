package Questions;

public class HelloGenarics {

	public static void main(String[] args) {
		TakeInput<String> ti = new TakeInput("hello");
		ti.printn();
	}

}
class TakeInput <T> {
	
	T aNumber;

	public TakeInput(T aNumber) {
		super();
		this.aNumber = aNumber;
	}
	
	public void printn() {
		System.out.println(aNumber);
	}
}