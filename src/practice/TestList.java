package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkMatch();
		
		List<String> list =new ArrayList<>();
		
		list.add("Ravi");
		list.add("Ajay");
		list.add("vijay");
		list.add("Sanjay");
		list.add("Ravi");
		
		/*Iterator itr =list.iterator();
		
		while(itr.hasNext())
		{
			
		System.out.println("The value of the item is " +itr.next());
		}*/
		
		
		/*for(String  str:list)
		{
			
			System.out.println("The value of str  is  "+str);
		}*/
		
		
		System.out.println(list.get(2));
		
		System.out.println(list.size());
		
		System.out.println(list.contains(list));
		
		
		System.out.println(list.isEmpty());
		
	}
	
	public static void checkMatch()
	{
		//String s ="HelloChennai";
	
		
		if(Pattern.matches("[a-zA-Z]", "H"))
		{
			
			System.out.println("The string matches the regular expression");
		}
		else
		{
			System.out.println("The pattern is not matching");
		}
		
	}

}
