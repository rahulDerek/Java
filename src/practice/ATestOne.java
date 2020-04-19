package practice;

public abstract class ATestOne {
	
	//constructor
	public ATestOne(){
		
		
	}
	abstract public  int Divide(int a,int b) ;
	abstract protected int mul(int c,int d);
	
	int call(){
		return 0;
	}

	/*private String getName(){
		
		return "hello";
	}*/
}

 class TestTwo extends ATestOne
{
	int a,b;
	 public int Divide(int a,int b)
	{
		System.out.println("Jello");
		
		return a/b;
		
	}
	 int x,y;
	public int mul(int x, int y){
		
			
	return x * y;
	}
	public static  void main (String[] args)
	{
		
		TestTwo two =new TestTwo();
		
		two.Divide(10,5);
		
		two.mul(10, 8);
		
		System.out.println("The expected result is "+two.Divide(10,5));
		
		System.out.println("The expected result of multiplication is "+two.mul(20, 8));
		
	}
	
	
}