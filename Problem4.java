import java.util.*;
public class Problem4
{
    void LargestSumPrinter(int Sequence[], int n)
    {
        int max = 0;
        int memo[] = new int[n];
        
        for (int i = 0; i < n; i++)
            memo[i] = Sequence[i];
        
        for (int i = 1; i < n; i++)
            for (int j = 0; j < i; j++)
                if (Sequence[i] > Sequence[j] && memo[i] < memo[j] + Sequence[i])
                    memo[i] = memo[j] + Sequence[i];
        
        for (int i = 0; i < n; i++)
            if (max < memo[i])
                max = memo[i];
  
        System.out.println(max);
    }
    public static void main(String args[])
    {
    	Problem4 P= new Problem4();
    	Scanner scan = new Scanner(System.in);
    	int sizeofinput=scan.nextInt();
    	int[] Sequence= new int[sizeofinput];
    	
    	for(int i=0;i<sizeofinput;i++)
    		Sequence[i]=scan.nextInt();
        P.LargestSumPrinter(Sequence, Sequence.length);
    }
}