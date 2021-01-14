package com.sasi.competitiveProgramming;

import java.util.HashMap;
import java.util.Map;

public class ElectionWinner {

	public static void main(String[] args) {
	
		 String[] votes = { "john", "johnny", "jackie", 
                 "johnny", "john", "jackie", 
                 "jamie", "jamie", "john", 
                 "johnny", "jamie", "johnny", 
                 "john" }; 

		 findWinner(votes); 

	}
	
	private static void findWinner(String[] votes)
	{
		Map<String,Integer> map = new HashMap<>();
		
		for(int i=0;i<votes.length;i++)
		{
			if(map.containsKey(votes[i]))
			{
				
				Integer c = map.get(votes[i]);
				
				map.put(votes[i], ++c);
			}
			else
			{
				map.put(votes[i], 1);
			}
		}
		
		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.keySet() +" "+map.values());
		}
		
		int maxVoteCount=0;
		String winner ="";
		for(Map.Entry<String,Integer> entry : map.entrySet())
		{
			String key = entry.getKey();
			int value = entry.getValue();
			if(value>maxVoteCount)
			{
				winner=key;
				maxVoteCount=value;
				//System.out.println(winner);
			}
			
			//lexicographically comparing as we have johnny and john as same votes
			else if(value==maxVoteCount&&winner.compareTo(key)>0)
			{
				winner=key;
			}
			
		}
		System.out.println(winner);
	}

}
