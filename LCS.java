import java.util.Scanner;

public class LCS
	{

	int lcs( char[] FirstString, char[] SecondString, int length1, int n )
	{
		if (length1 == 0 || n == 0)
			return 0;
		if (FirstString[length1-1] == SecondString[n-1])
			return 1 + lcs(FirstString, SecondString, length1-1, n-1);
		else
			return max(lcs(FirstString, SecondString, length1, n-1), lcs(FirstString, SecondString, length1-1, n));
	}

	int max(int a, int b)
	{
		return (a > b)? a : b;
	}

	public static void main(String[] args)
	{
		Scanner scan  = new Scanner(System.in);
	
		LCS lcs = new LCS();
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();

		char[] X=s1.toCharArray();
		char[] Y=s2.toCharArray();
		int m = X.length;
		int n = Y.length;

		System.out.println("Length of LCS is" + " " +
								lcs.lcs( X, Y, m, n ) );
	}

}