package interviewQuestionsAndAnswers;

public class Palindrome 

{

	public static void main(String[] args) {
		
		verifyPalindrome();

		
	}
	
	public static void verifyPalindrome(){
		
		String str ="madam";
		
		boolean check =false;
		
		char[] ch=str.toCharArray();
		
		StringBuffer sb1=new StringBuffer();
		
		for(int i=str.length()-1;i >=0;i--)
		{
			
			sb1.append(ch[i]);
			
		}
		System.out.println(sb1);
		
		String sb2 =str.trim();
		
		if(sb2.equals(sb1.toString()))
			
			
		{
			
			System.out.println("The given string is palindrome");
		}
		
		
	}
}