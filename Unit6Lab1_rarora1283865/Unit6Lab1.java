import java.util.Scanner;
import java.util.Arrays;

/**
 * prompts the user to enter integers and counts the occurrences of each integer
 * @author Rahul Arora
 *
 */


public class Unit6Lab1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * calling method runProcedure, which does everything except declare first variables
		 * declareAndGetArray will take care of that
		 */
		
		runProcedure(declareAndGetArray(1), declareAndGetArray(2), new Scanner(System.in));
		
	}
	
	/**
	 * This method declares and returns arrays
	 * the purpose of this is to keep everything organized 
	 
	 * @param case -> tells me which case (Array) to declare so that I can keep the same method to declare and get both arrays
	
	
	 *  Pre-Conditions: no variables have been declared, no methods have been called
                        
     * 	Post-Conditions: first two arrays have been declared, an the program is ready to run procedure using these two arrays and a new Scanner as parameters
                
	 */
	
	public static int[] declareAndGetArray(int Case) {
		
		//checks case
		switch (Case) {
			
			//declares & returns appropriate array based on case
				case 1:
					int[] users_numbers = new int[10];
					return users_numbers;
				default: 
					int[] previous_nums = {};
					return previous_nums;
		}
	}
	
	
	
	/**
	 * This method prompts the user to enter 10 numbers, and stores it an array called users_numbers
	 
	 * @param users_numbers -> the array in which the users numbers will be stored
	 * @param scan -> scanner that will receive the numbers as input from the users
	 * @param numberOfNumbers -> number of numbers that the user will enter
	
	 *  Pre-Conditions: users_numbers is empty, scanner has been declared/initialized but not used
	 							- nothing has really happened except for the defining of variables
                        
     * 	Post-Conditions: All of the users numbers have been entered and stored in the array users_numbers
                
	 */
	public static void getNumbers(int[] users_numbers, Scanner scan, int numberOfNumbers) {
		
		//loops through the numberOfNumbers times
		for (int num = 0; num <= numberOfNumbers; num++) {
			
			//prompts user to enter number
			System.out.print("Enter number " + (num+1) + ": ");
			
			//gets number that the user entered and stores that in the array users_numbers
			users_numbers[num] = scan.nextInt();
			
			
		}
	}
	
	
	
	
	/**
	 * This method checks if the number has already been displayed (a repeat), and returns whether or not as a boolean
	 
	 * @param previous_nums -> all of the numbers who have displayed their occurrences
	 * @param users_numbers -> all of the users numbers
	 * @param counter -> the current counter number- 
	 * 	users_numbers and counter can be used together to figure out the current number being checked
	 											
	
	 *  Pre-Conditions: whether or not the number has been displayed is unknown
                        
     * 	Post-Conditions: we know whether the number is unique and if we should display the occurrences of the number
     * the goal of this function and hasBeenDone is to prevent the program from displaying repeats
     
	 */
	public static boolean check_if_done(int[] previous_nums, int[] users_numbers, int num) {
		
		/*
		 * temporary boolean that will display whether or not the number is unique; 
		 * we set it false at first because that should be the default value- if it is not a repeat
		*/ 
		boolean isDone = false;
		
		//looping through each number already displayed
		for (int number : previous_nums) {
			
			//checking if current number matches one of the numbers already displayed
			if (users_numbers[num] == number) {
				
				//return true if it matches; else continue loop and check if next prev_num matches current number
				isDone = true;
			} 
			
		}
		
		//if no previous numbers matches the current number- the number is unique, so isDone should be the default value which is false
		return isDone;
	}
	
	
	
	
	/**
	 * This method counts the number of times that a number (current number being looped through in counter) shows up in the users numbers and returns that value
	 
	 * @param counter -> the counter variable in the Main for-loop
	 * @param users_numbers -> all of the users numbers
	 * together these two variables can be used to get the current value being checked (users_numbers[counter])
	 * I also make another for loop with a second counter, to compare that current value with every other number in the array- if I find a match I increment repeat

	 				
	
	 *  Pre-Conditions: the number of occurrences of the current number 'counter' is checking is unknown
                        
     * 	Post-Conditions: we know how many times a certain number occurs in the users set of numbers
	 */
	
	public static int countOccurrences(int counter, int[] users_numbers) {
		
		//temporary variable that will counter number of time number occurs;
		//default value is one because a number must be in the set at least once if it is in the set
		
		int repeats = 1;
		
		//incrementing through all other numbers in users_numbers, to compare the current number with those
		for (int counter2 = (counter+1); counter2 <= 9; counter2++) {
		
			if(users_numbers[counter2] == users_numbers[counter]) {
				
				//incrementing repeats if a match is found
				repeats+= 1;
				
			}
			
			
		}
		
		//returning the number of repeats
		return repeats;
		
		
	}
	
	
	/**
	 * This method calls all the key methods that haven't been called
	 * an organized way of running all methods, instead of just calling everything individually
	 * this makes it easy to keep track of what's running and when its running
	 
	 * @param users_numbers -> fresh array that will have all users numbers
	 * @param previous_nums -> fresh array that will contain the numbers that have already been displayed
	 * @param scan -> Scanner that will be used in getNumbers() in order to ask the user for the set of numbers
	
	
	 *  Pre-Conditions: variables have been declared
                        
     * 	Post-Conditions: program has run successfully
                
	 */
	
	
	public static void runProcedure(int[] users_numbers, int[] previous_nums, Scanner scan) {
		
		//number of items to loop through 
		int times = users_numbers.length - 1;
		
		//calling getNumbers- getting the set of nums from user
		getNumbers(users_numbers, scan, times);
		System.out.println("");
		
		//looping through each number user gave
	for (int counter = 0; counter <= times; counter++) {
			
			
			
			
			//counting repeats
			int repeats = countOccurrences(counter, users_numbers);
			
			//checking if done
			boolean hasBeenDone = check_if_done(previous_nums, users_numbers, counter);
			
			
		
			if (!hasBeenDone){
				//displaying result if not done
				System.out.println(users_numbers[counter] + " occurs " + repeats + " times.");
				
			} 
			
			/*
			 * way to append to an array (Using java.util.Arrays)
			 * I researched how to append to the end of an array in the simplest manner and I came across this solution
			 * basically it takes a copy of the array and adds an element, then it sets that last element to what I wanted to append
			 * Source: https://www.educative.io/edpresso/how-to-append-to-an-array-in-java	
			*/
			
			previous_nums = Arrays.copyOf(previous_nums, previous_nums.length + 1);
			previous_nums[previous_nums.length - 1] = users_numbers[counter];
			
			
			
			
		}
	}
	

}
