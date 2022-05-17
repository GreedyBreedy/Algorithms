import java.util.*;

public class NQueens {
	static int numberofRowsandColumns = 0;
	void Solution(int ChessBoard[][])
	{
		for (int i = 0; i < numberofRowsandColumns; i++) {
			for (int j = 0; j < numberofRowsandColumns; j++)
				System.out.print(" " + ChessBoard[i][j]+ " ");
			System.out.println();
		}
	}
	boolean isSafe(int ChessBoard[][], int r, int c)
	{
		int i, j;
		for (i = 0; i < c; i++) {
			if (ChessBoard[r][i] == 1)
				return false;
		}
		for (i = r, j = c; i >= 0 && j >= 0; i--, j--)
			if (ChessBoard[i][j] == 1)
				return false;
		for (i = r, j = c; j >= 0 && i < numberofRowsandColumns; i++, j--)
			if (ChessBoard[i][j] == 1)
				return false;

		return true;
	}
	boolean KQueens(int ChessBoard[][], int c)
	{
		if (c >= numberofRowsandColumns)
			return true;
		for (int i = 0; i < numberofRowsandColumns; i++) {
			if (isSafe(ChessBoard, i, c)) {
				ChessBoard[i][c] = 1;
				if (KQueens(ChessBoard, c + 1) == true)
					return true;
				ChessBoard[i][c] = 0; 
			}
		}
		return false;
	}
	boolean NQueens()
	{
		int[][] ChessBoard = new int[numberofRowsandColumns][numberofRowsandColumns];
		for(int i=0;i<numberofRowsandColumns;i++) {
			for(int j=0;j<numberofRowsandColumns;j++) {
				ChessBoard[i][j]=0;
			}
		}
		if (!KQueens(ChessBoard, 0)) {
			System.out.print("no solution");
			return false;
		}

		Solution(ChessBoard);
		return true;
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		NQueens Q = new NQueens();
		numberofRowsandColumns=scan.nextInt();
		Q.NQueens();
	}
}