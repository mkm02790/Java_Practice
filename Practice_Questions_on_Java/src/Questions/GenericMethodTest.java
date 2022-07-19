package Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericMethodTest {
	  
	   public static <T> void printArray( ArrayList<T> anylist ) {
	 
	      for(T element : anylist) {
	         System.out.print(element);
	      }
	 
	   }

	   public static void main(String args[]) {
	     
	      Integer[] intArray = { 1, 2, 3, 4, 5 };
	      
	      
	      
	      ArrayList<Integer> al = new ArrayList<>(Arrays.asList(intArray));
	      printArray(al);
	   }
	}