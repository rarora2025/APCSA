import java.util.Scanner;
public class Unit4Lab2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the maximum number of asterisks (*) to display on a line of output: ");
		int asterisks = scan.nextInt();
		
		for (; asterisks > 0; asterisks--) {
			for (int currentast = 0; currentast < asterisks; currentast++) {
				System.out.print("*");
			}
			System.out.println("");

			
		}
		
		
	}

}
