/**
 * takes three double variables as arguments and returns the minimum/minimum of the three values
 * 
 * @author Rahul Arora
 *
 */

public class Unit5Lab3 {

	public static void main(String[] args) {
		//testing three different data sets
		
		for (int counter = 1; counter <= 3; counter++) {
			
			//generating totally random numbers- x, y, and z
			
			//these formulas mean nothing
			int x = counter + ((int) (Math.random() * (Math.random()*7)+ (Math.random()*100) ));
			int y =  ((int) (Math.random() * (Math.random()*7)* (Math.random()*100)));
			int z = counter - ((int) (Math.random() * (Math.random()*7)- (Math.random()*100)));
			
			System.out.printf("Maximum of %d, %d, and %d: %.0f \nMinimum of %d, %d, and %d: %.0f\n", x, y, z, maximum(x, y, z), x, y, z, minimum(x,y,z));
			System.out.printf("\n");
		}
		

	}
	/*
	  The method minimum() takes three double variables as arguments and returns the minimum of the three values
	  
	    Pre-Conditions: three values
	                  
	 Post-Conditions: minimum value returned
	  */
	
	public static double minimum(double a, double b, double c) {
		//using Math.min to calculate min
		double min1 = Math.min(a, b);
		return Math.min(min1, c);
	}
	
	/*
	  The method maximum() takes three double variables as arguments and returns the maximum of the three values
	  
	  Pre-Conditions: three values
	                  
	 Post-Conditions: maximum value returned
	  */
	
	public static double maximum(double a, double b, double c) {
		//using Math.min to calculate max
		double max1 = Math.max(a, b);
		return Math.max(max1, c);
	}

}
