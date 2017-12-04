import java.util.Scanner;

public class TwoQuestions 
{
	public static void main(String[] args) 
	{
		String userInput1, userInput2;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("TWO QUESTIONS");
		System.out.println("Think of an object, and I'll try and guess what it is");
		
		System.out.println("Question 1: Is it an animal, vegitable or mineral?");
		userInput1 = keyboard.next();
		
		if (userInput1.equalsIgnoreCase("animal")) {
			System.out.println("is it bigger than a bread box?");
			userInput2 = keyboard.next();
			if (userInput2.equalsIgnoreCase("no")) {
				System.out.println("Is it a SQUIRREL");
			}
			else if (userInput2.equalsIgnoreCase("yes")) {
				System.out.println("Is it a MOOSE");
			}
		}
		else if (userInput1.equalsIgnoreCase("vegitable")) {
			System.out.println("is it bigger than a bread box?");
			userInput2 = keyboard.next();
			if (userInput2.equalsIgnoreCase("no")) {
				System.out.println("Is it a CARROT");
			}
			else if (userInput2.equalsIgnoreCase("yes")) {
				System.out.println("Is it a WATERMELON");
			}
		}
		else if (userInput1.equalsIgnoreCase("mineral")) {
			System.out.println("is it bigger than a bread box?");
			userInput2 = keyboard.next();
			if (userInput2.equalsIgnoreCase("no")) {
				System.out.println("Is it a PAPER CLIP");
			}
			else if (userInput2.equalsIgnoreCase("yes")) {
				System.out.println("Is it a CAMARO");
			}
		}
	}
}
