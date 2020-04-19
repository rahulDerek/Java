package covid;

public class StringMethods {

	public static void main(String[] args) {
				
		//strmethod();
		strConcatenation();

	}
	
	public static void strmethod()
	{
		
		String name ="ram";
		
		System.out.println("The length of name string is "+name.length());
		
		System.out.println("Verify the name is empty "+name.isEmpty());
		
	}
	
	public static void strConcatenation()
	{
		
		
		try {
		String s1 ="deepak";
		
		String s2 = " java";
		
		
		System.out.println("s1+s2 is "+s1+s2);
		
		System.out.println("s1+10 is "+s1+10); //
		
		System.out.println("s1+10+20   is "+s1+10+20); //s1+10+20   is deepak1020
		
		System.out.println("s1+20/10   is "+s1+20/10); //s1+2010   is deepak2
		
		System.out.println("s1+20*10   is "+s1+20*10);
		
		//System.out.println("s1+10-5   is "+s1+10-5); //error

		//Concat
		
		System.out.println(s1.concat(s2));
		
		//Join
		
		System.out.println(String.join(":",s1,s2,"Hello"));
		
		System.out.println(String.join(":",null,s2,"Hello"));
		
		//System.out.println(String.join(null,s1,s2,"Hello"));
		
		//subSequence
		
		String s3 ="this is demo";
		
		System.out.println("The subSequence value  is...."+s3.subSequence(3, 9));
		
		//substring
		
		System.out.println("The substring value of the given statement is++++ "+s3.substring(3, 9));
		
		System.out.println("The substring value of the given statement is++++ "+ s3.substring(0, 0)); //empty String
		
		System.out.println("The substring value of the given statement is++++ "+s3.substring(3, -1));
		

		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
