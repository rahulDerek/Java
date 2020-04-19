package staticAndDynamicBinding;

 class Example4{
	
	public static void test() {  //static binding
		
		System.out.println("Hello this is a static method");
	}
	
	
}

public class Example5 extends Example4{
	
	public static void test()
	{
		
		System.out.println("This is child class static method");
	}
	
	
	
	public static void main(String[] args)
	{
		Example4 e = new Example5();
		
		e.test();
		
		
	}

}
