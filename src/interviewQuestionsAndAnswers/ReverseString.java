package interviewQuestionsAndAnswers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ReverseString {
	
	
	
	public static void main(String[] args) {
				
		//ReverseAString(str);
		
		rev();
		
		String str ="Hello World this is an example";


		StringBuffer sb =new StringBuffer();
		
		Character ch =null;
		
		for(int i=str.length()-1;i >=0;i--)
		{
			ch =str.charAt(i);
			
			sb.append(ch);
			
		}
		System.out.println("The reverse string Value is   " +sb);
	}
	
	public static void rev() {
		
		String str = "hello";
		
		String s="";
		
		for(int i = str.length()-1; i >=0; i--)
		{
			
			char[] c = str.toCharArray();
			
			s =s+c[i];
			
			
			
		}
		System.out.println(s);
		
		
	}
	
	

}
