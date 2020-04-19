package javaInterview2019;

import java.util.Arrays;

public class SecondHighestNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//not very good
		
		int[] numberArr = {15,22,1,4,8,25,25};
		
		//Sort the arrays in ascending order
		
		Arrays.sort(numberArr);
		
		System.out.println("The second higher number in the given array is "+numberArr[numberArr.length-2]);
	}

}
