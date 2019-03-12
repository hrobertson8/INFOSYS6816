package edu.umsl.collections;

public class Constructors {
	
	public static void main(String[] args) {
		 
		Car c = new Car("Blue","Honda", "Civic", "4" );
		
		System.out.println(c.getColor());
		System.out.println(c.getDoors());
		System.out.println(c.getModel());
		System.out.println(c.getName());
	}

}
