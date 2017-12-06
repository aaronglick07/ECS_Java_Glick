import java.util.Random;
import java.util.Scanner;

public class HiLowLimited {
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int num = 1 + r.nextInt(100);
		int userInput;
		int tries = 0;
		
		System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
		userInput = keyboard.nextInt();
		if (num == userInput) {
			System.out.println("You guessed it! What are the odds?!?");
		}
		while(num != userInput && tries <= 7){
			if (userInput > num) {
				System.out.println("Sorry, you are too high.");
				userInput = keyboard.nextInt();
				tries++;
			}
			else if (userInput < num) {
				System.out.println("sorry, you are too low.");
				userInput = keyboard.nextInt();
				tries++;
			}
		}
		if (num == userInput) {
			System.out.println("You guessed it! What are the odds?!?");
		}
		else if (tries == 7) {
			System.out.println("you have ran out of tries");
		}
	}
}
