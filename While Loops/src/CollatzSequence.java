import java.util.Scanner;

public class CollatzSequence {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int userInput;
		int finalNum = 1;
		
		System.out.println("Let's create a COLLAT SEQUENCE");
		
		System.out.println("RULES: ");
		System.out.println("If the number is even divide it by two");
		System.out.println("If the number is odd, Multiply by 3 and add 1");
		System.out.println("repeat this decision until you reach 1");
		
		System.out.println("Starting Number: ");
		userInput = keyboard.nextInt();
		
		while (userInput != 1){
			if (userInput % 2 == 0) {
				userInput /= 2;	
				System.out.print(userInput);
					
				}
				else if (userInput % 2 != 0) {
					userInput *= 3 + 1 ;
					
					System.out.print(userInput);
		}
	
	}
}
}