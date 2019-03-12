package edu.umsl.fooddiary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {
			StringBuilder sb = new StringBuilder();

			sb.append("Date");
			sb.append(",");
			sb.append("Meal");
			sb.append(",");
			sb.append("Food Item");
			sb.append(",");
			sb.append("Calories");
			sb.append(",");
			sb.append("Carbs");
			sb.append(",");
			sb.append("Sugar");
			sb.append(",");
			sb.append("Fiber");
			sb.append(",");
			sb.append("Protein");
			sb.append(",");
			sb.append("Total Fat");
			sb.append('\n');
			
			String loggedIn = "yes";
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("Welcome to My Food Diary!");
				System.out.println("Date");
				String date = sc.next();
				sb.append(date);
				System.out.println("Enter yes to continue entering food items or no to exit and export your CSV.");
				loggedIn = sc.next();
			} while (loggedIn.equals ("yes") || loggedIn.equals("YES") || loggedIn.equals("Yes") );
			

			writer.write(sb.toString());

			System.out.println("File Printed!");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
