package interviewQuestionsAndAnswers;

public class StringManipulation {

	public static void main(String[] args) {
		String s="the quick brown fox jumps over the little lazy dog";
		
		
		StringBuffer res= new StringBuffer();
		
		while(s.length() >0)
		{
			res.append(s.substring(0,1));
			//System.out.println(s.substring(0,1));
			s=s.replaceAll(s.substring(0,1), "");
			//System.out.println(s);
			
		}
		
		System.out.println("result  " + res);
		
		
		
		
		/*
		 * String[] resultArr=s.split("\\s+"); System.out.println(resultArr.length); for
		 * (int i=0; i< resultArr.length; i++) { System.out.println(resultArr[i]); }
		 */

	}

}