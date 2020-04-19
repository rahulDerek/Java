package java2020;

public class StringManipulation {

	public static void main(String[] args) {
		sM();

	}

	public static void sM()
	{
		
		String s1 ="Hello";
		
		String s2="Hello";
		
		String s11 ="World";
		
		String s4="";
		
		String s5 ="This is phone";
		
		// 1.CompareTo  compare 2 Strings
		
		int var1 =s1.compareTo(s2);
		
		System.out.println("Comparison of 2 strings "+var1);
		
		
		// Compare String to an Object
		
		int var2 =s2.compareTo("Hell");
		
		System.out.println("The value of comparsion between String and Object is"+var2);
		
		//Compare String to an Object
		
		int var3 =s1.compareTo(s4);
		
		System.out.println("Comparison between s1 and s4 is"+var3);
		
		int var4 =s4.compareTo(s1);
		
		System.out.println("Comparison between s4 and s1 is"+var4);
		
		//concat
		
		String con = s1.concat("World");
		
		System.out.println(con);
		
		//content equals
		
		StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println("The content equals methods gives "+s1.contentEquals(sb));
		
		
		//copy value of
		
		
		char[] data = {'a','b','c','d','e','f','g','h','i','j'};
		
		String str1="Text";
		
		String str2 ="ginger";
		
		str1 = str1.copyValueOf(data);
		
		System.out.println(str1);
		
		str2 =str2.copyValueOf(data, 6, 4);
		
		System.out.println("The value of str2 is "+str2);
		
		//String endsWith
		
		
		boolean var5= s5.endsWith("phone");
		
		System.out.println("EndsWith check "+var5);
		
		String ss ="Hi There";
		
		boolean y = ss.startsWith("There", 3);
		
		System.out.println("Starts with value verify "+y);
		
		boolean yy =ss.startsWith("Hi");
		
		System.out.println("Starts with yy "+yy);
		
		///
		
		
		
		
	}
}
