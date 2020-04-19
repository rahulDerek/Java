package javaInterview2019;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//removeDuplicates();
		
	//	verifyPalindrome();
		
		
		AnagramCheck();
		Set<Character> se = new HashSet<Character>();
		Set<Character> se1 = new HashSet<Character>();
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		String str ="javav";
		
		for(int i =0; i <str.length();i++)
		{
			Character ch = str.charAt(i);
			
			if(!se.contains(ch))
			{
				se.add(ch);
				sb.append(ch);
				
			}
			else
			{
				se1.add(ch);
				sb1.append(ch);
				
			}
			
			
		}
		System.out.println("The duplicates after removed "+sb.toString());
		
		System.out.println("The duplicate item is "+sb1.toString());
	}
	
	
	public static void removeDuplicates() {
		
		String st ="uuic";
		
		StringBuffer sb = new StringBuffer();
		
		while(st.length() > 0)
		{
			sb.append(st.substring(0, 1));
			
			st	= st.replaceAll(st.substring(0, 1), "");
			
			System.out.println("The value of st is "+st);
		}
		
		System.out.println("After removing "+sb.toString());
		
		
	}
	
	public static void verifyPalindrome()
	{
		
		String pal ="madam";
		
		StringBuffer sb = new StringBuffer();
		
		String reverse ="";
		
		
		for(int i=pal.length()-1; i >=0;i--)
		{
			
			
			reverse = reverse+pal.charAt(i);
		}
		
		System.out.println("The reverse value of given string is "+reverse);
		
		if(reverse.equalsIgnoreCase(pal.trim()))
		{
			System.out.println("The given string is palindrome");
			
		}
		
		else
		{
			System.out.println("The given string is NOT palindrome");
		}
	}
	
	public static void AnagramCheck()
	{
		
		String a ="abcd";
		
		String b = "badc";
		
		char[] ch1 = a.toCharArray();
		
		char[] ch2 = b.toCharArray();
		Arrays.sort(ch1);
		
		Arrays.sort(ch2);
		
		boolean check = Arrays.equals(ch1, ch2);
		
		System.out.println(check);
		
		
		
	}

}
