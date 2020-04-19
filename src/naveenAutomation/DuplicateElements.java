package naveenAutomation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//duplicate();
		
		//duplicateSet();
		
		duplicateMap();
		
	}	
		public static void duplicate() {
			
			
			String[] str= {"java","c","Csharp","java"};
			
			
			for(int i=0; i <str.length;i++) {
				
				for(int j=i+1;j< str.length;j++)
				{
					if(str[i].equals(str[j]))
					{

						System.out.println("The Duplicate element is "+str[i]);
						
					}
					
					
				}
			}
			
		}
		
		public static void duplicateSet() {
			
			
			String[] str= {"java","c","Csharp","java"};
			
			Set<String> set = new HashSet<String>();
			
			for(String item :str) {
				
				
				if(!set.contains(item))
				{
				set.add(item);
				}
				
				else
				{
					
					System.out.println("Duplicate element from Set Method  is "+item);
				}
			}
			
			
		}
		
		
		public static void duplicateMap() {
			
			
			String[] str= {"java","c","Csharp","java"};
			
			//using Map interface
			
			Map<String,Integer> map = new HashMap<String,Integer>();
			
			
			for(String course:str)
			{
				
				if(!map.containsKey(course))
				{
					map.put(course, 1);
				}
				
				else
				{
					
					map.put(course, map.get(course)+1);
					
					
				}
			}
			
			
			
			for(Map.Entry<String,Integer>  entrySets :map.entrySet())
			{
				  
				System.out.println("The course name is "+entrySets.getKey()+"  and it appears "+entrySets.getValue());
			}
			
//			Set<Entry<String,Integer>> entry = map.entrySet();
//			
//			for(Entry<String,Integer>  entrySets :entry)
//			{
//				  
//				System.out.println("The course name is "+entrySets.getKey()+"  and it appears "+entrySets.getValue());
//			}
			
			
		}
	

}
