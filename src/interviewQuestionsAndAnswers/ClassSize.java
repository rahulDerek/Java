package interviewQuestionsAndAnswers;

public class ClassSize {

	static{
		System.out.println("I am from static");
	}
	
	static{
		System.out.println("Iam from static2 ");
	}
	
	
	{
		
		System.out.println("Iam from iib1		 ");
		
	}
	{
		System.out.println("Iam from iib2");
		
	}
	public static void main(String[] args) {
		
		ClassSize cs =new ClassSize();
		
		System.out.println("Hello");
	}
	

}
