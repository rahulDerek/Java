package techMeDevotedArrays;

import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {1,3,6,9,12};
		 int[] b = {3,9,22};
		
		commonElementsBetweenTwoArrays( a,b);
		
	}
	
	public static void commonElementsBetweenTwoArrays(int[] arr1,int[] arr2) {
		
		int counter = 0;
		
		for(int i=0;i < arr1.length;i++) {
			
			for(int j=0; j < arr2.length;j++) {
				
				if(arr1[i]==arr2[j])
				{
					counter++;
					System.out.println("The common elements are "+arr1[i]+ " ");
				}
				
				
			}
		}
		
		System.out.println("The total number of common elements are "+ counter);
		
	}

}
