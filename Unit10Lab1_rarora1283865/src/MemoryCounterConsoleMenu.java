
public class MemoryCounterConsoleMenu extends CounterConsoleMenu {
	
	private MemoryCounter counter;
	
	public void displayChoices() {
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
	
	
	public MemoryCounter getCounter() {
		return counter;
	}
	
	public void runUserChoice(String userChoice, MemoryCounter count) {

		count = new MemoryCounter(0, 4);
		
		
		System.out.println(counter.getMemory());
	//	count = new MemoryCounter(counter.getCount(), this.counter.getMemory());
		
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
	

}
