package edu.umsl.matchstickgame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class AppUsers {
	
	public static void main(String[] args) throws IOException {

		int numberSticks = 21;
		int numberTaken;
		String viewUserList;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner input2 = new Scanner(System.in);
		
		
		//BufferedReader br = new BufferedReader(new FileReader(file));
		File f = new File("/Users/HannahRobertson/eclipse-workspace/INFOSYS6816/src/edu/umsl/matchstickgame/users.txt");
		FileReader fr = new FileReader(f);
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(fr);
		

			while (numberSticks >= 0) {
				
				if (numberSticks == 21) {
					System.out.println("Would you like to see who else has played this game? (Yes/No)");
					viewUserList = input2.nextLine();
				
					if (viewUserList.equals("Yes") || viewUserList.equals("yes")) {
						String users = null;
						while ((users = br.readLine()) != null)
						System.out.println("Players: " + users);
					}
						System.out.println("Let's play!");
					}
				
			
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
			
				
