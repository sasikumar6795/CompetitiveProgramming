package com.sasi.stringsPractise;

public class FunctionToCopyString {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "GeeksForGeeks";
		
		System.out.println(copyString(s1,s2));

	}
	
	public static String copyString(String s1, String s2)
	{
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = new char[s1.length()];
		String copiedString ="";
		
		for(int i=0;i<charArray1.length;i++)
		{
			charArray2[i]=charArray1[i];
		}
		
		for (int i = 0; i < charArray2.length; i++) {
			//System.out.println(charArray2[i]);
			copiedString+=charArray2[i];
		}
		return copiedString;
		
	}

}
