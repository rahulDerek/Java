package interviewQuestionsAndAnswers;

import java.util.StringTokenizer;

public class TestNumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hello where are you?";
		
		
		StringTokenizer st= new StringTokenizer(str);
		
		int numberOfWords=st.countTokens();
		System.out.println("Total number of words"+ numberOfWords);
		
		
		while(st.hasMoreElements())
		{
			
			System.out.println(st.nextElement());
		}
	}

}
