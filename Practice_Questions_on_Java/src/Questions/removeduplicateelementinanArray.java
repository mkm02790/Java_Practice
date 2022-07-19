package Questions;

import java.util.Arrays;

public class removeduplicateelementinanArray {

	public static void main(String[] args) {
		int[] arr = {13,13,32,3343,53,4343,23,23,43,2232,2232,10,10,10,10,12,12,13};
        Arrays.sort(arr);
        int length = arr.length;
        
        int[] temp = new int[length];
        int j=0;
        for(int i =0;i<length ;i++) {
        	if(arr[i] !=arr[i+1]) {
        		temp[j] = arr[i];
        		j++;
        	}
        	
        	System.out.println(temp);
        }
	}

}
