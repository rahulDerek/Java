package java2020;

public class MethodParam {
	
	static void h(String fname) {
		
		System.out.println("The first name of the person is "+fname);
	}

	public static void main(String[] args) {
	
		h("Kavya");
		
		System.out.println(calculate(5,8));

	}
	
	
	public static int calculate(int a,int b)
	{
		
		return a+b;
	}

}
