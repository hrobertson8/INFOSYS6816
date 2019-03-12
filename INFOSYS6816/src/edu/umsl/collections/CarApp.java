package edu.umsl.collections;

import java.util.ArrayList;
import java.util.List;

public class CarApp {
	
	public static void main(String[] args) {
		
		List<Car> list = new ArrayList<Car>();
		
		CarApp carApp = new CarApp(); //can't call non static method from static method, so much instantiate class to create car
		
		list.add(carApp.createCar("green", "honda", "civic", "4"));
		
		carApp.printCar(list);
		
	}
	//create new method so it's cleaner way of creating new & small. Only need to do one thing 
	public Car createCar(String color, String name, String model, String doors) {
		return new Car(color, name, model, doors);
	}
	
	public void printCar(List<Car> list) {
		for(Car c:list) {
			System.out.println("Color: " + c.getColor());
			System.out.println("Name: " + c.getName());
		}
	}

}
