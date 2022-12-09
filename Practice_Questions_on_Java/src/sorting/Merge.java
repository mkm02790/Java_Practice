package sorting;

public class Merge {

	public static void main(String[] args) {
	int arr[] =  {1,3,5,7,9};
	int brr[] =  {2,4,6,8,10,11,12,13,14,15};
	merger(arr,brr);
	}

	
static void merger(int arr[], int brr[]) {
	int al=0;
	int bl=0;
	int k=0;
	int ar=arr.length-1;
	int br=brr.length-1;
	int n=arr.length+brr.length;
	int krr[] = new int[n];
	while(al<= ar && bl<=br) {
		
	if(arr[al]<brr[bl]) 
	{
		krr[k] = arr[al];
		
		al++;
		}
	else {
		krr[k] =brr[bl];
		bl++;
		}
	
	k++;	
	
}
	if(al>ar) { 
		while(bl<=br) {
			krr[k]=brr[bl];
			k++;
			bl++;
			}}
		
		else if(bl>br) { 
			while(al<=ar) {
			krr[k] = arr[al]; 
			k++;
			al++;
		 }}
	
	for(int j=0;j<n;j++) {
	System.out.println(krr[j]);
}
	}
}
/*
 * if(al>=ar) { krr[k]=brr[bl]; bl++; } else if(bl>br) { krr[k] = arr[al]; al++;
 * }
 */