/*
 * @author Rahul Arora
 */

//importing Scanner
import java.util.Scanner;

public class CounterConsoleMenu {
	
	//creating an object of counter which will serve as the actual counter in the program
	private static Counter counter;
	
	//creating a variable that will stay false until the User has quit, so that the program knows when and how long to run
	private static boolean hasQuit;
	
	//get methods
	public boolean gethasQuit(){
		return hasQuit;
		
	}
	public Counter getCounter() {
		return counter;
	}
	public static int getUserCount() {
		return counter.getCount();
	}
	
	//post-condition: displays choices
	public static void displayChoices() {
		System.out.println("Select One: ");
		System.out.println("- Increment (I)");
		System.out.println("- Decrement (D) ");
		System.out.println("- Reset (R)");
		System.out.println("- Quit (Q)");
		System.out.println("");
		System.out.print("Make your Selection: ");
	}
	
	//pre conditions- Scanner has been imported, user has made a choice
	//post conditions- Scanner has been utilized and has read the users choice and returned it
	public static String getUserChoice() {
		Scanner input = new Scanner(System.in);
		return input.nextLine();

	}
	
	//pre conditions- user has made a choice, users choice has been read; the variable count has been created 
	//post conditions- users choice has been called on and the variable count has changed
	public static void runUserChoice(String userChoice, Counter count) {
		count = new Counter(count.getCount());
		
		//switch statement which reads the users choice and calls the corresponding function, which alters count
		switch(userChoice) {
		
			case "Increment":
			case "increment":
			case "I":
			case "i":
				count.incrementCount();
				counter = count;
				break;
			
			case "Decrement":
			case "decrement":
			case "D":
			case "d":
				count.decrementCount();
				counter = count;
				break;

			case "Reset":
			case "reset":
			case "R":
			case "r":
				count.resetCount();
				counter = count;
				break;
			
			case "Quit":
			case "quit":
			case "Q":
			case "q":
				hasQuit = true;
				break;
			
		
		}
		
		
	}
	
	
	//prints count 
	//pre-condition- a count has been created and updated
	//post-conditions- users current count has been displaued 
	
	public static void printCount(int count) {
		System.out.println();
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");
		System.out.println("*       				*");
		System.out.printf("*            Total Count: %d	        * \n", count);
		System.out.println("*				  	*");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * \n\n");
		
	}
	
	

}
//