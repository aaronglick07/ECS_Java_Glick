
public class MoreVariablesAndPrinting 
{
	public static void main(String[] args) 
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		double cm, kg;
		
		myName = "Aaron";
		myAge = 16;
		myHeight = 67;
		myWeight = 130;
		myEyes = "Green";
		myTeeth = "white";
		myHair = "black";
		//convert myHeight to cm
		cm = myHeight * 2.54;
		//convert myWeight to kg
		kg = myWeight * .453592;
		
		System.out.println("let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " (or " + cm + " cm)" + " inches tall");
		System.out.println("He's " + myWeight + " (or " + kg + " kg)" + " pounds heavy");
		System.out.println("Actually that's not too heavy");
		System.out.println("He's got " + myEyes + " Eyes and " + myHair + " hair");
		System.out.println("His teeth are usually " + myTeeth + " depending on the coffee");
		System.out.println("If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + "." );
		
	}

}
