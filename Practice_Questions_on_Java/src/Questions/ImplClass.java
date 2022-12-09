package java8feature;

public class ImplClass implements FirstInterface,SecondInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
				
	}

	@Override
	public void show() {
		
		FirstInterface.super.show();
	}

}
