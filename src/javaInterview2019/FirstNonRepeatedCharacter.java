package javaInterview2019;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char c = getFirstNonRepeatedChar("aabbddef");
		char c = getFirstNonRepeatedChar("java");
		System.out.println("The first non repeated character is "+ c);
	}
	
	public static char getFirstNonRepeatedChar(String str)
	{
		Map<Character,Integer> countMap = new LinkedHashMap<Character,Integer>(str.length());
		
		for(char ch :str.toCharArray())
		{
			countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch) + 1:1);
			
		}
		for( Entry<Character,Integer>  entry:   countMap.entrySet())
		{
			
			if (entry.getValue() == 1)
			{
				return entry.getKey();
			}
		}
		
		throw new RuntimeException("Did not find any nonrepeated character ");
	}

}
