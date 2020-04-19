package naveenAutomation;

class car{
	
	
	public static void start()
	{
		System.out.println("Car Start");
	}
	
	public void stop() {
		
		System.out.println("Car Stop");
	}
	
	public void fuel()
	{
		
		System.out.println("SuperClassFuel");
	}
	
}

class Toyota extends car
{
	
	
	public static void start()
	{
		System.out.println("Toyota car start");
	}
	
	public void fuel()
	{
		
		System.out.println("SubClassFuel");
	}
	
	
}




public class TestStaticOverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car c =new car();
		Toyota t = new Toyota();
		
		car ca = new Toyota();
		
		c.start();
		ca.start();
		
		c.fuel();
		ca.fuel();
	}

}
