package java2020;

public class FrequentOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fr();
	}

	
	public static void fr() {
		
		int[] s = {1,2,3,4,1,3,1,8,9,1};
		
		int counter =0;
		
		int maxCount =0;
		int freInt = 0;
		
		for(int i =0; i <s.length;i++)
		{
			
			int currentCount = 0;
			
			int currentNumber =s[i];
			
			for(int j=0;j<s.length;j++)
			{
				
				int desiredNum=s[j];
				
				if(currentNumber == desiredNum)
				{
					currentCount++;
					
				}
				
				if(currentCount > maxCount)
				{
					maxCount = currentCount;
					freInt =currentNumber;
				}
				
			}
			
		}
		
		System.out.println("The frequtn integet is "+freInt+" and the number of times it occur "+maxCount);
		
	}
}
