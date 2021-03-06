package com.sasi.competitiveProgramming;

public class RainwaterFill {

	public static void main(String[] args) {

		int[] arr = { 3, 0, 2, 0, 4 };
		int n = arr.length;
		System.out.println("total rain water accumualted" + " " + find_total_rainwater(arr, n));

	}

	private static int find_total_rainwater(int[] arr, int n) {
		int total_rainwater = 0;
		for (int i = 1; i < n - 1; i++) {
			int left_max = find_left_max(arr, n, i);
			int right_max = find_right_max(arr, n, i);
//			total_rainwater = total_rainwater + min(left_max, right_max) - arr[i];
			total_rainwater+=min(left_max, right_max) - arr[i];
		}
		return total_rainwater;

	}

	private static int min(int left_max, int right_max) {

//		int min=0;
//		if(left_max<right_max)
//		{
//			return min=left_max;
//		}
//		else
//		{
//			return min=right_max;
//		}

		return left_max < right_max ? left_max : right_max;

	}

	private static int find_right_max(int[] arr, int n, int index) {
		// to handle the negative scenario we are including the index also
		int max = 0;
		for (int i = 0; i <= index; i++) {
			if (arr[i] > arr[index]) {
				max = arr[i];
			}
		}
		return max;
	}

	private static int find_left_max(int[] arr, int n, int index) {

		int max = 0;
		for (int i = arr.length - 1; i >= index; i--) {
			if (arr[i] > arr[index]) {
				max = arr[i];
			}
		}
		return max;
	}

}
