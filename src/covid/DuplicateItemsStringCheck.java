package covid;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateItemsStringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dupCheck();
		
	//	dupCheckSet();
		
		//mapTest();
		
		mapDuplicateCheck();
	}
	
	public static void dupCheck()
	{
		
		String[] c = {"java","C","java","python","C"};
		
		for(int i =0; i < c.length;i++)
		{
			
			for(int j =i+1;j<c.length;j++)
			{
				
				if(c[i].equalsIgnoreCase(c[j]))
				{
					
					System.out.print("The array contains duplicate item  "+c[i]);
				}
				
				
				
			}
			
			System.out.println();
		}
		
	}
	
	//Using set method
	
	
	public static void dupCheckSet()
	{
		String[] c = {"java","C","java","python","C"};
		
		
		Set<String> se = new HashSet<String>();
		
		StringBuffer sb = new StringBuffer();
		
		StringBuffer sb1 = new StringBuffer();
		
		
		for(int i=0; i < c.length; i++)
		{
			
			if(!se.contains(c[i]))
			{
				
				se.add(c[i]);
				sb.append(c[i]);
			}
			
			else
			{
				sb1.append(c[i]+" ");
				System.out.println("The duplicate itme is  "+c[i]);
			}
		}
		
		
		System.out.println("The duplicate items in list using stringbuffer is "+sb1.toString());
		
		
	}

	
	public static void mapTest()
	{
		Map<String,Integer> m = new HashMap<String,Integer>();
		
		m.put("Honda", 1);
	    m.put("Toyota", 2);
	    m.put("Nissan", 3);
	  
		
	for(Map.Entry<String,Integer>  e  :m.entrySet())
	{
		
			String keyvalue =e.getKey();
		
			int val =e.getValue();
			
			System.out.println("The key is "+keyvalue+" and the corresponding value is "+val);
	}
		
		
	}
	
	public static void mapDuplicateCheck() {
		
		
		try{
			
			String[] cars = {"Honda","Toyota","Honda","Nissan"};
			
			Map<String,Integer> mp = new HashMap<String,Integer>();
			
			for(String car :cars) {
			
			if(!mp.containsKey(car))
			{
				mp.put(car, 1);
				
			}
			
			else
			{
				mp.put(car, mp.get(car)+1);
			}
			}
			
			
	for(Map.Entry<String, Integer>	ent	:mp.entrySet())
		
	{
		System.out.println("The car name is "+ent.getKey()+"   and it appeared "+ent.getValue()+ "  times");
	
	}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
	}
}
