package java8feature;

public interface FirstInterface {

	void print();
	
	default void show(){
		System.out.println("First Interface");
	}
	
}
