package interviewQuestionsAndAnswers;

public class TestVowel {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vowelCheck();
		testSubstring();
		//removeDuplicates();
		
	}
		
		public static void vowelCheck()
		{
		String str ="Hello india upright";
		int count =0;
		char[] ch	= str.toCharArray();
		//boolean check =false;
		StringBuffer sb=new StringBuffer();
	
		for(int i=0;i<ch.length;i++)
		{
			
			
			if ((ch[i] =='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u'))
			{
				sb.append(ch[i]);
				count++;
				
			
				
			}
		}
		System.out.println(sb);
		System.out.println(count);
		}
		
		public static void testSubstring()
		{
			
			String str1="Hello how are you";
			
			String a=str1.substring(0, 2);
			System.out.println(a);
		}
		
		
		
		
		

	}


