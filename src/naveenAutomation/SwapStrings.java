package naveenAutomation;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a ="Hello";
		
		String b ="World";
		
		//Append a and b
		
		a =a+b; //HelloWorld
		
		b=a.substring(0,a.length()-b.length());
		
		System.out.println("The value of b after swapping is "+b);
		
		a=a.substring(b.length());
		
		System.out.println("The value of a after swapping is "+a);
				
	}

}
