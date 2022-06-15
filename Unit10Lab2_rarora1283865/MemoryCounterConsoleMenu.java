/*
 * @author Rahul Arora
 */

//importing Scanner
import java.util.Scanner;

public class MemoryCounterConsoleMenu {
	
	//creating an object of memory counter which will serve as the actual counter in the program 
	private static MemoryCounter counter;
	
	//creating a variable that will stay false until the User has quit, so that the program knows when and how long to run
	private static boolean hasQuit;
	
	//get methods
	public boolean gethasQuit(){
		return hasQuit;
		
	}
	//this method will override the previous get Counter, and return a MemoryCounter instead
	public MemoryCounter getCounter() {
		return counter;
	}
	
	public static int getUserCount() {
		return counter.getCount();
	}
	
	//returns memory
	public static int getUserMemory() {
		return counter.getMemory();
	}
	
	//post-condition: overrides precious displays choices, and adds two new selections
	public static void displayChoices() {
		System.out.println("Select One: ");
		System.out.println("- Increment (I)");
		System.out.println("- Decrement (D) ");
		System.out.println("- Reset (R)");
		System.out.println("- Add to Memory (A)");
		System.out.println("- Reset Memory (M)");
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
	
	//overrides precious run user choice, and adds two new selections
	
	
	//pre conditions- user has made a choice, users choice has been read; the variable count has been created 
	//post conditions- users choice has been called on and the variable count has changed
	public static void runUserChoice(String userChoice, MemoryCounter count) {
		count = new MemoryCounter(count.getCount(), count.getMemory());
		
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
				
			case "Add":
			case "Add to Memory":
			case "A":
			case "a":
				count.addMemory();
				counter = count;
				break;
				
				
			case "Reset Memory":
			case "reset memory":
			case "M":
			case "m":
				count.resetMemory();
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
	
	public static void printCount(int count, int memory) {
		System.out.println();
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");
		System.out.println("*       				*");
		System.out.printf("*            Total Count: %d	        * \n", count);
		System.out.println("*				  	*");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * \n\n");
		System.out.println();
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");
		System.out.println("*       				*");
		System.out.printf("*            Total Memory: %d	        * \n", memory);
		System.out.println("*				  	*");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * \n\n");
		
	}
	
	

}
//