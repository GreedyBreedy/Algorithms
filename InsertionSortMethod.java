import java.util.*;
public class InsertionSortMethod {
	void InsertionSort(int[] A) {
		int n= A.length;
		for(int i=1;i<n;i++) {
			int tmp=A[i];
			int k=i;
			while(k>0&&A[k-1]>tmp) {
				A[k]=A[k-1];
				k--;
			}
			A[k]=tmp;
		}
		for(int i=0;i<A.length;i++)
			System.out.println(A[i]);
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int x= scan.nextInt();
		int[] A = new int[x];
		for(int i=0;i<x;i++) {
			A[i]=scan.nextInt();
		}
		InsertionSortMethod ISM=new InsertionSortMethod();
		ISM.InsertionSort(A);
	}
}


