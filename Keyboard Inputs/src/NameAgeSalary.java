import java.util.Scanner;

public class NameAgeSalary 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		double sallary;
		
		System.out.println("Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.println("Hi, " + name + "! How old are you?");
		age = keyboard.nextInt();
		
		System.out.println("So you are " + age + "? I guess that's not too old, " + name + ". How much do you make per hour?");
		sallary = keyboard.nextDouble();
		
		System.out.println("Wow, " + sallary + " is a lot for your age!");
		
		
	}
}
