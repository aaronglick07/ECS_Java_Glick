import java.util.Scanner;

public class ALittleQuiz 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int Q1, Q2, Q3; 
		int correct = 0;
		System.out.println("Q1) What is the capital of Alaska?"
				+ " 1) Melbourne"
				+ " 2) Anchorage"
				+ " 3) Juneau");
		Q1 = keyboard.nextInt();
		if (Q1 == 3) {
			System.out.println("Correct");
			correct++;
		}
		else if(Q1 == 1 || Q1 ==2){
			System.out.println("incorrect");
		}
		System.out.println("Q2) Can you store the value 'cat' in a variable of type int?"
				+" 1) yes"
				+ " 2) no");
		Q2 = keyboard.nextInt();
		if (Q2 == 1) {
			System.out.println("Sorry, 'cat' is a string. ints can only store numbers");
		}
		else if (Q2 == 2) {
			System.out.println("Correct");
			correct++;
		}
		System.out.println("Q3) What is the result of 9+6/3"
				+ " 1) 5"
				+ " 2) 11"
				+ " 3) 15/3");
		Q3 = keyboard.nextInt();
		if (Q3 == 2) {
			System.out.println("Correct");
			correct++;
		}
		else if (Q3 == 1 || Q3 == 3) {
			System.out.println("Incorrect");
		}
		System.out.println("overall, you got " + correct + " out of 3 correct. Thanks for playing");
	}

}
