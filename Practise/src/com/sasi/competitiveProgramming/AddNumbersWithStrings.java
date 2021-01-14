package com.sasi.competitiveProgramming;

public class AddNumbersWithStrings {

	public static void main(String[] args) {

		String s1 = "186";
		String s2 = "7589";

		String reverse1 = reverse(s1);
		String reverse2 = reverse(s2);
		
		addTwoStrings(reverse1, reverse2);

	}

	private static void addTwoStrings(String reverse1, String reverse2)
	{
		
		
	}

	private static String reverse(String s) {

		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(s);

		return stringBuilder.reverse().toString();

	}

}
