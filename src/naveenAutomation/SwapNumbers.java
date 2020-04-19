package naveenAutomation;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//1	
		/*
		 * int x =5;
		 * 
		 * int y =10;
		 * 
		 * int t;
		 * 
		 * t = x;
		 * 
		 * x=y;
		 * 
		 * System.out.println("The value of x is "+x);
		 * 
		 * y =t;
		 * 
		 * System.out.println("The value of y is "+y);
		 * 
		 * System.out.println("----------------------------------------------");
		 */
		
	//2
		int x = 5;
		
		int y =10;
		
		x=x+y; //15
		
		y=x-y; //(15-10=5)
		
		System.out.println("The value of y is "+y);
		
		x=x-y; //(15-5 =10)
		
		System.out.println("The value of x is "+x);
		
		
		
		System.out.println("-------------------------------------------------");
		
	// 3 (Method 3)
		
		int a = 2;
		
		int b =5;
		
		//swap the numbers 
		
		a = a*b; //10
		
	    b= a/b; //2
	    
	    a=a/b; //5
	    
	    System.out.println("The value of a is  "+a);
	    
	   System.out.println("The value of b is "+b);
		
		
	}

}
