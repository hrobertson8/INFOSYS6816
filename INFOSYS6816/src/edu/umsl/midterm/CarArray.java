package edu.umsl.midterm;

public class CarArray {

	public static void main(String[] args) {
		String[] car = new String[5];
		car[0] = "Car 1: " + "Honda";
		car[1] = "Car 2: " + "Toyota";
		car[2] = "Car 3: " + "Ford";
		car[3] = "Car 4: " + "Audi";
		car[4] = "Car 5: " + "Nissan";
		processArray(car);
		//System.out.println("Number of cars in this array: " + car.length);
		
	}

	public static void processArray(String[] car) {
		for (String s:car) {
			System.out.println(s);
			
		}	
	}

}

