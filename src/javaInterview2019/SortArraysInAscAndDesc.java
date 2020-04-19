package javaInterview2019;

import java.util.Arrays;
import java.util.Collections;

public class SortArraysInAscAndDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sortArrays();
	}

	public static void sortArrays()
	{
		String[] str = {"a","z","c","b"};
		
		System.out.println("Before Sorting");
		
		for(String s :str)
		{
			
			System.out.println("Display the values in the array" +s);
		}
		//Sorting operation starts here
		Arrays.sort(str);
		
		System.out.println("After Sorting display the values in ascending order");
		for(String s :str)
		{
			
			System.out.println(s);
		}
		
		//Descending order
		
		Arrays.sort(str, Collections.reverseOrder());
		
		System.out.println("Array Elements in descending order sorting");
		
		for(String s :str)
		{
			System.out.println(s);
			
		}
	}
}
