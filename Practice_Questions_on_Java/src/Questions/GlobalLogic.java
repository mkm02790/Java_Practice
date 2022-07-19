package Questions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class GlobalLogic {

	private static int newFlag;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
	    int newk2=0;
		int flag =0;
		int newFlag = 0;
        int newk= 0;		
         nearest(num, newk ,flag);       
          }	

	private static void nearest(int Startingnum ,int newk , int flag) {
		
		if(Startingnum>0) {
       Map<Integer , Integer> diff = new HashMap<Integer , Integer>();
           for(int i=0;i<=Startingnum;i++) {
        	newk=(int) Math.pow(3, i);
        	if(newk<=Startingnum && newk>0)
        	diff.put(i,newk);       	
        	      	
         }		
           diff.entrySet().forEach(entry -> {
        	    System.out.println(entry.getKey() + " " + entry.getValue());
           });
        if(diff.size()>0) {
      int x= Collections.max(diff.values());         
         int newk2 =Startingnum-x;
             flag =flag+1;
			
			  System.out.println(x); 
			  System.out.println(" remaining "+newk2);
			  System.out.println(" iteration complete");
			  System.out.println(flag);
			 
             nearest(newk2, newk , flag);
             
         }
        
		}
	 
	}}


