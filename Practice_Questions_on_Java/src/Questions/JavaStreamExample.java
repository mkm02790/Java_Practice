package Questions;
import java.util.*;
import java.util.stream.Collectors;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        productsList.add(new Product(6,"Asus Laptop",870f));
        productsList.add(new Product(7,"Realme Laptop",94500f));
        productsList.add(new Product(8,"Mi Laptop",9050f));
        productsList.add(new Product(9,"Redmi Laptop",6556f));
        productsList.add(new Product(10,"Xiomi Laptop",9300f));
        productsList.add(new Product(11,"vostro Laptop",32000f));
        productsList.add(new Product(12,"samsung Laptop",900232f));
       
        
        // All Laptop name at one place
       List<Product> laptop_Name ;
       productsList.stream().filter((p) -> p.name.startsWith("R")).forEach(System.out::println);
        
		/*
		 * Float totalPrice = productsList.stream() .map(product->product.price)
		 * .reduce(0.0f,(sum, price)->sum+price); // accumulating price
		 * System.out.println(totalPrice); // More precise code float totalPrice2 =
		 * productsList.stream() .map(product->product.price) .reduce(0.0f,Float::sum);
		 * // accumulating price, by referring method of Float class
		 * System.out.println(totalPrice2);
		 */
          
    }  
}  