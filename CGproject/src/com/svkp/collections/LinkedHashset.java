package com.svkp.collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashset {

	public static void main(String[] args) {
		   LinkedHashMap<Integer,String> num_map=new LinkedHashMap<Integer,String>();  
		   num_map.put(1,"RedMi");  
		   num_map.put(2,"Realme");  
		   num_map.put(3,"Apple");
		   num_map.put(4,"Vivo");
		   num_map.put(5,"OnePlus");
		   num_map.put(6,"Oppo");
		   num_map.put(7,"Samsung");
		   System.out.println("Mobile Brands Available in Market:");
		   
		   for(Entry<Integer, String> m:num_map.entrySet()){  
		        System.out.println(m.getKey()+" "+m.getValue());  
		   }  
		 }  
	}
