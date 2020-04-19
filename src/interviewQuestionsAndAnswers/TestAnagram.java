package interviewQuestionsAndAnswers;

import java.util.Arrays;

public class TestAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordSplit();
		
		
		/*String s1 ="beema";
		
		String s2 ="ameeb";
		
		//step 2:
		
		char[] s1charArray =s1.toCharArray();
		
		char[] s2charArray =s2.toCharArray();
		
		//System.out.println(s1charArray);
		
		//step3
		Arrays.sort(s1charArray);
		
		Arrays.sort(s2charArray);
		
		boolean check =Arrays.equals(s1charArray, s2charArray);
		
		System.out.println(check);*/

	}
	
	public static void WordSplit()
	{
		
		
		String name ="My Name is Raghavan";
		
		String[] a =name.split(" ");
		
		String strRev ="";
		
		for(int i=0;i <a.length;i++)
		{
		
		System.out.print(a[i]+ " ");
		
		}
		System.out.println("");
		
		for(int j= a.length-1;j >= 0;j--)
		{
			
			strRev =a[j]+" ";
			
			System.out.print( strRev +" ");
		}
		
		System.out.println("");
	}
	

	
	
	
}
