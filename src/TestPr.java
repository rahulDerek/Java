
public class TestPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str ="abcdeabczzhhbcy";
	
		
		System.out.println(str.substring(1, 4));
		
		
		//System.out.println("bc",str.indexOf("bc"),);
		
		int ind2 = str.indexOf("bc",str.indexOf("bc")+1);
		
		System.out.println("The 2nd index position is "+ind2);
		
		int ind3 =str.indexOf("bc",ind2+1);
		
		System.out.println("The 3rd index position is "+ind3);
		
		String text="Hello_How_Are_you";
		
		  String[] spText = text.split("_");
		  
		  for(  String s :spText)
		  {
			  System.out.println(s);
		  }
		  
		  
		  
		  String s1 ="Hello";
		  
		 // String s2 ="Hello";
		  
		//  String s2 = new String("RAM");
		  
		  String s2 = new String();
		  
		  s2 = "RAM";
		 
		  
		/*
		 * boolean x = s1.equals(s2);
		 * 
		 * System.out.println("s1 is equal to s2 "+x);
		 * 
		 * boolean y = (s1==s2);
		 * 
		 * System.out.println("The value of y is  "+ y);
		 */
		  
		  //concat
		  
		 String s3 = s1.concat(s2);
		 
		 System.out.println("The concatenation value "+s3);
		 
		 
		 
		 
		 String a ="meow";
		 
		 String ab=a+"deal";
		 
		 String abc="meowdeal";
		 
		 System.out.println(ab==abc);
		 
		 
	}

}
