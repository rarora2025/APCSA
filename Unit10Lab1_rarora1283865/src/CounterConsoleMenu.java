/*
 * @author Rahul Arora
 */

//importing Scanner
import java.util.Scanner;

public class CounterConsoleMenu {
	
	//creating an object of counter which will serve as the actual counter in the program
	private Counter counter;
	
	//creating a variable that will stay false until the User has quit, so that the program knows when and how long to run
	protected boolean hasQuit;
	
	//get methods
	public boolean gethasQuit(){
		return hasQuit;
		
	}
	public Counter getCounter() {
		return this.counter;
	}
	public int getUserCount() {
		return this.counter.getCount();
	}
	
	//post-condition: displays choices
	public void displayChoices() {
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
	public String getUserChoice() {
		Scanner input = new Scanner(System.in);
		return input.nextLine();

	}
	
	//pre conditions- user has made a choice, users choice has been read; the variable count has been created 
	//post conditions- users choice has been called on and the variable count has changed
	public void runUserChoice(String userChoice, Counter count) {
		count = new Counter(this.counter.getCount());
		
		//switch statement which reads the users choice and calls the corresponding function, which alters count
		switch(userChoice) {
		
			case "Increment":
			case "increment":
			case "I":
			case "i":
				count.incrementCount();
				this.counter = count;
				break;
			
			case "Decrement":
			case "decrement":
			case "D":
			case "d":
				count.decrementCount();
				this.counter = count;
				break;

			case "Reset":
			case "reset":
			case "R":
			case "r":
				count.resetCount();
				this.counter = count;
				break;
			
			case "Quit":
			case "quit":
			case "Q":
			case "q":
				this.hasQuit = true;
				break;
			
		
		}
		
		
	}
	
	
	//prints count 
	//pre-condition- a count has been created and updated
	//post-conditions- users current count has been displaued 
	
	public void printCount(int count) {
		System.out.println();
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");
		System.out.println("*       				*");
		System.out.printf("*            Total Count: %d	        * \n", count);
		System.out.println("*				  	*");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * \n\n");
		
	}
	
	

}
//