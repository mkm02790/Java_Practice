package java8feature;

public class FunctInterfaceImplClass  {

	public static void main(String[] args) {
	/*	
		FunctInterface fun =  new FunctInterface() {
			@Override
			public int  addNum(int a, int b) {				
				return a+b;
			}};*/
						
		//	System.out.println(fun.addNum(2,3));
			
			FunctInterface fun1 = () ->  System.out.println("Hello in ");
			fun1.addNum();
			
	}
	
}
