/**
 * takes the quotient of two numbers and rounds it
 * 
 * @author Rahul Arora
 * 
 *
 */
import java.util.Scanner;

public class Part5_RoundingQuotients {

	
	public static void main(String[] args) {
		//definnig scanner
		Scanner scan = new Scanner(System.in);
		
		//asking for x
		System.out.print("Enter x: ");
		double x = scan.nextDouble();
		
		//asking for y
		System.out.print("Enter y: ");
		double y = scan.nextDouble();
		
		
	//rounding number to all cases
		int roundedToInt = (int) (Math.floor((x/y) * Math.pow(10, 0) + 0.5)/ Math.pow(10, 0));
		double roundedToTenths = Math.floor((x/y) * Math.pow(10, 1) + 0.5)/ Math.pow(10, 1);
		double roundedToHundredths = Math.floor((x/y) * Math.pow(10, 2) + 0.5)/ Math.pow(10, 2);
		double roundedToThousandths = Math.floor((x/y) * Math.pow(10, 3) + 0.5)/ Math.pow(10, 3);
		
		
		//printing all cases
		System.out.println("Quotient rounded to an integer: " + roundedToInt);
		System.out.println("Quotient rounded to tenths place : " + roundedToTenths);
		System.out.println("Quotient rounded to hundredths place : " + roundedToHundredths);
		System.out.println("Quotient rounded to thousandths place : " + roundedToThousandths);
		
		

	}

}
