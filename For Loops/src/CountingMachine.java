import java.util.Scanner;

public class CountingMachine {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int num = keyboard.nextInt();
		
		for (int i = 0; i <= num; i++) {
			System.out.println(i);
		}
	}
}
