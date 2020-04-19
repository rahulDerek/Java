package interviewQuestionsAndAnswers;

import java.util.Arrays;

import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Set;

public class JavaPratice {

	public static void main(String[] args) {
		
		findChar();
		//reverseString();
		//vowelCheck();
		//findPrime();
		
		//removeDuplicates();
		
		//checkPalindrome();
		
		//armStrongNum();
		
		//TestAnagramCheck();
		
	//	removeWhiteSpace();
		
		//sortString();
		
		//CountNumberOfWords();
		
		ReverseWords();
		OnlyDigits();
		
		
	}



public static void  findChar()
{
	String strA ="Helleo";
	int counter =0;
	
	for(int i=0;i <strA.length();i++)
	{
		char a = strA.charAt(i);
	
			if(a=='e')
			{
			counter++;
		
			}
	
	}
	
	System.out.println("The value of counter is"+counter);
}

		public static void reverseString()
		{
	
	String strRev="Hello where are you?";
	
	StringBuffer sb=new StringBuffer();
	
	Character ch =null;
	
	for(int i=strRev.length()-1;i >= 0;i--)
		{
			ch =strRev.charAt(i);
			
			sb.append(ch);
			
			
		}
		System.out.println("The value of character array is "  +sb);
}

		public static void vowelCheck(){

			
			String strvow="a black cat jumps on ice in india";
			
			StringBuffer sb=new StringBuffer();
			
			int count=0;
			
			char[] ch=null;
			
			for(int i=0;i < strvow.length();i++)
			{
				
			  ch =strvow.toCharArray();
			  
			  if((ch[i]=='a') || (ch[i]=='e') || (ch[i]=='i')|| (ch[i]=='o')||(ch[i]=='u'))
			  {
				  sb.append(ch[i]);
				  
				  count++;
				  
			  }
				
			}
			
			System.out.println("The number of vowels "+count);
	
	
}
		public static void findPrime()
		{
			
			int num =7;
			
			boolean isPrime =true;
			
			for(int i=2;i <=num;i++)
			{
				
					if (num % i==0)
				
						{
							isPrime =false;
							System.out.println("The given number is not  prime ");
							break;
							
						}
					
					if (isPrime)
					{
						System.out.println("The given number is  prime ");
						break;
						
					}
			
			}
			
			
		}
		
		public static void removeDuplicates()
		{
			String strDup="A fox jumps on the rope";
			
			
			Character ch =null;
			
			Set<Character> set=new HashSet<Character>();
			
			Set<Character> setA=new HashSet<Character>();
			
			StringBuffer sb=new StringBuffer();
			
			StringBuffer sb1=new StringBuffer();
			
			for(int i=0;i < strDup.length();i++)
			{
				ch=strDup.charAt(i);
				
				if(!set.contains(ch))
				{
					
					set.add(ch);
					
					sb.append(ch);
				}
				
				else
				{
					setA.add(ch);
					
					sb1.append(ch);
				}
				
				
			}
			
			System.out.println("The new string after removing duplicates "+sb);
			
			System.out.println("The duplicates are"+sb1);
			
		}
		
		public static void checkPalindrome()
		{
			
			
			String strPal ="madam";
			
			StringBuffer sb=new StringBuffer();
			
			Character ch =null;
			
			for(int i=strPal.length()-1;i >=0;i--)
			{
				
				ch=strPal.charAt(i);
				
				sb.append(ch);
			}
			
			System.out.println("The value of sb is "+sb.toString());
			
			if((sb.toString()).equals(strPal))
			{
				
				System.out.println("The given string is palindrome");
			}
			else
			{
				System.out.println("The given string is NOT palindrome");
			}
		}
		
		public static void armStrongNum(){
			
			int num =9474;
			
			//int num =153;
			
			int	temp =num;
			
			int r,sum =0;
			
			while(num > 0)
			{
			r= num%10;
			
			num=num/10;
			
			sum=sum+r*r*r;
			
			System.out.println("Value of r is "+r);
			
			System.out.println("Value of num is "+num);
			
			System.out.println("value of sum is "+sum);
			
			}
		}
		
		public static void TestAnagramCheck()
		{
			String s1a="mean";
			String s2a="neam";
			
		char[] ch1a = s1a.toCharArray();
		
		char[] ch2a = s2a.toCharArray();
		
		Arrays.sort(ch1a);
		
		Arrays.sort(ch2a);
		
		boolean chek= Arrays.equals(ch1a, ch2a);
		
		System.out.println(chek);
			
			
			
		}
		
		public static void removeWhiteSpace()
		{
		 //Remove all white spaces from a String
		String rmWhite="Hello where are you?";
			
		String value = rmWhite.replaceAll("\\s+", "");
			
		
		System.out.println("The value after removng white space is "+value);
		}
	
		public static void sortString()
		{
			//Sort String in Java
			String sortString ="Jeevan";
			
			String sortChek=sortString.toLowerCase();
			
			char[] ch =sortChek.toCharArray();
			
			Arrays.sort(ch); 
			
			String sortedCheck =new String(ch);
			
			System.out.println("value after sorting  "+sortedCheck);

		}
		
		public static void CountNumberOfWords()
		{
			//Count the number of words in a sentence
			
			String str ="Hello where are you going now?";
			
			StringTokenizer strToken =new StringTokenizer(str);
			
			
			int numberOfTokens = strToken.countTokens();
			
			System.out.println("Total number of tokens "+numberOfTokens);
			
			while(strToken.hasMoreElements())
				
				System.out.println("The token name is "+strToken.nextToken());
		}
		
		public static void ReverseWords()
		{
			String str ="My Name is Sudhagar";
			
			String str1="";
			
			String a[] =str.split(" ");
			
			for(int i=0;i<a.length;i++)
			{
				
				System.out.print(a[i]+" ");
			}
			
			System.out.println("");
			
			//Reverse the words
			
			for(int j=a.length-1;j >=0;j--)
			{
				
				
				str1=str1+a[j]+" ";
				
			}
			
			System.out.println(str1);
			
			
		}
		
		public static void OnlyDigits()
		{
			
			String str="12345678s";
			
			boolean chek=false;
			
			
			if (str.matches("[0-9]+"))
			{
				chek =true;
				System.out.println("The String only contain digits is " +chek);
			}
			
			else
			{
				System.out.println("The String only contain digits is " +chek);
				
			}
		}
		
		
			
		}
		
		
		
		
