package java2020;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//numEx();
		aDim();
		String[] cars = {"Honda","Volvo","Toyota"};
		
		for(String car:cars)
		{
			System.out.println(car);
		}
	}
	
	
	public static void aDim()
	{
		
		int[][] number = {{1,2,3,5},{8,10}};
		
		int x = number[0][3];
		
		int y = number[1][1];
		
		System.out.println("The number from the given array is "+x);
		
		System.out.println("The number from the given array is "+y);
		
		
	}

	
	public static void numEx()
	{
	
	 int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < myNumbers.length; ++i) {
	      for(int j = 0; j < myNumbers[i].length; ++j) {
	        System.out.println(myNumbers[i][j]);
	     }
	    }
	}
	    }
