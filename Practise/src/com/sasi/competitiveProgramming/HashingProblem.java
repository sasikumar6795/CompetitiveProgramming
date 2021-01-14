package com.sasi.competitiveProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashingProblem {

	public static void main(String[] args) {
		
		int arr[] = {1,9, 44, 10, 5, 33, 10, 41, 91 };
		
		System.out.println(containsDuplicates(arr));
		System.out.println(containDuplicates2(arr));

	}
	
	//method 2: o(n) and o(n)
	private static boolean containDuplicates2(int[] arr) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int x: arr)
		{
			if(set.contains(x))
			{
				return true;
			}
			set.add(x);
		}		
		return false;
		
	}

	//method 1: 0(nlogn)
	public static boolean containsDuplicates(int[] arr)
	{
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==arr[i+1])
			{
				return true;
			}
		}
		
		return false;
	}

}
