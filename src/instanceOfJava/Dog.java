package instanceOfJava;

public class Dog extends Animal {
	
	

	public static void main(String[] args) {
		Dog d = new Dog();
		
		System.out.println( d instanceof Animal);
		
		
		Animal a = new Dog();
		
		System.out.println(a instanceof Dog);

	}

}

 class Animal
{
	
	
}
