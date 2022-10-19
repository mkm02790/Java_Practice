package Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class stream_sumofthenumbers {

	public static void main(String[] args) {
		List<Integer> ls =Arrays.asList(1,2,3,4,5,6,7,8,9);
//		Optional<Integer> op =ls.stream().reduce((s ,c) ->  s+c);
//		System.out.println(op);
		
	double d =	ls.stream().mapToInt(e -> e).average().getAsDouble();
	System.out.println(d);

	}

}
