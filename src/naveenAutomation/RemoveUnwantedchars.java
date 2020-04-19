package naveenAutomation;

public class RemoveUnwantedchars {

	public static void main(String[] args) {
		
		String s1 ="のコンサートは最高 lastSpring09121212";
		
		
		//Remove the jnuk characters --remove chinese chars";
		
		//Use regular expression  [^a-zA-Z0-9]
		
		s1 =s1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s1);
		
		

	}

}
