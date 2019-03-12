package edu.umsl.fooddiary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FoodDiaryApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		try {
			String filename = "Food Diary.csv";
			FileWriter writer = new FileWriter(filename, true);
			StringBuilder sb = new StringBuilder();
			StringBuilder hb = new StringBuilder();

			hb.append("Date");
			hb.append(",");
			hb.append("Meal");
			hb.append(",");
			hb.append("Food Item");
			hb.append(",");
			hb.append("Calories");
			hb.append(",");
			hb.append("Carbs");
			hb.append(",");
			hb.append("Sugar");
			hb.append(",");
			hb.append("Fiber");
			hb.append(",");
			hb.append("Protein");
			hb.append(",");
			hb.append("Total Fat");
			hb.append('\n');

			BufferedReader br = new BufferedReader(new FileReader("Food Diary5.csv"));
			if (br.readLine() == null) {
				writer.write(hb.toString());
			}

			Scanner sc = new Scanner(System.in);
			int numberOfEntries;
			int numberOfEntriesLeft = 0;

			System.out.println("Welcome to your Food Diary! How many food items would you like to enter?");
			System.out.println("-------------------------------------------");
			numberOfEntries = sc.nextInt();
			System.out.println(numberOfEntries + "!" + " Nice. Let's get started.");

			while (numberOfEntries > 0) {
				System.out.println("Enter Date");
				String date = sc.next();
				sb.append(date);
				sb.append(",");

				System.out.println("Enter Meal");
				String meal = sc.next();
				sb.append(meal);
				sb.append(",");

				System.out.println("Enter Food Item");
				String foodItem = sc.next();
				sb.append(foodItem);
				sb.append(",");

				System.out.println("Enter Calories");
				String calories = sc.next();
				sb.append(calories);
				sb.append(",");

				System.out.println("Enter Carbs");
				String carbs = sc.next();
				sb.append(carbs);
				sb.append(",");

				System.out.println("Enter Sugar");
				String sugar = sc.next();
				sb.append(sugar);
				sb.append(",");

				System.out.println("Enter Fiber");
				String fiber = sc.next();
				sb.append(fiber);
				sb.append(",");

				System.out.println("Enter Protein");
				String protein = sc.next();
				sb.append(protein);
				sb.append(",");

				System.out.println("Enter Fat");
				String fat = sc.next();
				sb.append(fat);
				sb.append(",");
				sb.append('\n');

				numberOfEntriesLeft = numberOfEntries - 1;
				numberOfEntries--;

				System.out.println("You have " + numberOfEntriesLeft + " food item(s) left to enter.");
				System.out.println("-------------------------------------------");

				if (numberOfEntries <= 0) {
					writer.write(sb.toString());
					System.out.println("File Printed!");
					writer.close();
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
