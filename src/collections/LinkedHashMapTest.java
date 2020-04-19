package collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class LinkedHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map =new HashMap<Integer,String>();
		
		LinkedHashMap<Integer, String> linkedHashMap =new LinkedHashMap<Integer,String>();
		
		TreeMap<Integer, String> treeMap =new TreeMap<Integer,String>();
		
		testMap(treeMap);
		
		String a ="In 1994, which of the following vehicles did you finance, lease, or use as security for a loan?";
		//String b ="In " + "\d{4}" +", which of the following vehicles did you finance, lease, or use as security for a loan?";
		/*if (a.c(b))
		{
			System.out.println("string matches");
		}
		else
		{
			System.out.println("string not matches");
		}*/
	}
	public static void testMap(Map<Integer, String > map)
	{
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8,"dog");
		map.put(1, "Lion");
		map.put(0,"Duck");
		map.put(15, "bear");
		
		for(Integer key:map.keySet())
		{
			String value =map.get(key);
			
			System.out.println(key +":"+value);
			
		}
		
	}
	
	

}
