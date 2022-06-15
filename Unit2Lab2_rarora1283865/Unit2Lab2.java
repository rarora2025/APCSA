import java.util.Scanner;


public class Unit2Lab2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Price: $");
		final Float price = input.nextFloat();
		System.out.printf("$%.2f consists of ", price);
		System.out.println(price);
		final int priceh = (int) (price * 100);
		 //will always round DOWN to an integer
		
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		
		
		dollars = (priceh/100);
		int rcents1 = (int) (priceh%100);
		
		quarters = rcents1/25;
		int rcents2 = (int) (rcents1%25);
		
		dimes = rcents2/10;
		int rcents3 = (int) (rcents2%10);
	
		nickels = rcents3/5;
		int rcents4 = (int) (rcents3%5);
	
		pennies = rcents4/1;
		
		if (dollars != 0) {
			System.out.printf("%d dollars,", dollars);
		}
		if (quarters != 0) {
			System.out.printf(" %d quarters,", quarters);
		}
		if (dimes != 0) {
			System.out.printf(" %d dimes,", dimes);
		}
		if (nickels != 0) {
			System.out.printf(" %d nickels,", nickels);
		}
		if (pennies != 0) {
			System.out.printf(" %d pennies", pennies);
		}
		System.out.println(".");
		
		//System.out.printf("$%.2f consists of %d dollars, %d quarters, %d dimes, %d nickels, %d pennies", price, dollars, quarters, dimes, nickels, pennies);
				

	}

}
