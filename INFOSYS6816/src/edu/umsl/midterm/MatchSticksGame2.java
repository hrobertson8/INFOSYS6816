package edu.umsl.midterm;

import java.util.Random;
import java.util.Scanner;

public class MatchSticksGame2 {
	
	public static void main(String[] args) {
		int numberSticks = 33;
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
				if (numberSticks == 5) {
					numberTaken = 4;}
				if (numberSticks == 3) {
					numberTaken = 2;}
				if (numberSticks == 2) {
					numberTaken = 1;}
				if (numberSticks == 5) {
					numberTaken = 4;}
					else {
						Random randomChoice = new Random();
						numberTaken = randomChoice.nextInt(4 - 1) + 1;	
				}
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