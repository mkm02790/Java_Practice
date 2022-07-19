package Questions;

//{ Driver Code Starts
import java.io.*;

class KadanesAlgorithm {
 
	public static void main (String[] args) throws IOException {
		int[] arr= {443,43,4,34,-1,-2 ,34354,65,656};
		    
		    Solution1 obj = new Solution1();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr));
		}
	}


//} Driver Code Ends


class Solution1{

 // arr: input array
 // n: size of array
 //Function to find the sum of contiguous subarray with maximum sum.
 long maxSubarraySum(int arr[]){
     
	 int size = arr.length;
     int max = Integer.MIN_VALUE;
    		 int current_max = 0;

     for (int i = 0; i < size; i++)
     {
         current_max = current_max + arr[i];
         if (max < current_max)
             max = current_max;
         if (current_max < 0)
             current_max = 0;
     }
     return max;
     }
     
    
 }
                     
   
 
