package com.sasi.competitiveProgramming;

//Binary Search method
public class SquareRootOfANumber2 {

	public static void main(String[] args) {
		
		int n = 169;
		
		System.out.println(findSquareRoot(n));

	}

	private static int findSquareRoot(int n) {
		
		int l=0;
		int r=n;
		int mid=0;
		while(l<=r)
		{
			 mid = (l+r)/2;
			
			if(mid*mid==n)
			{
				//System.out.println(mid);
				 return mid;
				
			}
			else if(mid*mid<n)
			{
				//System.out.println(l);
				 l=mid+1;
			}
			else 
			{
				//System.out.println(r);
				 r=mid-1;
			}
		}
		return mid;
		
	}

}
