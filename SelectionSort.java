import java.util.*;

public class SelectionSort {
	void SelSort(int[] A) {
		int tmp;
		for(int j=0;j<A.length;j++) {
			int min=j;
			for(int i=j+1;i<A.length;i++)
				if(A[i]<A[min])min=i;
			tmp=A[j];
			A[j]=A[min];
			A[min]=tmp;
		}
		for(int k=0;k<A.length;k++) {
		 System.out.println(A[k]);
		}
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt();
		int[] A = new int[x];
		for(int i=0;i<x;i++)
			A[i]=scan.nextInt();
		SelectionSort s= new SelectionSort();
		s.SelSort(A);
			
	}
}
