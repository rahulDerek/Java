package interviewQuestionsAndAnswers;

public class RectangularPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rc=5,startingnum;
		
		for(int i=1;i<=rc;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(i);	
			}
				// startingnum=rowcount+1;
				
					startingnum =i+1;
				
					for(int k=startingnum;k<=5;k++)
					{
							System.out.print(k);
				
					}	
							System.out.println();
				}
					
			
			
			
		}
		
	}


