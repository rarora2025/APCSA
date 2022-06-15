import java.util.Scanner;

public class Unit4Activity1 {

	public static void main(String[] args) {
		
		System.out.print("How many problems? ");
		Scanner input = new Scanner(System.in);
		int numberOfProblems = input.nextInt();
		long startTime = System.currentTimeMillis();
		
		//variables storing number of correct and incorrect answers
		int correct = 0;
		int wrong = 0;
		
		
	
		for (int counter = 1; counter <= numberOfProblems; counter++) {
			
			
		// Generate 2 random numbers that will be multiplied
		int number1 = (int) ( Math.random() * 10 );
		int number2 = (int) ( Math.random() * 10 );
		
		//Prompt user to input answer
		System.out.print("What is " + number1 + " * " + number2 + "? ");

		int answer = input.nextInt();
		
		//Grade the answer
		if ((number1*number2) == answer) {
			correct += 1;
			System.out.println("Congratulations...you are correct!");
			
			
		} else {
			wrong += 1;
			System.out.print("That's incorrect, the correct answer is ");
			System.out.println(number1*number2);
			
		}
		
		}
		Float decimalScore = (float) (correct*100 / (correct+wrong));
		long finalTime = System.currentTimeMillis() - startTime;
		
		System.out.printf("You answered %.0f%% of the questions correctly in ", decimalScore);
		
		System.out.print(finalTime/1000);
		System.out.print(" seconds.");
		

	}

}
