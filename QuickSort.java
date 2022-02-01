import java.util.Scanner;

public class QuickSort {
	 void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	int Pivotorpartition(int[] A, int low, int high)
	{
	    int pivot = A[high];

	    int i = (low - 1);
	 
	    for(int j = low; j <= high - 1; j++)
	    {
	        if (A[j] < pivot)
	        {
	            i++;
	            swap(A, i, j);
	        }
	    }
	    swap(A, i + 1, high);
	    return (i + 1);
	}
	void quickSort(int[] arr, int low, int high)
	{
	    if (low < high)
	    {
	        int k = Pivotorpartition(arr, low, high);
	        quickSort(arr, low, k - 1);
	        quickSort(arr, k + 1, high);
	    }
	}
	void printArray(int[] A)
	{
	    for(int i = 0; i < A.length; i++)
	        System.out.println(A[i]);
	         
	    System.out.println();
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] A = new int[n];
		for(int i=0;i<n;i++)
			A[i]=scan.nextInt();
		QuickSort Qs= new QuickSort();
		Qs.quickSort(A, 0, n-1);
		Qs.printArray(A);
		
	}
}
