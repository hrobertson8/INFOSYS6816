package edu.umsl.collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Collections");
		list.add("are");
		list.add("Fun!");
		
		int size = list.size();
		System.out.println(size);
		
		System.out.println(list.get(2));
		
		for(String s:list) {
			System.out.println(s);
		}

	}
	
}
