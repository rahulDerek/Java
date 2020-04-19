package covid;

public class AddOrMergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//merge();
		
		largestAndSmallestNumber();
	}
	
	//Add or merge arrays
	public static void merge()
	{
		int[] a = {1,2,3,4};
		
		int[] b = {5,6,7};
		
		//find length of array a 
		
		int a_length = a.length;
		
		int b_length = b.length;
				
		int[] c = new int[a_length+b_length];
		
		for(int i=0; i <a_length;i++)
		{
			
			c[i] =a[i];
			
			//System.out.print(c[i]+ " ");
		}
		
		//System.out.println();
		
		
		for(int j=0; j< b_length;j++)
		{
			
			c[a_length+j] =b[j];
			
			//System.out.print(c[a_length+j]+" ");
		}
		
		//System.out.println();
		
		for(int cval : c)
		{
			
			System.out.print(cval + " ");
		}
		
		System.out.println();
	}
	
	public static void largestAndSmallestNumber()
	{
		int[] a1 = {1,2,3,44,25,16};
		
		int largestNumber =a1[0];
		
		for(int i =0; i <a1.length;i++)
		{
			
			if(a1[i] > largestNumber)
			{
				
				largestNumber = a1[i];
			}
		}
		
		System.out.println("The largest number in the given array is  "+ largestNumber);
		
		//findout the smallest number
		
		int smallestNumber = a1[0];
		
		for(int j=0; j<a1.length;j++)
		{
			
			if(a1[j] < smallestNumber)
			{
				smallestNumber = a1[j];
				
			}
		}
		
		System.out.println("The smallest number in the given array is  "+ smallestNumber );
	}

}
