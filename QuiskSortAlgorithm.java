import java.util.Scanner;

public class QuiskSortAlgorithm {
	static void swap(int[] A, int i, int j)
	{
	    int temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	}
	 int partition(int[] A, int left, int right)
	{
	    int pivot = A[right];
	    int i = (left - 1);
	 
	    for(int j = left; j <= right - 1; j++)
	    {
	        if (A[j] < pivot)
	        {
	            i++;
	            swap(A, i, j);
	        }
	    }
	    swap(A, i + 1, right);
	    return (i + 1);
	}
	 void quickSort(int[] A, int left, int right)
	{
	    if (left < right)
	    {
	        int partition = partition(A, left, right);
	        quickSort(A, left, partition - 1);
	        quickSort(A, partition + 1, right);
	    }
	}
	void printArray(int[] A, int size)
	{
	    for(int i = 0; i < size; i++)
	        System.out.print(A[i] + " ");
	         
	    System.out.println();
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		QuiskSortAlgorithm  Qs= new QuiskSortAlgorithm ();
		int n = scan.nextInt();
		for(int j=0;j<n;j++) {
			int x = scan.nextInt();
		int[] A = new int[x];
		for(int i=0;i<x;i++)
			A[i]=scan.nextInt();
		Qs.quickSort(A, 0, x-1);
		Qs.printArray(A,A.length);
		}
		
	}
}
