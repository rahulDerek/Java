package interviewQuestionsAndAnswers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class QuestionsTest {

	public static void main(String[] args) {
		
		
		factCheck(9);
		
		anagramChek();
		
		/*HashSet s1= new HashSet();
		
		for(short i=0; i<100;i++)
		{
			s1.add(i);
			
			s1.remove(i - 1);
		}
		
		System.out.println("The size is "+s1.size());*/
		
		
		
		/*int factorial =1;
		
		int number =5;
		
		for(int i=1;i <=8;i++){
			
			
			factorial =factorial*i;
		}
		
		System.out.println("The value of factorial is "+factorial);*/
	}
	
	public static int factCheck(int number){
		
		int factorial =1;
		
		for(int i=1;i <=number;i++){
			
			
			factorial =factorial*i;
		}
		
		System.out.println("The value of factorial is "+ factorial);
		
		
		return factorial;
		
	}
	
	public static void anagramChek()
	{
		
		String ana="Java";
		
		StringBuffer sb=new StringBuffer();
		
		String sb1 ="";
		
		for(int j=ana.length()-1;j >=0;j--)
		{
			
			char ch=ana.charAt(j);
			sb.append(ch);
			sb1 =sb.toString();	
		}
		
		System.out.println("value of  ana in reverse "+ sb1);
		
		if(ana.length() != sb1.length())
		{
			System.out.println("The lenghts of  2 strings are not equal");
			
			
		}
		
		char[] ch =ana.toCharArray();
		
		char[] ch1 =sb1.toCharArray();
		
		System.out.println(ch);
		System.out.println(ch1);
		
		Arrays.sort(ch);
		
		Arrays.sort(ch1);
		
		boolean check =Arrays.equals(ch, ch1);
		
		System.out.print("The strings are equal "+check);
		
		
		
		
		
		
		
		
	

			
		}
		
		
	}


