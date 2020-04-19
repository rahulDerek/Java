package java2020;

public class ArmsStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		armS();
	}
	
	public static void armS()
	{
		int number = 123;
		
		int t1 =number;
		int len = 0;
		
		while( t1 != 0)
		{
			
			t1 = t1 / 10;
			
			len = len+1;
			
			
		}
		System.out.println("The value of len is "+len);
		
		int t2 = number;
		
		int rem;
		
		int arm =0;
		
		while(t2 !=0)
		{
			int mul =1;
			rem = t2 % 10;
			
			for(int i=1;i<=len;i++)
			{
				mul = mul*rem;
				
			}
			
			arm =arm+mul;
			
			t2 = t2/10;
			
			
		}
		
		
		if(arm == number)
		{
			System.out.println("The given number is armstrong number "+number);
		}
		
		else
		{
			System.out.println("The given number is NOT armstrong number "+number);
			
		}
	}

}
