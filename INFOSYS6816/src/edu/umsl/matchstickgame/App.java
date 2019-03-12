package edu.umsl.matchstickgame;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int numberSticks = 21;
		int numberTaken;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		while (numberSticks > 0) {

			System.out.println("There are " + numberSticks + " sticks");
			System.out.println("Your turn! How many sticks would you like to take: 1, 2, 3, or 4?");
			numberTaken = input.nextInt();
			
			if (numberTaken < 1 || numberTaken > 4) {
				System.out.println("Error! You must choose 1, 2, 3, 4");
				continue;
			} else {
				
				numberSticks = numberSticks - numberTaken;
				System.out.println("You took " + numberTaken + " sticks. There are " + numberSticks + " remaining");
			}
			
			if (numberSticks <= 0) {
				System.out.println("You lose!");
				return;
			} else {
				Random randomChoice = new Random();
						numberTaken = randomChoice.nextInt(4 - 1) + 1;
			}

			numberSticks = numberSticks - numberTaken;
			System.out.println("Computers turn! Computer took " + numberTaken + " sticks. There are " + numberSticks + " remaining");

			if (numberSticks <= 0) {
				System.out.println("You win!");
				return;
			}
		}
	}
}
