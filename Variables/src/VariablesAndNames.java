
public class VariablesAndNames 
{
	public static void main(String[] args) 
	{
		//This intialize's the int's.
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		//This intialize's the double's
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
		
		//sets cars to 100
		cars = 100;
		//sets space in a car to 4
		space_in_a_car = 4.0;
		//sets drivers to 30
		drivers = 30;
		//sets passengers to 90
		passengers = 90;
		//sets cars not driven to cars minus the amount of drivers
		cars_not_driven = cars - drivers;
		//sets cars driven to the amount of drivers
		cars_driven = drivers;
		//sets car pool capacity to cars driven mulitplyed by the space in a car
		carpool_capacity = cars_driven * space_in_a_car;
		//sets the average passenger per car to passengers divided by cars driven
		average_passengers_per_car = passengers / cars_driven;
		
		//Prints all the information
		System.out.println("There are " + cars + " cars available");
		System.out.println("There are only " + drivers + " drivers available");
		System.out.println("There will be " + cars_not_driven + " empty cars today");
		System.out.println("We can transport " + carpool_capacity + " people today");
		System.out.println("We have " + passengers + " to carpool today.");
		System.out.println("We need to put about " + average_passengers_per_car + " in each car");
		
		/* The outcome is the same if it was just four, so it does not matter, but because it is a double it helps to add the .0 to help us read and know its a double
		 * The difference between = and == is that = gives a variable that value, where == sets something equal to something else
		 * 
		 */
	}

}
