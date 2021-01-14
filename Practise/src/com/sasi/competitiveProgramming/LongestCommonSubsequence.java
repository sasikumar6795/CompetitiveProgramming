package com.sasi.competitiveProgramming;

import java.util.HashSet;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		
		int arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
		int arr2[] = { 1, 9, 3, 10, 4, 20, 2 }; 
		System.out.println(longestLength(arr2));

	}
	
	public static int longestLength(int[] arr)
	{
		HashSet<Integer> set = new HashSet<>();
		
		int ans=0;
		
		// add the elements in the hashing , this will remove the duplicates as well
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			//this will ensure the first element in the set
			if(!set.contains(arr[i]-1))
			{
				int j=arr[i];
				
				while(set.contains(j))
				{
					j++;
				}
				
				if(ans<j-arr[i])
				{
					ans=j-arr[i];
				}
			}
		}
		
		return ans;
		
	}

}
