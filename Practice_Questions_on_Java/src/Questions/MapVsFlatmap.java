package streamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*To understand what flattening a stream consists in, consider a structure like [ [1,2,3],[4,5,6],[7,8,9] ] 
 * which has "two levels". 
 * Flattening this means transforming it in a "one level" structure : [ 1,2,3,4,5,6,7,8,9 ].*/
public class MapVsFlatmap {

	public static void main(String[] args) {

		List<MobileNo> list = getMob();
// With Map
		List<List<String>> listwithMap = list.stream().map((a) -> a.getMob()).collect(Collectors.toList());
// With FlatMap
		List<String> listWithFlatmap = list.stream().flatMap((a) -> a.getMob().stream()).collect(Collectors.toList());
        System.out.println("with map"+listwithMap);
        System.out.println("With flatmap" +listWithFlatmap);
	}

	public static List<MobileNo> getMob() {
		MobileNo mob = new MobileNo(Arrays.asList("12112", "1231313"));
		MobileNo mob1 = new MobileNo(Arrays.asList("534543", "25949684"));
		MobileNo mob2 = new MobileNo(Arrays.asList("2566", "651616"));
		MobileNo mob3 = new MobileNo(Arrays.asList("61616", "15165"));
		MobileNo mob4 = new MobileNo(Arrays.asList("56616164", "6548496"));
		MobileNo mob5 = new MobileNo(Arrays.asList("2649256949", "16149664"));
		List<MobileNo> ls = Arrays.asList(mob, mob1, mob2, mob3, mob4, mob5);
		return ls;	}
}

class MobileNo {
	List<String> mob;

	@Override
	public String toString() {
		return "MobileNo [mob=" + mob + "]";
	}

	public MobileNo(List<String> mob) {
		super();
		this.mob = mob;
	}

	public List<String> getMob() {
		return mob;
	}

}