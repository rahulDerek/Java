package instanceOfJava;

public class Example3 {
	
	static int i =5;
	
	static float f =4.6f;
	
	static double d =12.6;
	
	static boolean b = true;
	
	static Character c ='w';

	public static void main(String[] args) {
		
		
		if(Integer.class.isInstance(i))
		{
			
			System.out.println("true");
		}
		
		if(Float.class.isInstance(f))
		{
			
			System.out.println(true);
		}
		
	}

}
