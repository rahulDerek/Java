package javaInterview2019;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "java";
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		char[] ch = str.toCharArray();
		
		
		for(Character c :ch)
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
		
	Set<Entry<Character,Integer>>  entry  = map.entrySet();
	
	//we need to extract the values from entry
	
	for( Entry<Character,Integer>   eval :entry)
	{
		
			/*
			 * if(eval.getValue() > 1) {
			 * 
			 * System.out.println("Duplicate "+eval.getKey() +":"+eval.getValue()); }
			 */
		
		if(eval.getValue() == 1)
		{
			Character v = eval.getKey();
			
			System.out.println("The character is "+v);
			
			
			//System.out.println("One time occurence "+eval.getKey() +":"+eval.getValue());
		}
	}
	
	
	
	}

}
