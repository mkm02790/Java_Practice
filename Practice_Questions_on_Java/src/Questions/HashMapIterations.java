package Questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterations {


	public static void main(String[] args) {
		
		HashMap<Integer ,String> hm = new HashMap<Integer, String>();
		
		    hm.put(10, "Geeks"); 
	        hm.put(15, "4"); 
	        hm.put(20, "Geeks"); 
	        hm.put(25, "Welcomes"); 
	        hm.put(30, "You"); 
	        hm.put(34, "india");
	        
	// Firstway of Iterations
	        for(Map.Entry<Integer, String> me : hm.entrySet()) {
	        	System.out.println("key = " + me.getKey()+ ", value =" +me.getValue());	  	        	
	        }
	        System.out.println("--------------------------------------");
    //  Secondway of Iterations
	        hm.forEach((k,v) -> System.out.println("key = " + k + ", value =" +v));
	        System.out.println("--------------------------------------");
	// thridway
	     Iterator<Entry<Integer ,String>> es = hm.entrySet().iterator();
	     while(es.hasNext()) {
	    	Entry<Integer ,String> etr= es.next();
	    	System.out.println("Key = " +etr.getKey()+ "Value" +etr.getValue());
	    	
	     } System.out.println("--------------------------------------");
	        
	 //4th way
	    Iterator<Integer>  ite = hm.keySet().iterator();
	    
	    while (ite.hasNext()) {
	    int key =	ite.next();
			System.out.println("key = " +key+ "value = " +hm.get(key));
			
		}
	}

}
