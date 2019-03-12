package edu.umsl.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LearnMaps {

	public static void main(String[] args) {
		LearnMaps maps = new LearnMaps();
		maps.hashMap();
		//LearnMaps.linkedHashMap();

	}
	
	public void hashMap() {
		Map<String, String> hashMap = new HashMap<>();
		
		hashMap.put("Green", "Up");
		hashMap.put("Yellow", "Warning");
		hashMap.put("Red", "Down");
		
		//System.out.println(hashMap.get("Red"));
		
		Set<Map.Entry<String, String>> entries = hashMap.entrySet();{
			
			for(Map.Entry<String, String> entry:entries) {
				
				System.out.println(entry.getValue());
			}
		}
		
	}
	
	public static void linkedHashMap() {
		//why instantiate class if we can make static methods? USing all static methods = procedural programs
		//static = faster
		//use when instantiate is not needed
		Map<String, String> hashMap = new LinkedHashMap<>();
		
		hashMap.put("Green", "Up");
		hashMap.put("Yellow", "Warning");
		hashMap.put("Red", "Down");
		
		System.out.println(hashMap.get("Yellow"));
		
	}

}
