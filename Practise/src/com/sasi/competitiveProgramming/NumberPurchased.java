package com.sasi.competitiveProgramming;

import java.util.Arrays;

public class NumberPurchased {

	public static void main(String[] args) {
	
		int arr[] = { 1, 12, 5, 111, 200, 100, 10, 9, 12 , 15};
		
		int n = arr.length;
		
		int K =50;
		
		
		System.out.println(find(arr,n ,K));

	}

	private static int find(int[] arr, int n, int k) {
		
		Arrays.sort(arr);
		int count =0;
		
		if(n==0||k==0)
		{
			return 0;
		}
		else 
		{
			/*for (int i = 0; i < arr.length; i++) 
			{
				if(arr[i]<=k&&sum<=k)
				{
					sum=sum+arr[i];
					if(sum<=k)
					{
						count++;
					}
				}
			}*/
			int i=0;
			while(i<n&&k>arr[i])
			{
				count++;
				k=k-arr[i];
				i++;
			}
		}
		
		return count;
		
	}

}
