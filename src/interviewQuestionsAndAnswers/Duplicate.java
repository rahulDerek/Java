package interviewQuestionsAndAnswers;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="The fox run over";
		
		//StringBuffer s=new StringBuffer();
		
		int count =0;
				
		for(int i=0;i <a.length();i++){
			
		char b= a.charAt(i);
					
		if (b =='e')
		{
			count++;
			
			//System.out.println(count);
		}
		
		}
		System.out.println(count);
		/*
		 * 
		 * Interview Questions
		General
		Find the most frequent integer in an array
		Find pairs in an integer array whose sum is equal to 10 (bonus: do it in linear time)
		Given 2 integer arrays, determine of the 2nd array is a rotated version of the 1st array. Ex. Original Array A={1,2,3,5,6,7,8} Rotated Array B={5,6,7,8,1,2,3}
		Write fibbonaci iteratively and recursively (bonus: use dynamic programming)
		Find the only element in an array that only occurs once.
		Find the common elements of 2 int arrays
		Implement binary search of a sorted array of integers
		Implement binary search in a rotated array (ex. {5,6,7,8,1,2,3})
		Use dynamic programming to find the first X prime numbers
		Write a function that prints out the binary form of an int
		Implement parseInt
		Implement squareroot function
		Implement an exponent function (bonus: now try in log(n) time)
		Write a multiply function that multiples 2 integers without using *
		HARD: Given a function rand5() that returns a random int between 0 and 5, implement rand7()
		HARD: Given a 2D array of 1s and 0s, count the number of "islands of 1s" (e.g. groups of connecting 1s)
		Strings
		Find the first non-repeated character in a String
		Reverse a String iteratively and recursively
		Determine if 2 Strings are anagrams
		Check if String is a palindrome
		Check if a String is composed of all unique characters
		Determine if a String is an int or a double
		HARD: Find the shortest palindrome in a String
		HARD: Print all permutations of a String
		HARD: Given a single-line text String and a maximum width value, write the function 'String justify(String text, int maxWidth)' that formats the input text using full-justification, i.e., extra spaces on each line are equally distributed between the words; the first word on each line is flushed left and the last word on each line is flushed right
		*/
		
	}

}
