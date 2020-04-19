package javaInterview2019;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DisplayDuplicateCharacterDemo {

	public static void main(String[] args) {
		
		
		String str ="java";
		
		duplicateDemo(str);

	}
	
	public static void duplicateDemo(String str)
	{
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		char[] characters = str.toCharArray();
		
		for(char c :characters)
		{
			
			if(!map.containsKey(c))
			{
				map.put(c, 1);

			}
			else
			{
				map.put(c, map.get(c)+1);
				
			}
			
		}
		
		Set<Map.Entry<Character, Integer>> eSet =map.entrySet();
		
		for(Map.Entry<Character, Integer> entry: eSet)
		{
			
			if(entry.getValue() > 1)
			{
				System.out.println("Print "+entry.getKey() +": "+entry.getValue());
				
			}
		}
	}

}
