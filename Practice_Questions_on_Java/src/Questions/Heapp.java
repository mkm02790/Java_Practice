package Questions;

public class Heapp {

	public static void main(String[] args) {
		int a[] = {63,27,9,26,7587,6,6265};
		int n= a.length;
		System.out.println("before sorting");
		printarr(a,n);
		
		heapsort(a,n);
		
		
		System.out.println("After sorting");
		printarr(a,n);

	}

	private static void heapsort(int[] a, int n) {

		int startIdx = (n / 2) - 1;

		
		for (int i = startIdx; i >= 0; i--) {
			heapify(a, n, i);
		
		for(int j=n-1;j>=0;j--) {
			int temp=a[0];;
			a[0] =a[j];
			a[j]=temp;
			heapify(a, n, j);
		}}
		
	}

	private static void heapify(int[] a, int n, int i) {
		int largest =i;
		int l=2*i+1;
		int r=2*i+2;

		if(l<n && a[l] > a[largest]) {
			largest= l;
		}
		if(r<n && a[r] >a[largest]) {
			largest=r;
					}
	
		if(largest != i) {
			int temp =a[i];
			a[i] =a[largest];
			a[largest] =temp;
			heapify(a,n,i);
			
		}
	
	}
	
	
	private static void printarr(int[] a, int n) {
		for(int i =0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}

}
