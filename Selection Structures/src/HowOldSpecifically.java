import java.util.Scanner;

public class HowOldSpecifically 
{
	public static void main(String[] args) 
	{
		String name;
		int age;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = keyboard.next();
		
		System.out.println("Okay " + name +", How young are you?");
		age = keyboard.nextInt();
		
		if (age < 16) {
			System.out.println("You can not drive.");
		}
		else if (age == 16 || age == 17){
			System.out.println("You can drive but not vote");
		}
		else if (age == 18 || age == 19 || age == 20 || age == 21 || age == 23 || age == 24) {
			System.out.println("You can vote but not rent a car.");
		
		}
		else {
			System.out.println("You can pretty much do whatever you want.");
		}
	}
}
