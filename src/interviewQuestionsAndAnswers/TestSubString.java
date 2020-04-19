package interviewQuestionsAndAnswers;

public class TestSubString {

	public static void main(String[] args) {
		String s ="the quick fox jumps over the little lazy dog";
		
		//find the first non repetitive
		boolean found =false;
		
		for(int i=0; i <s.length();i++)
		{
			String searchItem =s.substring(i, i+1);
			
			for(int j=i+1;j <s.length();j++)
			{
				
				if (searchItem.equals(s.substring(j, j+1)))
					{
					System.out.println("The first repetitive item is "+ searchItem);
					 found = true;
					 break;
						
					}
				
				if(!found) break;
				found =false;
				
			}
			
			
			
		}
		

	}

}
