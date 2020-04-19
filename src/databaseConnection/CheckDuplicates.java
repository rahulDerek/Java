package databaseConnection;

public class CheckDuplicates {
	
	public static void main(String args[]){
		
		
		int[] a ={2,5,8,2,3,5, 2, 7,6,2,5};
		
		for(int i=0;i < a.length;i++){
			
			
			int searchNum =a[i];
			
			int searchCount =0;
			
			for(int j=i+1;j<a.length;j++)
			//for(int j=0;j<a.length;j++)
			{
				
				if(a[j] == searchNum)
				{
				 searchCount++;
				 
				}
					
			}
			
			if (searchCount > 1){
				
				System.out.println("The duplicate is" +searchNum);
				
				
			}
			
		}
	}

}



