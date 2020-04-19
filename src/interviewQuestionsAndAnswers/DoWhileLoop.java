package interviewQuestionsAndAnswers;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		
		int num =0;
		
		do
		{
			System.out.println("Enter an integer");
			
			num =ip.nextInt();
			
			if((num %2)!= 0)
			{
				System.out.println("OOPS! you entered an odd number TERMINATION");
				
			}
			else
				System.out.println("It is an even number");
			
			
		}
		
		while (num %2 ==0);
		
		ip.close();

	}

}
