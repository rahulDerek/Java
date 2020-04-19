package java2020;

public class palindrome {

	public static void main(String[] args) {
		
		pal();
	}
	
	public static void pal() {
		
		
		String str ="madam";
		
		char[] c;
		
		StringBuffer sb = new StringBuffer();
		
		
		for(int i =str.length()-1; i >=0;i--)
		{
			c = str.toCharArray();
			
			sb.append(c[i]);
			
		}
		
		String s1 = sb.toString();
		System.out.println(s1);
		
		String s2 = str.trim();
		
		System.out.println(s2);
		
		if(s1.equals(s2))
		{
			
			System.out.println("The given string is palindrome");
		}
		
		else
		{
			
			System.out.println("The given string is NOT palindrome");
		}
		
		
	}

}
