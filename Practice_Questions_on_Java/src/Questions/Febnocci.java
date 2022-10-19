package Questions;

import java.util.Arrays;

public class Febnocci {

	public static void main(String[] args) {	
	int[] arr1 =febnocci2(5);
	System.out.println(Arrays.toString(arr1));
	
}
public static int[] febnocci2(int num){
	int[] arr = new int[num];
	 arr[0]=0;
	 arr[1]=1;
	for(int i=2;i<num ;i++) {
		arr[i]=arr[i-1] +arr[i-2];		
	}
return arr;
}
}