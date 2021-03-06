import java.util.Random;
import java.util.Scanner;

public class KeepGuessing 
{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		int userInput = keyboard.nextInt();
		
		while (userInput != x) {
			System.out.println("That is incorrect. Guess again.");
			userInput = keyboard.nextInt();
		}
		System.out.println("That's right!  You're a good guesser.");
	}

}
