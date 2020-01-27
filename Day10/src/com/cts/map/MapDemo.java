package com.cts.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, Integer> map=new TreeMap<String, Integer>();
		map.put("Java", 8000);
		map.put("Python", 5000);
		map.put("PHP", 10000);
		map.put("Java", 7000);
		
		System.out.println(map);

		System.out.println(map.containsKey("PHP"));
		
		System.out.println(map.containsValue(7000));
		
		System.out.println(map.get("PHP")); //only used with key
		
		map.replace("PHP", 10000, 7000);  //it will change the value
		
		System.out.println(map);
		
		//Method 1
		for(Entry<String, Integer> entry: map.entrySet()) { //you can use Entry or Map.Entry, both are same
			
			System.out.println(entry.getKey()+" ---> "+entry.getValue());
		}
		
		//Method 2
		Set<Entry<String, Integer>> entries=map.entrySet(); //you can use Entry or Map.Entry, both are same
			
		for(Entry<String, Integer> ent: entries) {
			System.out.println(ent.getKey()+" ---> "+ent.getValue());
		}
		
	}

}
