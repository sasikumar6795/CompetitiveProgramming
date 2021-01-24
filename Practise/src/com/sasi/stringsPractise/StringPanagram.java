package com.sasi.stringsPractise;

public class StringPanagram {

	public static void main(String[] args) {
	
		String str = "The quick brown fox jumps over the lazy dog"; 
		
		checkPanagram(str);
		
		if(checkPanagram(str))
		{
			System.out.println("The given string is a panagram");
		}
		else
		{
			System.out.println("The given string is not a panagram");
		}

	}
	
	public static boolean checkPanagram(String str)
	{
		boolean mark[] = new boolean[26];
		for(int i=0;i<str.length();i++)
		{
			int index=0;
			
			if('A'<=str.charAt(i)&&str.charAt(i)<='Z')
			{
				index=str.charAt(i)-'A';
				System.out.println("uppercharacer"+index);
			}
			else if('a'<=str.charAt(i)&&str.charAt(i)<='z')
			{
				index=str.charAt(i)-'a';
				System.out.println("lowerCharacter"+index);
			}
			else
			{
				continue;
			}	
			mark[index]=true;
		}
		
		for (int i = 0; i <=25; i++) 
		{
			if(mark[i]==false)
			{
				return false;
			}
			
		}
		return true;
	}

}
