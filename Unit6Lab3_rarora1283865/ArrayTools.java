import java.util.Arrays;
/**
 * 
 */

/**
 * @author Rahul Arora
 *
 */
public class ArrayTools {
	/*
	  The method minimum() returns the minimum value stored in an array
	  
	  */
	public static char minimum(char[] array) 
	{
		char minimum = array[0];
		
		for (char character: array) {
			if (character <= minimum) {
				minimum = character;
			}
			
		}
		return minimum;
		
	}
	
	public static int minimum(int[] array) 
	{
		int minimum = array[0];
		
		for (int integer: array) {
			if (integer <= minimum) {
				minimum = integer;
			}
			
		}
		return minimum;
		
	}
	
	public static double minimum(double[] array) 
	{
		double minimum = array[0];
		
		for (double dub: array) {
			if (dub <= minimum) {
				minimum = dub;
			}
			
		}
		return minimum;
		
	}
	/*
	  The method maximum() returns the maximum value stored in an array
	  
	  */
	public static char maximum(char[] array) 
	{
		char minimum = array[0];
		
		for (char character: array) {
			if (character >= minimum) {
				minimum = character;
			}
			
		}
		return minimum;
		
	}
	
	public static int maximum(int[] array) 
	{
		int minimum = array[0];
		
		for (int integer: array) {
			if (integer >= minimum) {
				minimum = integer;
			}
			
		}
		return minimum;
		
	}
	
	public static double maximum(double[] array) 
	{
		double minimum = array[0];
		
		for (double dub: array) {
			if (dub >= minimum) {
				minimum = dub;
			}
			
		}
		return minimum;
		
	}
	/*
	  The method minimumAt() returns the location of the minimum value stored in an array
	  
	  */
	public static int minimumAt(double[] array) 
	{
		double minimumVal = array[0];
		int minimumIndex = 0;
		
		for (int dub = 0; dub < array.length; dub++) {
			if (array[dub] <= minimumVal) {
				  minimumIndex = dub;
				  minimumVal = array[dub];

			}
			
			
		}
		return minimumIndex;
		
	}
	public static int minimumAt(int[] array) 
	{
		double minimumVal = array[0];
		int minimumIndex = 0;
		
		for (int dub = 0; dub < array.length; dub++) {
			if (array[dub] <= minimumVal) {
				  minimumIndex = dub;
				  minimumVal = array[dub];

			}
			
			
		}
		return minimumIndex;
		
	}
	public static int minimumAt(char[] array) 
	{
		double minimumVal = array[0];
		int minimumIndex = 0;
		
		for (int dub = 0; dub < array.length; dub++) {
			if (array[dub] <= minimumVal) {
				  minimumIndex = dub;
				  minimumVal = array[dub];

			}
			
			
		}
		return minimumIndex;
		
	}
	
	
	
	
	
	
	
	/*
	  The method maximumAt() returns the location of the maximum value stored in an array
	  
	  */
	public static int maximumAt(double[] array) 
	{
		double minimumVal = array[0];
		int minimumIndex = 0;
		
		for (int dub = 0; dub < array.length; dub++) {
			if (array[dub] >= minimumVal) {
				  minimumIndex = dub;
				  minimumVal = array[dub];

			}
			
			
		}
		return minimumIndex;
		
	}
	public static int maximumAt(int[] array) 
	{
		double minimumVal = array[0];
		int minimumIndex = 0;
		
		for (int dub = 0; dub < array.length; dub++) {
			if (array[dub] >= minimumVal) {
				  minimumIndex = dub;
				  minimumVal = array[dub];

			}
			
			
		}
		return minimumIndex;
		
	}
	public static int maximumAt(char[] array) 
	{
		double minimumVal = array[0];
		int minimumIndex = 0;
		
		for (int dub = 0; dub < array.length; dub++) {
			if (array[dub] >= minimumVal) {
				  minimumIndex = dub;
				  minimumVal = array[dub];

			}
			
			
		}
		return minimumIndex;
		
	}
	/*
	  The method average() returns the average of the values stored in an array
	  
	  */
	public static double average(int[] array) 
	{
		int sum = 0;
		for (int num: array) {
			sum += num;
		}
		
		return (sum / array.length);
		
	}
	
	public static double average(double[] array) 
	{
		double sum = 0;
		for (double num: array) {
			sum += num;
		}
		
		return (sum / array.length);
		
	}
	/*
	  The method equals() returns whether or not the two arrays given are equal to each other
	  
	  */
	public static boolean equals(double[] array, double[] array2) 
	{
		return Arrays.equals(array, array2);
		
	}
	public static boolean equals(int[] array, int[] array2) 
	{
		return Arrays.equals(array, array2);
		
	}
	public static boolean equals(char[] array, char[] array2) 
	{
		return Arrays.equals(array, array2);
		
	}
	/*
	  The method find() searches the array for the value key, and returns the location of the key if found
	  */
	public static int find(char[] array, char key) 
	{
		return Arrays.binarySearch(array, key);
		
	}
	public static int find(int[] array, int key) 
	{
		return Arrays.binarySearch(array, key);
		
	}
	public static int find(double[] array, double key) 
	{
		return Arrays.binarySearch(array, key);
		
	}
	
	/*
	  The method sort() sorts the array in ascending order
	  */
	
	public static void sort(double[] array) 
	{
		Arrays.sort(array);
		
	}
	public static void sort(int[] array) 
	{
		Arrays.sort(array);
		
	}
	public static void sort(char[] array) 
	{
		Arrays.sort(array);
		
	}

	
	


}
