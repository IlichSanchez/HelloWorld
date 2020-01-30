package workbench;

import java.util.Random;
import java.util.Scanner;

public class OddsAndEvens {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Let's play a game called \"Odds and Evens\" ");
		System.out.println("What\'s your name?");
		String name = input.nextLine();
		System.out.println("Hello " + name + " , which do you choose? (O)Odds or (E)Evens?");
		String option = input.next();
		
		while (!option.equals("O") && !option.equals("o") && !option.equals("E") && !option.equals("e")) {
			System.out.println("That is an invalid option. Please enter O or E.");
			option = input.next();
		}
		if(option.equals("O") || option.equals("o"))  {
			System.out.println(name + " has picked odds! The computer will be evens.");
		}
		else if(option.equals("E") || option.equals("e")) {
			System.out.println(name + " has picked evens! The computer will be odds.");
		}
		System.out.println("--------------------------------------------------------------");	
			
		
		System.out.println("How many \"fingers\" do you put out? Enter an integer number: ");
		int playerFingers = input.nextInt();
			int oddEvenInputValidation = playerFingers % 2;
			
			if (option.equals("O") || option.equals("o")) {
			do {
				System.out.println("You input an even number and your selection was an odd number. Please enter an odd number: ");
				playerFingers = input.nextInt();
				oddEvenInputValidation = playerFingers % 2;
				}
				while (oddEvenInputValidation == 0);
			} else if (option.equals("E") || option.equals("e")) {
				do {
				System.out.println("You input an odd number and your selection was an even number. Please enter an odd number: ");
				playerFingers = input.nextInt();
				oddEvenInputValidation = playerFingers % 2;
				}
				while (oddEvenInputValidation == 1);
		
			}
				
			Random rand = new Random();
			int computerNumber = rand.nextInt(9);
			System.out.println("The computer plays " + computerNumber + " \"fingers\".");
			System.out.println("--------------------------------------------------------------");
			
			int sum =  playerFingers + computerNumber;
			System.out.println(playerFingers + " + " + computerNumber + " = " + sum);
			
			boolean oddOrEven = sum % 2 == 0;
			if (oddOrEven == true) {
				System.out.println(sum + " is ...even!");
					if(option.equals("E") || option.equals("e")) {
						System.out.println("That means " + name + " wins! :)");
																 }
					else {
							System.out.println("That means the computer wins! And this is how Skynet started...");
						 }
									}
			else {
					System.out.println(sum + " is ...odd!");
					if(option.equals("O") || option.equals("o")) {
						System.out.println("That means " + name + " wins! :)");
																 }
					else {
							System.out.println("That means the computer wins! And this is how Skynet started...");
						 }
				}
			System.out.println("--------------------------------------------------------------");
			input.close();
		
		}
}