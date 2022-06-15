import java.util.Scanner;

public class Unit5Lab1 {
	
	public static double round(double number, int places) {
	
	    return Math.round(number * (Math.pow(10, places))) / (Math.pow(10, places));
	}
	
	 public static double calculateFutureValueSingleSum(int months, double rate, double amount) {
	        double money = amount * Math.pow((rate + 1), months);
	        return money;
	    }
	 
	 public static double calculateFutureValueAnnuity(int years, double rate, double amountPYear) {
	        double money = amountPYear * ((Math.pow((1 + rate), years)) - 1) / rate;
	        return money;
	    }
	 
	 public static double calculatePresentValueSingleSum(int months, double rate, double amount) {
	        double moneyYouNeedToDeposit = amount / (Math.pow((1 + rate), months));
	        return moneyYouNeedToDeposit;
	    }
	 
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please specify which financial function you'd like to use. ");
		System.out.printf("\n\ta. Present Value of a Single Sum \n");
		System.out.printf("\tb. Future Value of a Single Sum \n");
		System.out.printf("\tc. Future Value of an Annuity \n\n");
		
		System.out.printf("Enter a letter only: ");
		
		String letterStr = scan.nextLine();
		char letterChar = letterStr.charAt(0);
		
		switch (letterChar) {
			case 'a':
				System.out.printf("\nEnter the percent of the annual interest rate: ");
			       double a_rate = (scan.nextDouble() / 100) / 12;

			        System.out.printf("Enter the number of years: ");
			        int a_months = scan.nextInt() * 12;
			        
			        System.out.print("Dollars that you want back: ");
			         double a_amount = scan.nextDouble();
			         
			         double a_notrounded = calculatePresentValueSingleSum(a_months, a_rate, a_amount);
 
			         double a_rounded = round(a_notrounded, 2);
			         
			         System.out.printf("\nYou need to deposit $%.2f", a_rounded);
			         break;
			         
			case 'b':
				System.out.printf("\nEnter the percent of the annual interest rate: ");
			       double b_rate = (scan.nextDouble() / 100) / 12;

			        System.out.printf("Enter the number of years: ");
			        int b_months = scan.nextInt() * 12;
			        
				 System.out.print("Dollars you are putting in: ");
		         double b_amount = scan.nextDouble();
		         
		         double b_notrounded = calculateFutureValueSingleSum(b_months, b_rate, b_amount);
		  
		         double b_rounded = round(b_notrounded, 2);
		         
		         System.out.printf("\nYou will end up with $%.2f", b_rounded);
		          break;
			
			case 'c':
				System.out.printf("\nEnter the percent of the annual interest rate: ");
			       double c_rate = (scan.nextDouble() / 100) / 12;

			        System.out.printf("Enter the number of years: ");
			        int c_months = scan.nextInt() * 12;
			        
				 System.out.print("Dollars per each annuity payment: ");
		         double c_amount = scan.nextDouble();
		         
		         double c_notrounded = calculateFutureValueAnnuity(c_months, c_rate, c_amount);
		  
		         double c_rounded = round(c_notrounded, 2);
		         
		         System.out.printf("\nYou will end up with $%.2f", c_rounded);
		          break;
			
			default:
				
			
		
		
		}
		
		
		

	}

}
