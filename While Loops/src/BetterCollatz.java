import java.util.Scanner;

public class BetterCollatz {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int userInput;
		int counter = 0;
		int largestNum = 0;

		System.out.println("Let's create a COLLAT SEQUENCE");

		System.out.println("RULES: ");
		System.out.println("If the number is even divide it by two");
		System.out.println("If the number is odd, Multiply by 3 and add 1");
		System.out.println("repeat this decision until you reach 1");

		System.out.println("Starting Number: ");
		userInput = keyboard.nextInt();
		do{
			if (userInput % 2 ==0) {
				userInput /=2;
				System.out.print(userInput + " ");
				counter++;
			}
			else {
				userInput *=3;
				userInput +=1;
				System.out.print(userInput + " ");
				counter++;
			}
			if (userInput > largestNum) {
				largestNum = userInput;
			}
		}
		while( userInput != 1);
			System.out.println("");	
			System.out.println("Code excuted " + counter);
			System.out.println("Largest number was " + largestNum);
		}
}
