package interviewQuestionsAndAnswers;

public class Repititve {

	public static void main(String[] args) {
		
		//String s ="the quick fox jumps over the little lazy dog";
		
		String s ="uuic";
		
		StringBuffer sbuffer =new StringBuffer();	
		
		while(s.length() > 0)
		{
		
		sbuffer.append(s.substring(0, 1));	
		s=s.replaceAll(s.substring(0,1), "");
		}
		System.out.println(" After Removing the duplicates "+sbuffer);
		
	}
			
}
