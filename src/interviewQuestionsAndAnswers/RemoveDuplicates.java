package interviewQuestionsAndAnswers;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str ="the fox jumps under the tree";
		System.out.println(removeDuplicates(str));
	}
    
	public static String removeDuplicates(String str)
	{
		Set<Character> set =new HashSet<>();
		
		Set<Character> set1 =new HashSet<>();
		StringBuffer sf =new StringBuffer();
		
		StringBuffer sf1 =new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			Character c =str.charAt(i); //str.charAt(0) -->s
			
			if(!set.contains(c))
			{
				set.add(c);
				sf.append(c);
			}
			
			else
			{	
				set1.add(c);
				sf1.append(c);
			}
			
		}
		
		return sf.toString();
		
	}
}
