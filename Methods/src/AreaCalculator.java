import java.util.Scanner;

public class AreaCalculator {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Shape Area Calculator");
		System.out.println("");
		System.out.println("1) Triangle");
		System.out.println("2) Rectangle");
		System.out.println("3) Square");
		System.out.println("4) circle");
		System.out.println("5) Quit");
		int selection = keyboard.nextInt();
		if (selection == 1) {
			System.out.println("The area is " + Triangle());
		}
		else if (selection == 2) {
			System.out.println("The area is " + Rectangle());
		}
		else if (selection == 3) {
			System.out.println("The area is " + square());
		}
		else if (selection == 4) {
			System.out.println("The area is " + circle());
		}
		else if (selection == 5) {
			System.out.println("Goodbye!!!");
		}
	}
	public static double Triangle(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Base: ");
		double base = keyboard.nextInt();
		System.out.println("height: ");
		double height = keyboard.nextInt();
		double area = 0.5 * base * height;
		return area;
	}
	public static double Rectangle(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("length: ");
		double length = keyboard.nextInt();
		System.out.println("width: ");
		double width = keyboard.nextInt();
		double area = length * width;
		return area;
	}
	public static double square(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("side: ");
		double side = keyboard.nextInt();
		double area = side * side;
		return area;
	}
	public static double circle(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("radius: ");
		double radius = keyboard.nextInt();
		double area = Math.PI * radius * radius;
		return area;
	}
}
