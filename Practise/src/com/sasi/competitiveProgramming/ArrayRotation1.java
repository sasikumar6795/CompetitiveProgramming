package com.sasi.competitiveProgramming;

public class ArrayRotation1 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 3;
		int n = arr.length;

		rotateArray(arr, n, d);
		printArray(arr);

	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	private static void rotateArray(int[] arr, int n, int d) {

		for (int i = 0; i < d; i++) {
			rotate(arr, n);
		}

	}

	private static void rotate(int[] arr, int n) {
		int temp = arr[0];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[n - 1] = temp;

	}

}
