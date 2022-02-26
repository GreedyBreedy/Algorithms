import java.util.Scanner;

public class HeapSort {
	public void sort(int A[])
    {
        int n = A.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(A, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            heapify(A, i, 0);
        }
    }
    void heapify(int A[], int n, int i)
    {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
 
        if (l < n && A[l] > A[largest])
            largest = l;
 
        if (r < n && A[r] > A[largest])
            largest = r;
 
        if (largest != i) {
            int swap = A[i];
            A[i] = A[largest];
            A[largest] = swap;
 
            heapify(A, n, largest);
        }
    }
 
   void printArray(int A[])
    {
        for (int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
    }
    public static void main(String args[])
    {
    	Scanner scan = new Scanner(System.in);
    	HeapSort Qs= new HeapSort();
		int n = scan.nextInt();
		for(int j=0;j<n;j++) {
			int x = scan.nextInt();
			int [] A = new int[x];
		for(int i=0;i<x;i++) {
			int c = scan.nextInt();
			A[i]=c;
			
		}
		Qs.sort(A);
		Qs.printArray(A);
		}
    }
}