import java.util.Scanner;

public class UserInputofData 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String firstName, lastName, login;
		int grade, studentID;
		double GPA;
		
		System.out.println("Please enter your information so I can sell it for profit");
		
		System.out.println("First name: ");
		firstName = keyboard.next();
		
		System.out.println("Last name: ");
		lastName = keyboard.next();
		
		System.out.println("Grade (9-12): ");
		grade = keyboard.nextInt();
		
		System.out.println("Student ID: ");
		studentID = keyboard.nextInt();
		
		System.out.println("Login: ");
		login = keyboard.next();
		
		System.out.println("GPA (0.0-4.0): ");
		GPA = keyboard.nextDouble();
		
		System.out.println("Your information: ");
		System.out.println("Login:" + login);
		System.out.println("ID: " + studentID);
		System.out.println("Name: " + lastName + ", " + firstName);
		System.out.println("GPA: " + GPA);
		System.out.println("Grade: " + grade);
		
		keyboard.close();
	}

}
