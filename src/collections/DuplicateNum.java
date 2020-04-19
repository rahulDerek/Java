package collections;
import java.util.HashSet;
import java.util.Set;


public class DuplicateNum {

	public static void main(String[] args) {
		int[] a = {2,5,8,2,3,5, 2, 7,6,2,5};
		
		for(int i=0;i < a.length;i++)
		{
			int searchNumber =a[i];
			
			int searchCount =0;
			
			for (int j=1;j <a.length;j++)
			{
				
				if(searchNumber ==a[j])
				{
					searchCount++;
					
					
				}
			}
			
			System.out.println(searchCount);
			
		}
		
	}

}
