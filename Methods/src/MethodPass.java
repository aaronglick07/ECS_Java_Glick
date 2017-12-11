import java.util.Scanner;

public class MethodPass {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("pick a number:");
		int x = keyboard.nextInt();
		numlike(x);
		if (numlike(x) == true) {
			System.out.println("I like that number!");
		}
		else if (numlike(x) == false) {
			System.out.println("That number is gross...");
		}
	}

	public static boolean numlike(int i) {
		// TODO Auto-generated method stub
		if (i % 3 == 0) {
			return true;
		}
		else{
			return false;
		}
			
	}
}
