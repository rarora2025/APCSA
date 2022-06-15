/**
 * 
 */

/**
 * @author Rahul Arora
 *
 */
public class ArrayToolsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		char[] chararray = {
				(char) (int) ((Math.random() * 50) +50), (char) (int) ((Math.random() * 50) +49), (char) (int) ((Math.random() * 50) +49), (char) (int) ((Math.random() * 50) +49), (char) (int) ((Math.random() * 50) +49)
		};
		
		System.out.println("the char array consists of: ");
		
		for (char c  : chararray) {
			
			System.out.print(c);
			System.out.print(", ");
		}
		System.out.println("");
		System.out.print("The min is: ");
		System.out.println(ArrayTools.minimum(chararray));
		System.out.print("The max is: ");
		System.out.println(ArrayTools.maximum(chararray));
		System.out.print("The index for the min is: ");
		System.out.println(ArrayTools.minimumAt(chararray));
		System.out.print("The index for the max is: ");
		System.out.println(ArrayTools.maximumAt(chararray));
		System.out.println("");
		
		int[] intarray = {
				(int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100)
				};
		System.out.println("the int array consists of: ");
		
		for (int c  : intarray) {
			
			System.out.print(c);
			System.out.print(", ");
		}
		System.out.println("");
		System.out.print("The min is: ");
		System.out.println(ArrayTools.minimum(intarray));
		System.out.print("The max is: ");
		System.out.println(ArrayTools.maximum(intarray));
		System.out.print("The index for the min is: ");
		System.out.println(ArrayTools.minimumAt(intarray));
		System.out.print("The index for the max is: ");
		System.out.println(ArrayTools.maximumAt(intarray));
		System.out.print("The average of the array is: ");
		System.out.println(ArrayTools.average(intarray));
		System.out.println("");

		
		double[] doublearray = {
				(Math.random() * 100), (Math.random() * 100), (Math.random() * 100), (Math.random() * 100), (Math.random() * 100)
				};
System.out.println("the double array consists of: ");
		
		for (double c  : doublearray) {
			
			System.out.print(c);
			System.out.print(", ");
		}
		System.out.println("");
		System.out.print("The min is: ");
		System.out.printf("%.2f \n", ArrayTools.minimum(doublearray));
		System.out.print("The max is: ");
		System.out.printf("%.2f \n", ArrayTools.maximum(doublearray));
		System.out.print("The index for the min is: ");
		System.out.println(ArrayTools.minimumAt(doublearray));
		System.out.print("The index for the max is: ");
		System.out.println(ArrayTools.maximumAt(doublearray));
		System.out.print("The average of the array is: ");
		System.out.println(ArrayTools.average(doublearray));
		

		
	}

}
