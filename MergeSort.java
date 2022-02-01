import java.util.*;

public class MergeSort {
	void merge(int arr[], int l, int m, int e) {
	    int n1 = m - l + 1;
	    int n2 = e - m;

	    int L[] = new int[n1];
	    int M[] = new int[n2];

	    for (int i = 0; i < n1; i++)
	      L[i] = arr[l + i];
	    for (int j = 0; j < n2; j++)
	      M[j] = arr[m + 1 + j];
	    int i, j, k;
	    i = 0;
	    j = 0;
	    k = l;
	    while (i < n1 && j < n2) {
	      if (L[i] <= M[j]) {
	        arr[k] = L[i];
	        i++;
	      } else {
	        arr[k] = M[j];
	        j++;
	      }
	      k++;
	    }
	    while (i < n1) {
	      arr[k] = L[i];
	      i++;
	      k++;
	    }

	    while (j < n2) {
	      arr[k] = M[j];
	      j++;
	      k++;
	    }
	  }
	  void mergeSort(int arr[], int l, int r) {
	    if (l < r) {
	      int m = (l + r) / 2;

	      mergeSort(arr, l, m);
	      mergeSort(arr, m + 1, r);
	      merge(arr, l, m, r);
	    }
	  }
	  static void printArray(int arr[]) {
	    int n = arr.length;
	    for (int i = 0; i < n; ++i)
	      System.out.print(arr[i] + " ");
	    System.out.println();
	  }
public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	 MergeSort MS = new MergeSort();
	 int n= scan.nextInt();
	 int[] A= new int[n];
	 for(int i=0;i<n;i++)
		 A[i]=scan.nextInt();
	 MS.mergeSort(A, 0, n-1);
	 printArray(A);
		 
}

}
