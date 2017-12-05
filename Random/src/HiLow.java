import java.util.Random;
import java.util.Scanner;

public class HiLow 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int num = 1 + r.nextInt(100);
		int userInput;
		
		System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
		userInput = keyboard.nextInt();
		
		if (num == userInput) {
			System.out.println("You guessed it! What are the odds?!?");
		}
		else if (userInput > num) {
			System.out.println("Sorry, you are too high.  I was thinking of " + num);
		}
		else if (userInput < num) {
			System.out.println("sorry, you are too low.  I was thinking of " + num);
		}
	}
}
