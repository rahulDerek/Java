package javaInterview2019;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String s ="Hello";
		 * 
		 * String reverse ="";
		 * 
		 * for(int i =s.length()-1; i >=0;i--) { reverse = reverse +s.charAt(i);
		 * 
		 * } System.out.println("The value of reverse is "+reverse);
		 */
		
		arrayStringreverse();
	}
	
	public static void arrayStringreverse()
	{
		String str ="Hello How are you";
		
		String reverse = " ";
		
		String[] normalSp = str.split(" ");
		
		System.out.println(normalSp.length);
		
		for(int i = normalSp.length-1; i >= 0;i--)
		{
			
			//System.out.print(normalSp[i]+ " ");
			
			reverse = reverse+normalSp[i]+" ";
			
			//System.out.print(" ");
			//System.out.println(reverse);
		}
		
	System.out.println(reverse);
		
	}
}