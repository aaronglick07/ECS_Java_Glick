import java.util.Scanner;

public class BMICalcBetter 
{
	public static void main(String[] args) 
	{
		double BMI, metricHeight, metricWeight;
		int feet, inches, pounds, height;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("BMI (Body mass Index) is a way of representing your size");
		
		System.out.println("How many feet tall are you?");
		feet = keyboard.nextInt();
		System.out.println("How many inches?");
		inches = keyboard.nextInt();
		System.out.println("How many pounds do you weight?");
		pounds = keyboard.nextInt();
		metricHeight = feet*.3048 + inches*.0254;
		metricWeight = pounds*.4536;
		BMI = metricWeight / (metricHeight*metricHeight);
		System.out.println("Your BMI is " + BMI);
		if (BMI < 18.5) {
			System.out.println("underweight");
		}
		else if (BMI > 18.5 && BMI < 24.9) {
			System.out.println("normal weight");
		}
		else if (BMI > 25.0 && BMI < 29.9) {
			System.out.println("overweight");
		}
		else {
			System.out.println("obese");
		}
	}

}
