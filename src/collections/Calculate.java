package collections;


 class Test_SingleInheritance {
	
	
	int num1,num2,result;
	
	public void add(){
		
		result=num1+num2;
		
	}

}

 class Test_SingleInheritance_1 extends Test_SingleInheritance{
	
	public void sub(){
		
		result=num1-num2;
		
	}
	
}

public class Calculate {
	
	
	public static void main(String args[]){
		
		Test_SingleInheritance_1 a1 =new Test_SingleInheritance_1();
		
		a1.num1=5;
		
		a1.num2=4;
		
		a1.add();
		
		System.out.println( a1.result);
		
		a1.sub();
		
		System.out.println(a1.result);
		
		
		
		
	}
}