package pattern;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		patternOntheSide();
		
		  int number =4;
		  
		  
		  for(int i=1;i<=number;i++) {
		  
		  for(int j=1;j<=number;j++) { System.out.print('*');
		  
		  }
		  
		  System.out.println(); }

	}
	
	public static void patternOntheSide()
		{

		int num =4;
		
		for(int i=1; i <=num;i++)
		{

			for(int j=1;j<=num;j++)
			{

				if(i==1 || i==4||j==1 ||j==4)
				{
					System.out.print('*');
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
