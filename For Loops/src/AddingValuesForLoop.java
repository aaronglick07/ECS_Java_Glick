import java.util.Scanner;

public class AddingValuesForLoop {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int large = 0;
		System.out.println("number: ");
		int num = keyboard.nextInt();
		
		for (int i = 0; i <= num; i++) {
			System.out.print(i + " ");
			large += i;
		}
		System.out.println("");
		System.out.println("the sum is " + large);
	}
}
