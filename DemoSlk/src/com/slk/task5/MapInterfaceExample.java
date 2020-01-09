package com.slk.task5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterfaceExample {

	public static void OldStyle()
	{
		System.out.println("========================Old Style==============================");
		
				Map map=new HashMap();
				map.put(3,"Amit");  
				
			    map.put(1,"Rahul");  
			    map.put(4,"Jai");  
			    map.put(2,"r");
			    
			    
			    
			   int index =map.get(2).hashCode();
			   
			    
			    System.out.println(index);
			   
			    System.out.println(map);
			    
			    
//			    Set set= map.entrySet();
//			    Iterator iterator = set.iterator();
//			    
//			    while (iterator.hasNext()) {
//					
//			    	Map.Entry entry = (Map.Entry)iterator.next();
//			    	System.out.println(entry.getKey() + "  " + entry.getValue());
//				}
			    	
	}
	
	
	public static void NewStyle()
	{
		System.out.println("========================New Style==============================");
				Map<Integer,String> map=new HashMap<Integer,String>();
				map.put(1,"Amit");  
			    map.put(5,"Rahul");  
			    map.put(2,"Jai");  
			    map.put(6,"ggk");
			    
			    System.out.println(map);
			    for(Map.Entry m:map.entrySet())
			    {
			    	System.out.println(m.getKey() + "  " + m.getValue());
			    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapInterfaceExample.OldStyle();
		//MapInterfaceExample.NewStyle();
		

	}

}
