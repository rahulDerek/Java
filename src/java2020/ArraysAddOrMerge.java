package java2020;

public class ArraysAddOrMerge {

	public static void main(String[] args) {
		
		int[] a ={10,20,30};
		
		int[] b={40,50,60,70};
		
		int a_length = a.length;
		
		int b_length = b.length;
		
		int[] c = new int[a.length+b.length];
		
		for(int i=0; i <a_length;i++)
		{
			c[i]=a[i];
			
		}
		
		//At this time all the elements in array is transfered to c
		
		for(int j=0; j <b_length;j++) {
			
			c[a_length+j] = b[j];
		}
		
		 for(int k=0;k < c.length;k++)
		 {
			 System.out.print(c[k]+" ");
			 
		 }
		 System.out.println();
	}

}
