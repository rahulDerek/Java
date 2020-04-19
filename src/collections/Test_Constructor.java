package collections;

public class Test_Constructor {
	
	int i;

	public Test_Constructor(){
		
		System.out.println("Empty constructor");
	}
	
	public Test_Constructor(int i){
		
		System.out.println("constructor with integer "+ i );
	}
	
	
	public Test_Constructor(float f,double d){
		
		System.out.println("constructor with float and double" + f + "double  value"+d);
	}
	
	
	public void show(){
		
		System.out.println("This is  a method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Test_Constructor t= new Test_Constructor();
		
		t=new Test_Constructor(5);
		
		t=new Test_Constructor(1.1f,100.7d);
		
		t.show();
		
		
	}

}
