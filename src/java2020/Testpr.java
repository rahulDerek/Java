package java2020;

import java.util.Scanner;

public class Testpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//rev();
		
		//rep();
		
		//wordRev();
		
		//modu();
		
		// countNum();
		
		//firstNonRep();
		
		prNum();
	}

	public static void  rev(){
		
		String s ="hello";
		
		StringBuffer sb = new StringBuffer();
		
		for(int i =s.length()-1;i >=0;i--) {
			
			
			char c = s.charAt(i);
			
			System.out.println(c);
			
			sb.append(c);

		}
		
		System.out.println("The reverse string is "+sb);
		
	}
	
	public static void rep() {
		
		
		String s ="kvvjsts";
		
		StringBuffer sb = new StringBuffer();
		
		while( s.length() > 0) {
			
			
			
			sb.append(s.substring(0, 1));
			
			s=s.replaceAll(s.substring(0,1), "");
		
			
		}
		
		System.out.println("After removing the repetitive chars  "+ sb);
		
		
	}
	
	public static void wordRev() {
		
		
		String s ="hello how are you";
		
		String[] splitA = s.split(" ");
		
		for(int i =0; i < splitA.length;i++)
		{
			
			//System.out.println(splitA[i]);
		}
		
		//let us reverse it
		
		String t = " ";
		
		for(int i= splitA.length-1; i >=0;i--)
		{
			
			
			 t = t+splitA[i]+" ";
			
			
			
			
			
		}
		
		System.out.println(t);
		
	}
	
	public static void modu()
	{
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		
		int number = 0;
		
		
		number = scn.nextInt();
		
		System.out.println("The entered number is "+number);
		
		if( number % 2 == 0)
		{
			System.out.println("The entered number is Evennumber");
			
			
		}
		
		else
		{
			System.out.println("The entered number is Oddnumber");
			
		}
		
		scn.close();
		
	}
	
	public static void countNum()
	{
		
		
		String str ="helloe";
		
		int count = 0;
				
		for( int i =0; i < str.length();i++)
		{
			
			if(str.charAt(i) =='e')
			{
				count++;
				
			}
			
			
		}
		
		System.out.println(count);
		
		
	}
	
	
	public static void firstNonRep()
	{
		
		String s="bcbz";
		
		boolean found = false;
		
		String searchText="";
		
		String searchFor="";
		
		int count = 0;
		
		for(int i=0; i < s.length();i++)
		{
			
			found = false;
			
			searchText =s.substring(i, i+1);
			
			for(int j=i+1;j<s.length();j++)
			{
				
				  searchFor=s.substring(j,j+1);
				  
				  if(searchText.equals(searchFor)) 
				  
				  { found = true;
				  	break;
				   }
				  
				  else
				  {
					  found = false;
					  count++;
					  
				  }
				  
				  
				  if (count==1)
				  {
					found=false;
					   
					  
				  }
				
			}
			
			 if (found = false)
			 {
				 break;
			 }
			 
			  
			
			 
			 
		}
		
		
		  if(!found) {
		  System.out.println("The second non rep character is "+searchText); }
		 
		
		
	}
	
	
	public static void prNum() {
		
		int s =5;
		boolean isPrime=false;
		
		
		for(int i = 2; i < s;i++)
		{
			
			if (s%i == 0)
			{
				System.out.println("The given number"+s+"is not prime");
				
				isPrime=false;
				
				break;
				
			}
			
			else
			{
				
				isPrime =true;
			}
			
			
		}
		
		if(isPrime ==true)
		{
			System.out.println("The given number "+s+"is prime number");
		}
		
		
		
	}
}
