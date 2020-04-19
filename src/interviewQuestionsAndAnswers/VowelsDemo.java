package interviewQuestionsAndAnswers;

import java.util.ArrayList;
import java.util.List;

public class VowelsDemo {

	public static void main(String[] args) {
		
		String vow ="The ice is about to ";
		
		StringBuffer sb =new StringBuffer();
		
		
		StringBuffer sb1 =new StringBuffer();
		
		List list =new ArrayList();
		
		int count =0;
		char[] ch =vow.toCharArray();
		
		for(Character checkCh:ch)
		{
			
			if((checkCh =='a')||(checkCh =='e')||(checkCh =='i') ||(checkCh =='o') || (checkCh =='u'))
			{
				
				list.add(checkCh);
				sb.append(checkCh);
				count++;
			}
			
			else
			{
				sb1.append(checkCh);
				
			}
			
			
		}
		System.out.println( "Number or count of vowels in the given string is "+count  + "and the vowels are "+sb);
		
		System.out.println("The consonants appeared in the string are  "+sb1);
	}

}
