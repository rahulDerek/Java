package interviewQuestionsAndAnswers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class TestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name ="The fox run over";
			
			//Find the duplicate
			
		Map<Character,Integer> charMap =new HashMap<Character,Integer>();
			
		 char[] chars = name.toCharArray();
		// System.out.println(chars);
		 for( Character  ch:chars)
		 {
	
		 if (charMap.containsKey(ch))
			 {
				 
				 charMap.put(ch, charMap.get(ch)+1);
			 }
		 else
		 {
			 charMap.put(ch, 1);
		 }
		 }	 
		 
		 Set<Character>	keys=charMap.keySet();
		 
		 for(Character val:keys)
		 {
			 if(charMap.get(val) > 1)
			 {
				 System.out.println(val +"   "+charMap.get(val));
			 }
			 
		 }
		 
		
		 }
	
	
	
	
	

}