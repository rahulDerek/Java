package java2020;

public class ArrayDeleteElement {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50,60};
		
		int delete_element = 30;
		
		int temp=0;
		for(int i=0; i <a.length;i++)
		{
			
			if(delete_element ==a[i])
			{
				
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
					
				}
				
				
				temp = temp+1;
				break;
				
				
			}
			
		}
		
		if(temp == 0)
		{
			System.out.println("The Search element is not available in the given array");
		}
		
		else
		{
			
			System.out.println("The Search element is  available in the given array ");
			
		}

	}

}
