package edu.umsl.collections;

public class Car {
	
	private String color;
	private String name;
	private String model;
	private String doors;
	
	public Car(String color, String name, String model, String doors) {
		
		this.name = name;
		this.color = color;
		this.model = model;
		this.doors = doors;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}
	}