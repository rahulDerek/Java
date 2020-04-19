package java2020;

public class TestSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="ubc980";
		
		StringBuffer sb =new StringBuffer();
		
		StringBuffer sb1 =new StringBuffer();
		
		
			char[] c = str.toCharArray();
			
			boolean x;

			for( Character ch:c)
			{
				//System.out.println(ch);
				
			   x = ch.isDigit(ch);
			   
			   if(x==true)
			   {
				   sb.append(ch);
			   }
			   
			   else
			   {
				   sb1.append(ch);
			   }
				
			}
			
//			System.out.println(sb.toString());
//			
//			System.out.println(sb1.toString());
//			
			String s1 =sb.toString();
			
			String s2 =sb1.toString();
			
			int a =0;
			int b=a+1;
			
			//String r1 =s1.substring(0, 1)+s2.substring(0, 1);
			
			
			String r="";
			//System.out.println(r1);
			
		/*
		 * String r2 = s1.substring(1, 2)+s2.substring(1, 2); System.out.println(r2);
		 * 
		 * String r3 = s1.substring(2, 3)+s2.substring(2, 3); System.out.println(r3);
		 */
			
			for(int i =0; i<=2;i++)
			{
				
				 r =s1.substring(i, i+1)+s2.substring(i, i+1);
				 System.out.println("The string concatenation is "+r);
				
			}
			
			
			
		}
		
	

}
