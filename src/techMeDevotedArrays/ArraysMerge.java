package techMeDevotedArrays;

public class ArraysMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a1 = {1,2,3,15,19};
		
		int[] a2 = {18,20,22};
		
		int[] merge = new int[a1.length+a2.length];
		
		
		int counter = 0;
		
		
		for(int i=0;i <a1.length;i++)
		{
			merge[i] = a1[i];
			counter++;
		}
		//System.out.println(counter++);
		
		for(int j=0; j<a2.length;j++) {
			
			merge[counter++]=a2[j];
			
			//System.out.println(counter);
			
		//System.out.println(counter++);
			
		}
		System.out.println(merge.length);
		
		for(int k=0; k<merge.length;k++)
		{
			System.out.println(merge[k]+ " ");
		}
		
	}

}
