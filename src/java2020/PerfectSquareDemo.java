package java2020;

import java.util.Scanner;

public class PerfectSquareDemo {

	public static void main(String[] args) {
		
		
			primeNumber();
		
		/*
		 * Scanner scn = new Scanner(System.in);
		 * 
		 * System.out.println("Please enter a number to check the square information");
		 * 
		 * Integer number = scn.nextInt();
		 * 
		 * //Square root
		 * 
		 * for(int i=1;i<number;i++) {
		 * 
		 * if(i*i == number) {
		 * 
		 * System.out.println("Given number is the squareRoot  of "+i);
		 * 
		 * return;
		 * 
		 * }
		 */
			
			/*
			 * else { System.out.println("Please enter a valid number"); }
			 */

		
	//	 scn.close();

}
	
	public static void primeNumber() {
		
		
		int number = 5;
		
		boolean isPrimeNumber = true;
		
		
		for(int i= 2; i < number;i++)
		{
			
			if ((number % i)== 0)
			{
				
				isPrimeNumber = false;
				System.out.println("The given number is "+number  +"Not a primeNumber");
				
				break;
			}
			
			
			
		}
		
		
		if(isPrimeNumber== true) {
			
			System.out.println("The given number is prime number "+number);
		}
		
		
		
	}
	
}
