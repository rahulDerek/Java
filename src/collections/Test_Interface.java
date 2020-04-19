package collections;

public class Test_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		
		C  see =new C();
		
		see.m1();
		
		see.m2();
		
		
		//2
		
		A yeah =new A();
		
		yeah.m1();
		//yeah.m2();
		
		//3
		
		A why =new C();
		
		why.m1();
		
	//	why.m2();
		
		
		
		//4
		
		//C check =new A();
		
		

	}

}

class A {
	
	public  void m1(){
		
		System.out.println("This is method m1");
	}
	
	
}

class C extends A{
	
	public void m2()
	{
	
		System.out.println("This is method m2");
	}
}