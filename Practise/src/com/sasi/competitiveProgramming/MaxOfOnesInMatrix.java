package com.sasi.competitiveProgramming;

public class MaxOfOnesInMatrix {

	public static void main(String[] args) {
		
		int mat[][] = {{0, 0, 1},
						 {0, 1, 1},
                         {1, 1, 1}
					   };
		int n= mat.length;
		System.out.println(maxNoOfOnes(mat, n));

	}

	private static int maxNoOfOnes(int[][] mat, int n) {
		int row = 0,i,j;
		for (i = 0, j = n - 1; i < n; i++)
		{
			while(j>=0&&mat[i][j]==1)
			{
				row=i;
				j--;
			}
		}
		return row;
		
	}

}
