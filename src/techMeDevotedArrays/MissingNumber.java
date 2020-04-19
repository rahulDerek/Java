package techMeDevotedArrays;

public class MissingNumber {

	public static void main(String[] args) {
		
     int[] a = {1,2,3,4,6,7};
     //Find the length of the array
     int n =a.length+1;
     
     System.out.println(n);
     
     int sum = (n*(n+1))/2;
     
     System.out.println(sum);
     
     int sum1 =0;
     //To get the missing number you need 
     for(int i=0; i <a.length;i++)
     {
    	 sum1 = sum1 +a[i];
     }
     
     System.out.println("The Sum1 is "+sum1);
     System.out.println("The missing number is "+(sum-sum1));
	}
}
