package staticAndDynamicBinding;

 class ExampleT {
	
	public void sample() {
		
		System.out.println("The sample method from Parent");
		
		
	}

}

public class Example7 extends ExampleT
{
	
	public void sample() {
		
		System.out.println("The sample method from childhaha");
	
	}
	public static void main(String[] args)
	{
		Example7 e = new Example7();
		
		e.sample();
		
		ExampleT esix = new ExampleT();
		esix.sample();
		
		ExampleT eSeven = new Example7();
		
		eSeven.sample();
		
		
		
	}
}
