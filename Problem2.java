import java.util.*;
public class Problem2 {
	static int Table[][] = null;
	public static int RODCUTMETHOD(int priceofrodforeachlength[], int length[],int lengths, int n)
	{

		if (n == 0 || lengths == 0) {
			return 0;
		}
		if (length[n - 1] <= lengths) {
			Table[n][lengths] = Math.max(
					priceofrodforeachlength[n - 1]+ RODCUTMETHOD(priceofrodforeachlength, length,lengths - length[n - 1], n),
					RODCUTMETHOD(priceofrodforeachlength, length, lengths, n - 1));
		}

		else {
			Table[n][lengths]= RODCUTMETHOD(priceofrodforeachlength, length, lengths, n - 1);
		}
		return Table[n][lengths];
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int[] priceofrodforeachlength= new int[n];
		for(int i=0;i<n;i++) {
			priceofrodforeachlength[i]=scan.nextInt();
		}
		int[] length = new int[n];
		for(int i=0;i<n;i++) {
			length[i]=i+1;
		}
		int len = n;
		Table= new int[n+1][n+1];
		System.out.println(RODCUTMETHOD(priceofrodforeachlength,length,n,len));
	}
}
