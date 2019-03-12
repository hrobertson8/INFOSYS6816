package edu.umsl.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		App app = new App();
		app.hashSet();
		app.hashSetWithMyOwnObject();

	}

	public void hashSet() {

		Set<String> stringHashSet = new HashSet<>();

		stringHashSet.add("Honda");
		stringHashSet.add("Audi");
		stringHashSet.add("Tesla");
		stringHashSet.add("Tesla");

		for (String car : stringHashSet) {
			System.out.println(car);
		}
		
		System.out.println("==================================");

	}
	
	public void hashSetWithMyOwnObject() {
		
		//only returns 2 cars because compared by name
		Set<Car> carHashSet = new TreeSet<>(new CarComparator());
		
		//order you list them in
		//Set<Car> carHashSet = new LinkedHashSet<>();
		
		//random order
		//Set<Car> carHashSet = new HashSet<>();
		
		carHashSet.add(new Car("Honda", "Accord", 4));
		carHashSet.add(new Car("Honda", "Accord", 4));
		carHashSet.add(new Car("Toyota", "Camry", 2));
		carHashSet.add(new Car("Honda", "Civic", 4));
		
		for(Car car:carHashSet) {
			
			System.out.println(car.name +" "+ car.type +" " + car.numberOfDoors);
		}
	}
}
