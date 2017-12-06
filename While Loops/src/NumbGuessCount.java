import java.util.Random;
import java.util.Scanner;

public class NumbGuessCount {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		int count = 0;
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		int userInput = keyboard.nextInt();
		count++;
		
		do {
			System.out.println("That is incorrect. Guess again.");
			userInput = keyboard.nextInt();
			count++;
		} 
		while (userInput != x); {
			
		}
		System.out.println("That's right!  You're a good guesser.");
		System.out.println("It only took you " + count + " tries");
	}
}
