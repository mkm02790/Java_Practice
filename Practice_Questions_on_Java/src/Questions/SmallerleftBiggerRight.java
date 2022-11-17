package Questions;
public class SmallerleftBiggerRight {

	public static void main(String[] args) {
		
		int arr[] = {4,1,27,26,4,62,3,13,5,2,62,4,4,5,3,20,5,456,33,6,222,33,62,3,633,33,63,3,6,3,614,3,63,6,3,23,13,6,10};
	 Obj obj=  methods(arr);
	 System.out.println("number is "+obj.a +" and index is " + obj.index);
	
		
}
	  public static Obj methods(int[] arr) {
		Obj ob =new Obj();
		ob.a=1;ob.index=0;
			for(int i =1 ;i<arr.length-1 ;i++) {
		    	 if(arr[i]>arr[i-1] & arr[i]<arr[i+1]) {
		    		ob.a =arr[i];
		    		ob.index =i;
		    		 break;
		    	 }else {
		    		 ob.a =-1;
		    	 }
		    	 
		    	 
		     }
			return ob;
		}}

class Obj {
	int a =0;
	int index =0;
}

