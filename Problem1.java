import java.util.*;
public class Problem1 {

	int LCSMethod( char[] String1, char[] String2, int stringlength1, int stringlength2 )
	{
	    int Table[][] = new int[stringlength1+1][stringlength2+1];
	    for (int i=0; i<=stringlength1; i++)
	    {
	    	for (int j=0; j<=stringlength2; j++)
	    	{
	    		if (i == 0 || j == 0)
	    			Table[i][j] = 0;
	    		else if (String1[i-1] == String2[j-1])
	    			Table[i][j] = Table[i-1][j-1] + 1;
	    		else
	    			Table[i][j] = max(Table[i-1][j], Table[i][j-1]);
	    	}
	    }
	return Table[stringlength1][stringlength2];
	}
	
	int max(int a, int b)
	{
	    return (a > b)? a : b;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		String first= scan.nextLine();
		String second= scan.nextLine();
		Problem1 P= new Problem1();
		
		char[] CharOfFirstString=first.toCharArray();
		char[] CharOfSecondString=second.toCharArray();
		
		int length1 = CharOfFirstString.length;
		int length2 = CharOfSecondString.length;
		System.out.println(P.LCSMethod(CharOfFirstString, CharOfSecondString, length1, length2 ) );
	}
}
