package edu.umsl.collections;

public class Shoe {
	
	String name;
	String size;
	String model;
	
	public Shoe(String name, String size, String model) {
		
		this.name = name;
		this.size = size;
		this.model = model;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	

}
