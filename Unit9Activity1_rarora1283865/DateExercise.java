/*
 * @author Rahul Arora
 */

//importing stuff 
import java.util.Scanner;
import javax.swing.JOptionPane;

public class DateExercise {
	//creating a function which asks for a given credential of date using a dialog box
	
	//pre condition: a known desired credential
	//post condition: the desired credential has been asked for and given a value
	public static int inputDateCredential(String credential) {
		String q = String.format("Enter %s: ", credential);
		int DateCredential = Input.getInt(q);
		return DateCredential;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating new date object
		Date date = new Date(inputDateCredential("Month"), inputDateCredential("Date"), inputDateCredential("Year"));
		
		//showing date 
		JOptionPane.showMessageDialog(null, date.getDate());
		
		//creating new scanner
		Scanner firstscan = new Scanner(System.in);
		
		//asking for a reset
		System.out.print("Type RESET to set a new date: ");
		String input = firstscan.nextLine();
		
		//always asking for reset 
		while(input.equals("RESET") || input.equals("reset") || input.equals("Reset")) {
			
			System.out.println("Open the new java window to reset the Date.");
			date.resetDate(inputDateCredential("Month"), inputDateCredential("Date"), inputDateCredential("Year"));
			//displaying date in message dialog
			JOptionPane.showMessageDialog(null, date.getDate());
			
			//asking for a reset
			System.out.print("Type RESET to set a new date: ");
			input = firstscan.nextLine();
			
		}
		

	}

}
