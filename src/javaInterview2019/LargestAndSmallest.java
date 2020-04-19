package javaInterview2019;

public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[]{2,33,990,34,5,72};
		
		int largestNumber = num[0];
		
		int smallestNumber = num[0];
		
		for(int i= 0; i < num.length;i++)
		{
			
			if(num[i] > largestNumber)
			{
				
				largestNumber = num[i];
		
			}
		
	
		}
		System.out.println("The largest Number is "+largestNumber);
		
		
		for(int i =0; i < num.length;i++)
		{
			
			
			if(num[i] < smallestNumber)
			{
				
				smallestNumber = num[i];
			}
		}
		
		System.out.println("The smallest Number is "+smallestNumber);
}
}
