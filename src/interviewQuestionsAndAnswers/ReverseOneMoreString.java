package interviewQuestionsAndAnswers;

import java.util.Scanner;

public class ReverseOneMoreString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String input ="java";
			
			String reverse = "";
			
		//	@SuppressWarnings("resource")
			//Scanner scanner =new Scanner(System.in);
			
			//System.out.println("Enter a value of a string");
			//input = scanner.nextLine();
			
			for(int i =input.length()-1;i >=0;i--)
			{
				
				reverse =reverse+input.charAt(i);
				
				
			}
			
			System.out.println(reverse);
		}

	
}
