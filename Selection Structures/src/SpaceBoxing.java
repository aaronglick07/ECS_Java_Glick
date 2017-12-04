import java.util.Scanner;

public class SpaceBoxing 
{
	public static void main(String[] args) 
	{
		double weight;
		String planet;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your weight");
		weight = keyboard.nextDouble();
		
		System.out.println("I Have information on Venus, Mars, Jupiter, Saturn, Uranus, Neptune");
		System.out.println("Please select a planet");
		planet = keyboard.next();
		if (planet.equalsIgnoreCase("Venus")) {
			weight *= .78;
			System.out.println("Your wieght wpuld be " + weight + " on this planet");
		}
		else if (planet.equalsIgnoreCase("Mars")) {
			weight *= .39;
			System.out.println("Your wieght wpuld be " + weight + " on this planet");
		}
		else if (planet.equalsIgnoreCase("Jupitar")) {
			weight *= 2.65;
			System.out.println("Your wieght wpuld be " + weight + " on this planet");
		}
		else if (planet.equalsIgnoreCase("Saturn")) {
			weight *= 1.17;
			System.out.println("Your wieght wpuld be " + weight + " on this planet");
		}
		else if (planet.equalsIgnoreCase("Uranus")) {
			weight *= 1.05;
			System.out.println("Your wieght wpuld be " + weight + " on this planet");
		}
		else if (planet.equalsIgnoreCase("Neptune")) {
			weight *= 1.23;
			System.out.println("Your wieght wpuld be " + weight + " on this planet");
		}
		else {
			System.out.println("That is not a planet");
		}
	}

}
