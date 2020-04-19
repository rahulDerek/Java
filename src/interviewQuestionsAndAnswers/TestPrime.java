package interviewQuestionsAndAnswers;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestPrime {

	public static void main(String[] args) 
	{
	
		
	//testDuplicates("The quick fox jumps over the lazy dog");
		
		checkPrime();
	}
	
	public static void checkPrime()
	{
		System.out.println("Please Enter a number  ");
		
		Scanner sc =new Scanner(System.in);
		
	    Integer number	=sc.nextInt();
	    sc.close();
	    
	    boolean prime =false;
	    
	    for(int i=2;i < number;i++)
	    {
	    	if(( number % i )==0)
	    	{
	    		prime =false;
	    	}
	    	else
	    	{
	    		prime= true;
	    	}
	    }
	    
	    if(prime == true)
	    {
	    	
	    	System.out.println("The entered number "+number+"is prime");
	    }
	    
	    else
	    	System.out.println("The entered number "+number+"is not prime");
	    
	   
		
		}
	public static String testDuplicates(String str)
	{
		
		
		Set<Character> set =new HashSet<Character>();
		
		Set<Character> setA =new HashSet<Character>();
		
		StringBuffer sb =new StringBuffer();
		
		StringBuffer sb1 =new StringBuffer();
		
		
		for(int i=0;i < str.length();i++)
		{
			
			Character C=str.charAt(i);
			
			if(!set.contains(C))
			{
				set.add(C);
				sb.append(C);
				
			}
			else
			{
				setA.add(C);
				
				sb1.append(C);
				
			}
			
			
		}
		
		System.out.println("After removing duplicates from a given string" +sb);
		System.out.println("The duplicates from a given string"+sb1);
		
		return sb1.toString();
	}
	
	

}

