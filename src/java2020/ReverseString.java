package java2020;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="hello";
		
		String s="";
		
		char[] c =str.toCharArray();
		
		
		for(int i=c.length-1;i >=0;i--)
		{
			System.out.print(c[i]);
			
		}
		
		System.out.println();
		
		
	//	re();
		
		wholeWord();
	}
	
	
	public static void re() {
		
		String s ="Java";
		
		String str = s.toLowerCase();	
		String rev="";
		
		for(int i =str.length()-1;i >=0;i--)
		{
			rev =rev+str.charAt(i);
			
			//System.out.println(rev);
			
		}
		
		System.out.println(rev);
		
	}
	
	
	public static void wholeWord()
	{
		
		String str ="Hello this is C";
		
		
		String[] ss = str.split(" ");
		
		String revw = " ";
		
		for(int i =ss.length-1;i >=0;i--)
		{
			
			revw = revw+ss[i]+" ";
			//System.out.print(revw);
		}
		System.out.println(revw);
		
	}

}
