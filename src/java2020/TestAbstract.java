package java2020;

public class TestAbstract{
	
	
	public static void main(String[] args) {
		wow w = new wow();
		w.demo();
		
		
		

	}

}

 abstract class TestAbstract1 {
	
	static String name ="kannan";
	
	int s;
	//Constructor of the abstract class
	TestAbstract1()
	{
		super();
		System.out.println("I am in Test Abstract class");

	}
	
	TestAbstract1(int i)
	{
		this.s = i;
	}
	

	abstract void demo();
		
		
	
	static void display()
	{
		System.out.println("hello i am in display static");
	}

}
 
 class wow extends TestAbstract1{

	@Override
	void demo() {
		System.out.println("Hello");
		
	}
	 
	
	

	
	
	 
 }