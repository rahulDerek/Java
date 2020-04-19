package techMeDevotedArrays;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = {1,2,7,1,8,2,7,9};
		uniqueElements(a1);
	}
	
	public static void uniqueElements(int[] a)
	{
		
		int counter = 0;
		
		for(int i =0; i < a.length;i++)
		{
			boolean isUnique = false;
			for(int j=0; j < i;j++)
			{
				if(a[i] == a[j])
				{
					isUnique = true;
					//System.out.println("The duplicate elements are "+a[i]+"");
					//System.out.println("--------------------------------------");
					break;
				}
				
			}
			
			
			  if(!isUnique) { System.out.println("The unique numbers are "+a[i]+ " "); }
			 
			
			if(isUnique)
			{
				System.out.println("The duplicate elements are "+a[i]+"");
			}
		}
	}

}
