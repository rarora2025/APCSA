import java.util.Scanner;

public class Unit4Lab1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Pick a number, the secret number will be between 1 and this number: ");
		int N = input.nextInt();
		
		System.out.print("How many guesses will you make for this round? ");
		
		int guesser = input.nextInt();
		System.out.println("");
		
		
		
		while (true) {
		int guesses = guesser;
			
			
		int secretNumber = (int) ( N * Math.random() ) + 1;
	
		while (guesses > 0) {
		
				System.out.printf("You have %d guesses left; ", guesses);
				System.out.print("Guess the secret number: ");
				int answer = input.nextInt();
				
				if (answer > secretNumber) {
					System.out.println("too high");
					
				} else if (answer < secretNumber) {
					System.out.println("too low");
					
				} else if (answer == secretNumber) {
					System.out.println("correct!");
					break;
				}
			
			guesses--;
		} 
		
		if (guesses <= 0) {
		System.out.println("You have run out of guesses.");
		}
		System.out.print("Would you like to play again? ");
				
		String response = input.nextLine();
		
		
			System.out.println("Please type your answer as 'yes' or 'no'.");
			
			String responser = input.nextLine();
			
			if (responser.equals("No") || responser.equals("no") || responser.equals("NO")) {
							
				break;
			} else if (response.equals("yes") || response.equals("YES") || response.equals("Yes")){
					
				continue;
			}
			
		
		
		
		
		
		}
		

	}

}
