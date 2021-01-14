package com.sasi.competitiveProgramming;

public class ArrayRoation2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 3;
		int n = arr.length;
		
		arrayRotate(arr,d,n);
		printArray(arr);

	}
	
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}


	private static void arrayRotate(int[] arr, int d, int n) {
		int [] temp = new int[d];
		for(int i=0;i<d;i++)
		{
			temp[i]=arr[i];
		}
		
		for(int i=0;i<n-d;i++)
		{
			arr[i]=arr[i+1];
		}
		
		int j=1;
		for(int i=0;i<temp.length;i++)
		{
			arr[n-j]=temp[i];
			j++;
		}
		
	}

}
