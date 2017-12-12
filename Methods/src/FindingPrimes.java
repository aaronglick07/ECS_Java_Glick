import java.util.Scanner;

public class FindingPrimes {
	public static void main(String[] args) {
		int lowEnd, highEnd;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("We are going to find some Primes!");
		System.out.println("What range would you like them in?");
		System.out.println("(only positvie integers 2 or greater)");
		System.out.println("Low end: ");
		lowEnd = keyboard.nextInt();
		System.out.println("High end: ");
		highEnd = keyboard.nextInt();
		for (int i = lowEnd; i <= highEnd; i++) {
			System.out.print(i + " ");
			isPrime(i);

			if (isPrime(i) == true) {
				System.out.print("<");
			}
			System.out.println("");
		}
	}

	public static boolean isPrime(int x) {
		for(int i=2;i<x;i++){
			if (x%i==0) {
				return false;
			}
		}
		return true;
	}
}
