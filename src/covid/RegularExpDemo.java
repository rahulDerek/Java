package covid;

import java.util.regex.*;

public class RegularExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//example1("[abc]","ababbaba");
		
		// example1("[^abc]","ababbaba");
		
		// example1("[ABC]","AbabBaba");
		 
		//example1("[a-zA-Z0-9]","Aba6b Baba8");
		
		//example1("[\\s]","Aba6b Baba8");  //check space
		//example1("[\\d]","a7b k@9");  //check digit
		
		//example1("[\\D]","a7b k@9");  //other than digit
		//example1("[\\w]","a7b k@9");  //only words
		
	//	example1("[\\W]","a7b k@9");  //other than  words
		//example1("[\\.]","a7b.k@9");  //only dot
		//example1("a","abaabaaab");  //number of times a appears
		
	//	example1("a+","abaabaaab");  //Atleast 1 number of time appears
		
		//example1("a*","abaabaaab");  //Any number of time appears OR zero time appears OR Nothing appears
		
		
		example1("a?","abaabaaab");  //Atmost ONE 'a' OR Zero 'a'
		
		/*
		 * Pattern p = Pattern.compile("ab");
		 * 
		 * Matcher m = p.matcher("ababbaba"); int counter =0; while(m.find()) {
		 * counter++;
		 * 
		 * System.out.println("The starting index is "+m.start()+
		 * " and the group value is "+m.group());
		 * 
		 * //System.out.println(m.group());
		 * 
		 * }
		 * 
		 * System.out.println("The total number of matchers are "+counter);
		 */
	}
	
	public static void example1(String regx,String targetString)
	{
		
		
		//Pattern p = Pattern.compile("[abc]");
		
		//Matcher m = p.matcher("ababbaba");
		
		Pattern p = Pattern.compile(regx);
		
		Matcher m = p.matcher(targetString);
		
		
		
		int counter =0;
		while(m.find())
		{
			counter++;
			
			System.out.println("The starting index is "+m.start()+ " and the group value is "+m.group());
			
			//System.out.println(m.group());
			
		}

			System.out.println("The total number of matchers are "+counter);
		
		
		
	}

}
