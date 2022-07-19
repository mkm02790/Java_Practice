package Questions;

public class MainSingelton {

	public static void main(String[] args) {
		Singelton sing = Singelton.getInstence();
		Singelton x = Singelton.getInstence();
		 
        // Instantiating Singelton class with variable y
        Singelton y = Singelton.getInstence();
 
        // Instantiating Singelton class with variable z
        Singelton z = Singelton.getInstence();
 
        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                           + x.hashCode());
        System.out.println("Hashcode of y is "
                           + y.hashCode());
        System.out.println("Hashcode of z is "
                           + z.hashCode());
 
        // Condition check
        if (x == y && y == z) {
 
            // Print statement
            System.out.println(
                "Three objects point to the same memory location on the heap i.e, to the same object");
        }
 
        else {
            // Print statement
            System.out.println(
                "Three objects DO NOT point to the same memory location on the heap");
        }
    }


	}


class Singelton{
	
	private static Singelton obj = new Singelton();
	
	public static Singelton getInstence() {
		
		return obj;
	}
	private Singelton() {}
	
}