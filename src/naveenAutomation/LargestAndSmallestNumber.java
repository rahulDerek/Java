package naveenAutomation;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] number = {19,29,31,-23,1982,3,-98};
		
		int largest =number[0];
		
		int smallest = number[0];
		
		for(int i=1;i <number.length;i++)
		{
			if(number[i] > largest)
			{
				largest = number[i];
			}
			else if(number[i] < smallest)
			{
				smallest = number[i];
			}
		}
		System.out.println("The given array is "+Arrays.toString(number));
		System.out.println("The largest number in the given array is "+largest);
		
		System.out.println("The smallest number in the given array is "+smallest);
	}

}
