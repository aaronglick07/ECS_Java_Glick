import java.util.Scanner;

public class keyChains {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int x = 0;
		int input = 0;
		do {
			System.out.println("Ye Olde Keychain");
			System.out.println("");
			System.out.println("1. Add keychains to order");
			System.out.println("2. Remove keychains to order");
			System.out.println("3. View current order");
			System.out.println("4. Checkout");
			System.out.println("");
			System.out.println("Please enter your choice: ");
			input = keyboard.nextInt();
			if (input == 1) {
				x = add(x);
			} else if (input == 2) {
				x = remove(x);
			} else if (input == 3) {
				view(x);
			} else if (input == 4) {
				checkout(x);
			}
		} while (input != 4);
		
	}

	public static int add(int i) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You have " + i + " keychains. How many do you want?");
		int x = keyboard.nextInt();
		x += i;
		System.out.println("You now have " + x + " keychains");
		
		return x;
	}

	public static int remove(int i) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You have " + i + " keychains. How many do you want to remove?");
		int x = keyboard.nextInt();
		x -= i;
		System.out.println("You now have " + -x + " keychains");
		
		return -x;
	}

	public static void view(int x) {
		System.out.println("You have " + x + " keychains");
		System.out.println("keychains cost $10 each");
		int cost = x * 10;
		System.out.println("total cost is $" + cost);
	}

	public static void checkout(int x) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = keyboard.next();
		System.out.println("You have " + x + " keychains");
		System.out.println("keychains cost $10 each");
		int cost = x * 10;
		System.out.println("total cost is $" + cost);
		System.out.println("Thanks for your order, " + name);
		
	}
}
