package com.sasi.competitiveProgramming;

public class BooleanMatrixQuestion {

	public static void main(String[] args) {
		
		
		 int mat[ ][ ] = { {1, 0, 0, 1}, 
                 		   {0, 0, 1, 0}, 
                 		   {0, 0, 0, 0},
                 		 };
		 System.out.println("Before converting");
		 
		 printMatrix(mat,3,4);
		 convertMatrix(mat, 3,4);
		 
		 System.out.println("After converting");
		 
		 printMatrix(mat, 3, 4);
             

	}

	private static void printMatrix(int[][] mat, int m, int n) {
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

	private static int[][] convertMatrix(int[][] mat, int m, int n)
	{
		//create a empty matrix ,initialize the matrix with 0
		int row[] = new int[m];
		int col[] = new int[n];
		
		for(int i=0;i<m;i++)
		{
			row[i]=0;
		}
		
		for(int j=0;j<n;j++)
		{
			col[j]=0;
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(mat[i][j]==1)
				{
					row[i]=1;
					col[j]=1;
				}
			}
		}
		
		 for (int i = 0; i < m; i++) 
	        { 
	            for (int j = 0; j < n; j++) 
	            { 
	                if ( row[i] == 1 || col[j] == 1 ) 
	                { 
	                    mat[i][j] = 1; 
	                } 
	            } 
	        } 
		return mat;
		
	}

}
