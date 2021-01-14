package com.sasi.competitiveProgramming;

public class CountNoOfOccurrences {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,3,3,3,9,10};
		int n = arr.length;
		int x =3;
		System.out.println(findOccurrences(arr, n, x));
		
		

	}

	private static int findOccurrences(int[] arr, int n, int x) {
		
		// index of the first occurences of x
		
		int i;
		
		// index of the last occurences of x
		
		int j;
		
		i= first(arr,0,n-1,x,n);
		
		return -1;
		
	}

	private static int first(int[] arr, int l, int r, int x, int n) {
		
		if(l<=r)
		{
			int mid=(l+r)/2;
			if((mid==0 || arr[mid-1]<x)&&arr[mid]==x )
			{
				return mid;
			}
			else if(x<arr[mid])
			{
				
			}
			
		}
		return -1;
	}

}
