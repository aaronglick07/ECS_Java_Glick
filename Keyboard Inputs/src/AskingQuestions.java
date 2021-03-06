// This line of code imports the scanner utility so it can be used in this code
import java.util.Scanner;

public class AskingQuestions 
{
	public static void main(String[] args) 
	{
		//This line seems to create a scanner named keyboard which will allow for the system to gather input
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age, feet, inches;
		double weight;
		
		System.out.println("What is your name? ");
		name = keyboard.next();
		
		System.out.println("How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println("How many feet tall are you? ");
		feet = keyboard.nextInt();
		
		System.out.println("How many inches ");
		inches = keyboard.nextInt();
		
		System.out.println("How much do you weigh? ");
		weight = keyboard.nextDouble();
		
		System.out.println("So you're name is " + name + ", you are " + age + " years old you're " + feet + "'" + inches + " , and you weigh " + weight + " pounds.");
		
		keyboard.close();
	}

}
/* The program uses variable types to differentiate between what types of information is being brought in by doing next then the type of variable, if the variable is not specified than the program will assume it is a string.
 * An example of this is on line 16(my code) or line 14(The lab picture) other examples are on lines 25 and 28 (my code) or line 23 or 26 (lab picture)
 * 
 * The code will not run if you change the next to nextInt one line 14(mycode) or line 16(lab picture) this is because the variable type of name is not an int but rather a String
 *
 *The Difference between println and print is that println will print on a new line, where print just prints on the same line
 */
