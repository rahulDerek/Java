package collections;


public abstract  class AbstarctTest {
	
	
	public void m1(){
		
		System.out.println("Hello this defined method");
	}

	
	public abstract void m2();
}


 class B extends AbstarctTest {
	
	public  void m2(){
		
		System.out.println("We define the method here");
	
	}
	
	public static void main (String[] args){
		
		B b=new B();
		
		b.m2();
		
		b.m1();
		
	}
}