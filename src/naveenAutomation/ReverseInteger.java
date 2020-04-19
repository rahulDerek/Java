package naveenAutomation;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Method 1
		
			int num =12345;
			int rev=0;
			
			while(num != 0)
			{
				
				rev = rev * 10+num % 10;
				
				num= num/10;
				
			}
			
			System.out.println("The Reverse number of the given integer is "+rev);
			
			
			//Method 2
			long num1 =12345;
			 System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
			 
			 StringBuffer sb = new StringBuffer(String.valueOf(num1));
			 
			 System.out.println("The reverse of the given string is"+ sb.reverse());
			 
			
			
	}
	
	
	
	

}
