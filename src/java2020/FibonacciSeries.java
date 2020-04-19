package java2020;

public class FibonacciSeries {

	public static void main(String[] args) {

		//0 1 1 2 3 5 8 13 21 ......
		
		
		int a=0;
		int b =1;
		System.out.print(a+" "+b);
		int c;
		
		for(int i =1; i <=10;i++)
		{
			
			c =a+b;
			
			a=b;
			b=c;
			
			System.out.print(" "+c);
			
		}
		

	}

}
