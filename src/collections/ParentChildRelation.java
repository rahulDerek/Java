package collections;

public  interface ParentChildRelation {
	
	public abstract void h1();
	
	public abstract void h2();

}


interface InterfaceTest_1{
	
	public abstract void h3();
	
	public abstract void h4();
	
}

class B1 implements ParentChildRelation,InterfaceTest_1{
	
	
	public void h1(){
		
		System.out.println("The first method belongs to h1 ");
	}
	
    public void h2(){
		
		System.out.println("The second method h2 ");
	}
    public void h3(){
    	

		System.out.println("The third method  belongs to h3 ");
    }
    
    public void h4(){
    	

		System.out.println("The fourth method  belongs to h4 ");
    }
    
    public static void main(String[]  args){
    	
    	B1 b1 =new B1();
    	
    	b1.h1();
    	b1.h2();
    	b1.h3();
    	b1.h4();
    	
    
    	
    	
    }
	
}

