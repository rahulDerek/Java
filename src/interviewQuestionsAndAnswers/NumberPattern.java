package interviewQuestionsAndAnswers;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,rc=5,m=5,num=1,j;
		
		for(i=1;i<=rc;i++){
			
			System.out.println();
			
			
			for(j=1;j<=m;j++)
			{
				System.out.print(num);
				num++;
				
			}
			
			m--;
			num=i+1;
			
		}
		
		
	
	}

}


