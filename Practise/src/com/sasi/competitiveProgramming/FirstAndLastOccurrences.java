package com.sasi.competitiveProgramming;

public class FirstAndLastOccurrences {

	public static void main(String[] args) {
		
		
		int [] arr = {1,2,5,7,7,7,7,11,45,69};
		int n=arr.length;
		System.out.println(n);
		int x=7;
		//System.out.println(first_Occurence(arr,n,x));
		//System.out.println(last_Occurence(arr,n,x));
		int count = (last_Occurence(arr, n, x) - first_Occurence(arr, n, x)) +1 ;
		System.out.println(count);

	}

	private static int last_Occurence(int[] arr, int n, int x) {
		
		int l=0;
		int r=n-1;
		while(l<=r)
		{
			int mid=(l+r)/2;
			if(arr[mid]==x&&(mid==n-1||arr[mid+1]!=x))
			{
				return mid;
			}
			else if(arr[mid]>x)
			{
				r=mid-1;
			}
			else
			{
				l=mid+1;
			}
		}
		
		return -1;
	}

	private static int first_Occurence(int[] arr, int n, int x)
	{
		int l=0;
		int r=n-1;
		while(l<=r)
		{
			int mid=(l+r)/2;
			//System.out.println(mid);
			
			if(arr[mid]==x&&(mid==0||arr[mid-1]!=x))
			{
				return mid;
			}
			else if(arr[mid]>=x)
			{
				r=mid-1;
			}
			else
			{
				l=mid+1;
			}
			
		}
		return -1;
		
	}

}
