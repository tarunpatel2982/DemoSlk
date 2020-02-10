package com.slk.task5.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortingExample19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hashMap = new HashMap<String, String>();
		 hashMap.put("JDK 1.1.4", "Sparkler");
	        hashMap.put("J2SE 1.2", "Playground");
	        hashMap.put("J2SE 1.3", "Kestrel");
	        hashMap.put("J2SE 1.4", "Merlin");
	        hashMap.put("J2SE 5.0", "Tiger");
	        hashMap.put("Java SE 6", "Mustang");
	        hashMap.put("Java SE 7", "Dolphin");
	        
	        System.out.println("HashMap Before Sorting ,Random Order : ");
	        
	        Set<Entry<String,String >> entries = hashMap.entrySet();
	        
	        System.out.println(" test : ===>>  " + entries);
	        System.out.println("------------------------------------------------------------------------------------------");
	        
	        for(Entry<String, String> entry : entries)
	        {
	        	System.out.println(entry.getKey()+ " ===> " + entry.getValue());
	        }
	        System.out.println("------------------------------------------------------------------------------------------");
	        
	        System.out.println("HashMap After Sorting ,Accending Order : ");
	        
	        	TreeMap<String, String> accndingOrder = new TreeMap<String, String>(hashMap);
	        	
	        	Set<Entry<String, String>> maEntries = accndingOrder.entrySet();
	        	
	        	for(Entry<String, String> entry1 : maEntries)
	        	{
	        		System.out.println(entry1.getKey() + " ====>>> " + entry1.getValue());
	        	}
	        
	        System.out.println("------------------------------------------------------------------------------------------");
	 	        
	 	    System.out.println(" Sorting data By Value ");
	 	    
	 	    List<Entry<String, String>> lEntries = new ArrayList<Entry<String,String>>(entries);
	 	    
	 	    Comparator<Entry<String, String>> comparator = new Comparator<Map.Entry<String,String>>() {
				
				@Override
				public int compare(Entry<String, String> o1, Entry<String, String> o2) {
					// TODO Auto-generated method stub
					
					String v1 =o1.getValue();
					String v2 = o2.getValue();
					//System.out.println("test comparator ===>>> " + v1 +"   " +  v2 );
					return v1.compareTo(v2);
				}
			};
	 	    
	 	  Collections.sort(lEntries, comparator);
	 	  
	 	  Iterator<Entry<String, String>> lIterator =  lEntries.iterator();
	 	  while (lIterator.hasNext()) {
			System.out.println("iterator    "  + lIterator.next());
			
		}
	 	  
	 	     
	        
	}

}
