package databaseConnection;

public class StringManipulation {

	public static void main(String[] args) {
		String s="the quick brown fox jumps over the little lazy dog";
		
		
		StringBuffer res= new StringBuffer();
		while(s.length() >0)
		{
			res.append(s.substring(0,1));
			
			
			System.out.println(s.substring(0,1));
			s=s.replaceAll(s.substring(0,1), "");
			System.out.println(s);
			
		}
		
		System.out.println("result" + res);
		
				
		
		
		StringBuffer sbuff =new StringBuffer();
		s="the quick brown fox jumps over the little lazy dog";
		
		System.out.println("Reverse String"+s.length());
		
		StringBuffer gg =new StringBuffer(s);
		
		
		System.out.println("Hello" +gg.reverse());
		
		
		
		for (int i=s.length()-1;i >= 0;i--){
			
			sbuff.append(s.charAt(i));
			
		}
		System.out.println(sbuff);
	}

}
