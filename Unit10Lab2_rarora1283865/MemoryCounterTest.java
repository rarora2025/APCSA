/*
 * @author Rahul Arora
 */

public class MemoryCounterTest {

	public static void main(String[] args) {
		//creating a new MemoryCounterConsoleMenu object
		MemoryCounterConsoleMenu menu = new MemoryCounterConsoleMenu();
		
		//putting everything in a loop so that the program runs and the user can click buttons unti lhe quits
		while(menu.gethasQuit() == false) {
			//calling the function that displays the choices
			menu.displayChoices();
			//getting the users choice
			String choice = menu.getUserChoice();
			
			//running the users choice given the choice and the current counter (and its count)
			menu.runUserChoice(choice, menu.getCounter());
			
			//printing the count after the choice has been ran
			menu.printCount(menu.getUserCount(), menu.getUserMemory());
		}
		
		
	}

}