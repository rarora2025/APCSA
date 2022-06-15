/**
 * prompts the user to enter a series of 10 integers and then determines and displays the largest and smallest values entered
 * this class used a while construct
 * @author Rahul Arora
 *
 */


//importing scanner
import java.util.Scanner;

public class Unit4Lab3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating new scanner
		Scanner input = new Scanner(System.in);
		
		
		//declaring variables
		int largest, smallest, number, counter;

		
		//prompting user to enter first number, assigning both largest and smallest to that number (because the user hasn't entered any other numbers)
		System.out.print("Enter the first number: ");
		largest = input.nextInt();
		smallest = largest;
		
		//setting the counter to 2 because the user has already entered 1 number
		counter = 2;
		
		
		//using a while loop that will repeat until the tenth number has been entered
		while (counter <= 10) {
			
			//prompting the user to enter next number in sequence
			System.out.printf("Enter number #%d: ", counter);
			number = input.nextInt();
			
			
			if (number >= largest) {
				//setting largest number to the number if the number is GREATER than the current largest number
				largest = number;
				
			} else if (number <= smallest) {
				//setting smallest number to the number if the number is SMALLER than the current smallest number
				smallest = number;
				
			}
			
			//post-incrementing the counter
			counter++;
			
			
			
		}
		
		//printing smallest and largest numbers 
		System.out.printf("Smallest number was %d, largest number was %d.", smallest, largest);
		

	}

}
