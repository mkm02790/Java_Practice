package Questions;


class MergeSort
{
	
	void merge(int arr[], int l, int m, int r)
	{
		
		
			
		int n=arr.length;
		int b[] = new int[n];
		int i = l, j = m+1; 
		int k = l;
		
		while(i<=m &&j<=r) {
			if(arr[i]< arr[j])
			{
				b[k] =arr[i];k++;
			}
			else b[k]=arr[j];k++;
						
		}
  if(i>m) {
	 while(j<=r) {
		 b[k] =arr[j];
		 k++;
		 j++;
	 }
  }
  if(j<m) {
	 while(i>=m) {
		 b[k] =arr[i];
		 k++;
		 i++;
	 }
  }
		
		
		for(int p=0;p<=r;p++) {
			arr[p] = b[p];
		}
			
		}
		
		
	
	void sort(int arr[], int l, int r)
	{
		if (l < r) {
			
			int m =l+ (r-l)/2;			
			sort(arr, l, m);
			sort(arr, m + 1, r);			
			merge(arr, l, m, r);
		}
	}

	
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	
	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}

