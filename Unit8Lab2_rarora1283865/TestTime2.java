/*
 * @author Rahul Arora
 */

//importing Scanner
import java.util.Scanner;

public class TestTime2 {

public static void main(String[] args) {
	
	//original time-set,using the constructor 
	System.out.println("SET THE TIME");
	
	//creating scanner which takes the seconds
	Scanner scan = new Scanner(System.in);
	System.out.print("Seconds since Midnight: ");
	
	//creating a new object which will provoke the constructor which will update values
	Time2 time = new Time2(scan.nextInt());
	System.out.println();
	System.out.println("CURRENT TIME: ");

	System.out.println("Standard: " + time.toString());
	
	System.out.println("Universal: " + time.toUniversalString());
	
	//creating scanner to recgonize if user wants to RESET
	Scanner scanner = new Scanner(System.in);
	System.out.println();
	System.out.print("Type RESET to set a new time. ");
	
	
	//keep in a while loop so that the user can always RESET
	
		while (scanner.nextLine().equals("RESET")) {
			System.out.println();
			System.out.println("SET THE TIME");
			
			System.out.print("Seconds since Midnight: ");
			//calling the set function on the new seconds, instead of creating a new time object 
			time.setSecondsincemidnight(scan.nextInt());
			System.out.println();
			System.out.println("CURRENT TIME: ");
			System.out.println("Standard: " + time.toString());
			
			System.out.println("Universal: " + time.toUniversalString());
			System.out.println();
			
			//asking for a reset again 
			System.out.print("Type RESET to set a new time. ");
		
		
		
		}
}
}
