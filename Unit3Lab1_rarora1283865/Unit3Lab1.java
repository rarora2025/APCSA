import java.util.Scanner;

/**
 * the program prompts the user to enter integer values for the sides of a triangle and then displays the values and the type of triangle they represent
 * 
 * @author Rahul Arora
 *
 */


public class Unit3Lab1 {
	
	
	public static void main(String[] args) {

		
		//declaring/initializing Scanner
		Scanner scan = new Scanner(System.in);
		
		//prompting the user to enter three integer values for the sides of a triangle
		System.out.print("Enter Side 1: ");
		int side1 = scan.nextInt();
		System.out.print("Enter Side 2: ");
		int side2 = scan.nextInt();
		System.out.print("Enter Side 3: ");
		int side3 = scan.nextInt();
		
		
		//calculating sums of each two sides, so I can later verify that these aren't less than any given side
		int sumwithout3 = side1+side2;
		int sumwithout2 = side1+side3;
		int sumwithout1 = side2+side3;
		
		
		//making sure that triangle is valid
		if ((side1 <= 0) || (side2 <= 0) || (side3 <= 0) || (side1 >= sumwithout1) || (side2 >= sumwithout2) || (side3 >= sumwithout3)) {
			
			System.out.print("The values ");
			System.out.print(side1);
			System.out.print(", ");
			System.out.print(side2);
			System.out.print(", and ");
			System.out.print(side3);
			System.out.println(" do not make a valid triangle.");
			
		} else {
			//checking for equilateral triangle
			if ((side1 == side2) && (side2 == side3)) {
				
				System.out.print("The values ");
				System.out.print(side1);
				System.out.print(", ");
				System.out.print(side2);
				System.out.print(", and ");
				System.out.print(side3);
				System.out.println(" form an equilateral triangle.");
				
				//checking for isosceles triangle
			} else if ((side1 == side2) || (side1 == side3) || (side3 == side2)) {
				
				System.out.print("The values ");
				System.out.print(side1);
				System.out.print(", ");
				System.out.print(side2);
				System.out.print(", and ");
				System.out.print(side3);
				System.out.println(" form an isosceles triangle.");
				
				
				//checking for scalene triangle
			} else if ((side1 != side2) && (side2 != side3) && (side1 != side3)) {
				
				System.out.print("The values ");
				System.out.print(side1);
				System.out.print(", ");
				System.out.print(side2);
				System.out.print(", and ");
				System.out.print(side3);
				System.out.println(" form a scalene triangle.");
			
				
				
			}
		}

	}

}
