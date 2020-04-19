package covid;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.append("java"));
		
		System.out.println(sb.capacity());
		
		sb.append("is the good lan");
		
		System.out.println(sb.append("is the good lan"));
		
		System.out.println(sb.capacity());
		
		StringBuffer sa = new StringBuffer("deepak");
		
		StringBuffer sc = new StringBuffer("deepak");
		System.out.println("------------------------------------------------------");
		System.out.println(sa == sc);
		
		System.out.println(sa.equals(sc));
		
		System.out.println("------------------------------------------------------");
		removeRepChar();
	}
	
	public static void removeRepChar()
	{
		
		
		String str = "java";
		
		StringBuffer sb = new StringBuffer();
		
		while(str.length() > 0)
		{
			
			
			sb.append(str.substring(0, 1));
			
			str=str.replaceAll( str.substring(0, 1),"");
		}
		
		System.out.println("After removing duplicate characters------------    " +sb.toString());
		
	}

}
