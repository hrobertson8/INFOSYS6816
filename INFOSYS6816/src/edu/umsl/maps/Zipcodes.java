package edu.umsl.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Zipcodes {

	public static void main(String[] args) {
		Zipcodes zipcodes = new Zipcodes();
		zipcodes.zipcodeHashMap();

	}

	public void zipcodeHashMap() {
		Map<Integer, String> hashMap = new HashMap<>();

		hashMap.put(60606, "Chicago");
		hashMap.put(63121, "St. Louis");
		hashMap.put(10001, "NYC");

		Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
		{

			for (Map.Entry<Integer, String> entry : entries) {

				System.out.println(entry.getValue());
			}
		}
	}

}
