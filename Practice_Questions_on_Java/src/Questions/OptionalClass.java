package Questions;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		
		Optional<Integer>  op =Optional.of(10/0);
		System.out.println(op);

	}

}
