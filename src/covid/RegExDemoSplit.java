package covid;

import java.util.regex.Pattern;

public class RegExDemoSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pattern p =Pattern.compile("\\s"); //Split based on space
		 * 
		 * String[] s = p.split("Durga software solutions");
		 * 
		 * for(String s1:s) {
		 * 
		 * System.out.println(s1); }
		 */
		
		
		//spaceSplit("\\s");
		
		spaceSplit("a");
	}
	
	public static void spaceSplit(String regEx)
	{
		Pattern p =Pattern.compile(regEx); //Split based on space
		
		//Pattern p =Pattern.compile("\\s"); //Split based on space
		
		String[] s	= p.split("Durga software solutions");
		
		for(String s1:s)
		{
			
			System.out.println(s1);
		}
		
		
	}

}
