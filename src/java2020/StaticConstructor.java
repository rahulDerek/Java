package java2020;

public class StaticConstructor {
	
	
	
	   StaticConstructor() {
	  
	  }
	 
	static int rollNo=1000;
	
	int policyNumber = 250;
	
	String name ="vadai";
	
	
	static void display()
	{
		//System.out.println("The name is "+name);
		System.out.println("The roll number value is "+rollNo);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticConstructor sc = new StaticConstructor();
		rollNo =1;
		sc.display();

	}

}
