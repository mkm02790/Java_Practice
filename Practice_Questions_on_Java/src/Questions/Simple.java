package Questions;

/*#Reverse the array*/
import java.util.Scanner;
import java.util.Stack;

class Simple{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");		
		 int sizeOfArray = sc.nextInt();
		 int arr[] = new int[sizeOfArray];
		 for(int i= 0; i<sizeOfArray ;i++) {
			 arr[i] = sc.nextInt();
		 }
		 Stack<Integer> stk = new Stack<Integer>();
		 for(int obj:arr) {
			 stk.push(obj); 
		 } for(int a= 0; a<sizeOfArray ;a++) { 
			 Integer y = (Integer) stk.pop();
	            System.out.println(y);
	}
}}