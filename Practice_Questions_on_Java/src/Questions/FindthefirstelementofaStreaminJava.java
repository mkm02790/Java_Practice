package Questions;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindthefirstelementofaStreaminJava {

	public static void main(String[] args) {
		
	   /* List<Integer> al  =   Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int num :al)
		{
			if(!(set.add(num))) {
			int	dupli =num;
			System.out.println(dupli);
			
			}*/
		char ch ='u';	
		String str = "berberbreui u u u rieuhirue rieuhr urirjrioe hr rreuhioreer uvrie reg uhioervhre houiergre vrueviea danrioerv ";
		char[]  str1 = str.toCharArray();
			Stream<char[]> stchr =Stream.of(str1);
		
			
			  int count =0; for(char cha : str1) { if(cha==ch){ count++;
			  
			  }
			  
			  }
			 
			
		System.out.println("character " +ch+" appears in this String " +count+" times");
		
			}	
	
     
	}

	

