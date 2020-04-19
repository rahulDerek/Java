package java2020;

public class ValueOf {

	public static void main(String[] args) {
		
		
		int i = 25;
		
		double d =24.678;
		
		String s = String.valueOf(i);
		
		System.out.println("Convert interger to String " +s);
		
		String st =String.valueOf(d);
		
		System.out.println("Convert double to String " +st);
		
		
		String str ="25";
		
		
		int y = Integer.valueOf(str);
		
		System.out.println("the value of converted integer is "+y);
		
		System.out.println(i+y);
		
		String str1 = "25.4f";
		
		Float f =Float.valueOf(str1);
		
		Float t =15.5f;
		
		System.out.println(f+t);
		
		
		

	}

}
