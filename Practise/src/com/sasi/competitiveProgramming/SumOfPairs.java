package com.sasi.competitiveProgramming;

import java.util.HashSet;
import java.util.Set;

public class SumOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//sort the array  o(n) o(nlogn)
		int arr[] = {5,10,13,15,20,30,60,70};
		
		int sum =45;
		
		//System.out.println(sumPairs(arr,sum));
		System.out.println(sumPairsHashing(arr,sum));
			
		}

	private static boolean sumPairsHashing(int[] arr, int sum) 
	{
		Set<Integer> hashSet = new HashSet<>();;
		for(int i=0;i<arr.length;i++)
		{
			
			
			int temp=sum-arr[i];
			if(hashSet.contains(temp))
			{
				System.out.println("element" + " "+ arr[i]+" "+temp);
				return true;
			}
			hashSet.add(arr[i]);
		}
		return false;
	}

	private static boolean sumPairs(int[] arr, int sum) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j=arr.length-1;
		
		while(i<=j)
		{
			if(arr[i]+arr[j]>sum)
			{
				j--;
			}
			else if(arr[i]+arr[j]<sum)
			{
				i++;
			}
			else
			{
				return true;
			}
		
	    }
		return false;
		
		
	}

}
