 package com.sasi.competitiveProgramming;

public class BinarySearch2 {

	public static void main(String[] args) {
		
		int arr[] = {1,5,10,55,98,123,345};

		int x =123;
		
		
		int n = arr.length;
		
		System.out.println(searchTheArray(arr,n,x));
		
		
	}

	private static int searchTheArray(int[] arr, int n, int x) {
		int l = 0;
		int r= n-1;
		while(l<=r)
		{
			int mid = (l+r)/2;
			if(arr[mid]==x)
			{
				return mid;
			}
			else if(arr[mid]<x)
			{
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		return -1;
		
	}

}
