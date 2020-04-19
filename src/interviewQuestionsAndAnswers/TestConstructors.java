package interviewQuestionsAndAnswers;

public class TestConstructors {

	int weight;
	
	String name;
	public TestConstructors()
	{
		System.out.println("This is the default constructor");
	}
	public TestConstructors(int sampleWeight)
	{
		this.weight = sampleWeight;
		System.out.println("This is the constructor with weight variable"+sampleWeight);
	}
	
	public TestConstructors(String sampleName)
	{
		this.name = sampleName;
				
		System.out.println("This is the constructor with name variable"+sampleName);
	}
	
	public static void main(String[] args) {
		
		
		TestConstructors t =new TestConstructors("Kannan");
		
		TestConstructors t1=new TestConstructors(60);

	}

}
