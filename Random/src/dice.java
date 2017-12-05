import java.util.Random;

public class dice 
{
	public static void main(String[] args) {
		Random ran1 = new Random();
		Random ran2 = new Random();
		int num1 = 1 + ran1.nextInt(6);
		int num2 = 2 + ran1.nextInt(6);
		
		System.out.println("HERE COMES THE DICE!");
		
		System.out.println("Roll #1: " + num1);
		System.out.println("Roll #2: " + num2);
		System.out.println("The total is " + (num1 + num2) + "!");
	}

}
