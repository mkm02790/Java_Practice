package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Firstandlasoccurrencesofx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int x = sc.nextInt();
		int [] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		/*
		 * List<Integer> al = new ArrayList<Integer>(Arrays.asList(arr)); for(int a:al)
		 * { al.add(a); System.out.println(a); } List<Integer> str=
		 * al.stream().collect(Collectors.toList());
		 */
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
			  
					System.out.println(list);
			
	}

}
