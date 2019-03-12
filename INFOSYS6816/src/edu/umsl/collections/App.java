package edu.umsl.collections;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Shoe> list = new ArrayList<Shoe>();

		// static method. Can't make the other method static b/c we want object
		// oriented. Instantiate class
		App app = new App();

		list.add(app.createShoe("Nike", "8", "Running"));
		list.add(app.createShoe("ASICS", "10", "Casual"));
		list.add(app.createShoe("Addidas", "7", "Walking"));
		list.add(app.createShoe("Saucony", "7", "Casual"));
		list.add(app.createShoe("Brooks", "8", "Workout"));

		app.printShoes(list);
	}

	public Shoe createShoe(String name, String size, String model) {
		return new Shoe(name, size, model);

	}

	public void printShoes(List<Shoe> list) {

		for (Shoe s : list) {

			System.out.println("Name: " + s.getName());
			System.out.println("Size: " + s.getSize());
			System.out.println("Model: " + s.getModel());
		}

	}

}
