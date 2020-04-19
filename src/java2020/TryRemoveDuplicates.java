package java2020;

public class TryRemoveDuplicates {

	public static void main(String[] args) {
		
		String s ="java";
		
		StringBuffer sb = new StringBuffer();
		
		while(s.length() > 0)
		{
			
			String str	= s.substring(0,1);
			
			sb.append(str);
			
			s = s.replaceAll((s.substring(0,1)), "");

		}
		
		System.out.println(sb.toString());
		System.out.println("Hello");
	}

}
