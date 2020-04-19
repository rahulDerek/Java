package javaInterview2019;

public class FrequentIntAndMaxCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequentAndMax();
		
	}
	
	public static void frequentAndMax()
	{
		
		int[] num = new int[]{2,5,8,12,2,7,4,2,90,3,88};
		
		
		int maxCount = 0;
		int frequentInt =0;
		//int currentCount = 0;
		
		for(int i =0; i <num.length;i++)
		{
			int currentCount =0;
			int currentNumber = num[i];
			
			for(int j=0;j<num.length;j++)
			{
				if(currentNumber == num[j])
				{
					currentCount++;
				}
			}	
				
		
			if(currentCount > maxCount)
				{
					maxCount = currentCount;
					frequentInt = currentNumber;
					
				}
			
		}	
			
		
		
		System.out.println("The frequent Integer is "+frequentInt +"and the maxcount is "+maxCount);
	}

}





