package javaInterview2019;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter a String");
		
		Scanner sc = new Scanner(System.in);
		
		String str =sc.nextLine();
		
		int count = 0;
		//convert the string to char
		char[] chars = str.toCharArray();
		
		for(int i=0; i < chars.length;i++)
		{
		
		if(chars[i] == 'a' || chars[i] == 'e' || chars[i]=='i'|| chars[i]=='o' ||chars[i]=='u')
		{
			
			count++;
		}
		
			/*
			 * else {
			 * 
			 * System.out.println("nothing"); }
			 */
		
		
	}
		
		System.out.println("Total number of vowels "+count);
		sc.close();
	}
}
