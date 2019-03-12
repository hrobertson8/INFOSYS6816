package edu.umsl.finalspring19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StateSorterApp {

	public static void main(String[] args) {
		List<String> states = new ArrayList<String>();
		states.add("Missouri");
		states.add("Illinois");
		states.add("California");
		states.add("Washington");
		states.add("Maine");

		Collections.sort(states);

		Iterator<String> sort = states.iterator();
		while (sort.hasNext()) {
			System.out.println(sort.next());
		}
	}

}
