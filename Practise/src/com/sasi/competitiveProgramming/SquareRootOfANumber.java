package com.sasi.competitiveProgramming;

public class SquareRootOfANumber {

	public static void main(String[] args) {
		
		int n = 27;
		
		//findSquareRoot(n);
		System.out.println(findSquareRoot(n));

	}

	private static int findSquareRoot(int n) {
		
		for(int i=1;i<=n;i++)
		{
			if(i*i==n)
			{
				return i;
			}
			else if(i*i>n)
			{
				return i-1;
			}
		}
		return -1;		
	}

}
