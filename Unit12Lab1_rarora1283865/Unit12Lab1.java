import java.util.Scanner;

public class Unit12Lab1 {
	public static void tryit() {
		
		//creating new scanner
		Scanner scan = new Scanner(System.in);
		
		//asking for numbers
		System.out.print("Enter number 1: ");
		int i = scan.nextInt();
		System.out.print("Enter number 2: ");
		int j = scan.nextInt();
		
		
		//printing result
		System.out.println("Value is " + i/j);
	}
	public static void main(String[] args) {
		
		//holds whether or not user has divided numbers successfully
		boolean continueLoop = true;
		do {
			try {
				//running try it 
				tryit();
				//continue loop will only become false when tryit has successfully executed
				continueLoop = false;
			}
			catch(ArithmeticException e) {
				//printing exception
				System.out.println("Try Again!");
			}
		
			
			
		//continuing until continue loop is false	
		} while (continueLoop);

	}

}
