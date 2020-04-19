package collections;
public class Test_StaticKey {

	static int i =5;
	
	
	static {
		
		System.out.println("This is static method");
		
		System.out.println("The value of i is"+ i);
	}
	
	public void z1(){
		
		System.out.println("This is public method in final class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		Test_StaticKey ts=new Test_StaticKey();
		
		ts.z1();
		

	}

}
