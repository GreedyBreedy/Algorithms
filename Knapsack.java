import java.util.*;
class Knapsack {
	static int max(int a, int b)
	{
	return (a > b) ? a : b;
	}
	static int knapSack(int Weight, int ListOfWeights[], int value[], int n)
	{
		if (n == 0 || Weight == 0)
			return 0;
		if (ListOfWeights[n - 1] > Weight)
			return knapSack(Weight, ListOfWeights, value, n - 1);
		else
			return max(value[n - 1]
					+ knapSack(Weight - ListOfWeights[n - 1], ListOfWeights,
								value, n - 1),
					knapSack(Weight, ListOfWeights, value, n - 1));
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int val[] = new int[] { 60, 100, 120 };
		int wt[] = new int[] { 10, 20, 30 };
		int W = 50;
		int legthoflists = val.length;
		System.out.println(knapSack(W, wt, val, legthoflists));
	}
}