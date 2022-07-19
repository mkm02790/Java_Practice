package Questions;

public class BuildHeap {

	
	static void heapify(int arr[], int n, int i)
	{
		int largest = i;
		int l = 2 * i;
		int r = 2 * i +1; 

		
		if (l <= n && arr[l] > arr[largest])
			largest = l;

		
		if (r <= n && arr[r] > arr[largest])
			largest = r;

		
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			
			heapify(arr, n, largest);
		}
	}

	
	static void buildHeap(int arr[], int n)
	{
		
		int startIdx = (n-1)/2;

	
		for (int i = startIdx; i >= 0; i--) {
			heapify(arr, n, i);
		}
	}

	
	static void printHeap(int arr[], int n)
	{
		System.out.println(
			"Array representation of Heap is:");

		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	
	public static void main(String args[])
	{
		
		int arr[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };

		int n = arr.length;

		buildHeap(arr, n);

		printHeap(arr, n);
	}
}
