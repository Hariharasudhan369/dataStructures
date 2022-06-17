//$Id$
package recursion.Nqueens;

import java.util.Scanner;

public class nqueen {

	static int n;
	static int board[][];
	static boolean a = false;


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = 4;
		board = new int[n][n];
		solve(0);
		if(a)
			printBoard();
		else
			System.out.println("-1");


	}

	public static boolean validatePosition( int row, int col) {

		int i, j;
		for (i = 0; i < row; i++) {
			if (board[i][col] == 1) {

				return false;
			}
		}

		for (i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--)
		{
			if (board[i][j] == 1) {
				return false;        	        		
			}
		}

		for (i = row, j = col; i >= 0 && j < n; i--, j++) {        	
			if (board[i][j] == 1) {
				return false;        		
			}
		}

		return true;
	}

	public static void printBoard() {

		for(int i = 0;i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(board[i][j] +" ");
			}
			System.out.println();
		}

	}

	public static int solve(int row) {

		if(row >= n) {
			a = true;
			return 1;
		}

		for(int i = 0; i < n; i++) {

			if(validatePosition( row, i)) { 

				board[row][i] = 1;
				board[row][i] = solve(row+1);
				if(board[row][i] == 1) {
					return 1;
				}
			}
		}
		return 0;	 
	}


}
