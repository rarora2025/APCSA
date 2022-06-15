
/*
 * @auhor Rahul Arora
 */
public class Unit15Lab2 {

	public static void main(String[] args) {
		
		//creating new array to test Bubble Sort
		int[] x = new int[] { 9, 7, 2, 10, 5, 4, 8, 1, 3, 6};
		
		System.out.println("Before:");
		//looping through array, displaying BEFORE values to see if they are sorted
		for (int y : x) {
			System.out.println(y);
		}
		
		//calling Bubble Sort on Array x
		BubbleSort(x);
		
		
		System.out.println("");
		System.out.println("After:");
		//looping through array, displaying AFTER values to see if they are sorted
		for (int y : x) {
			System.out.println(y);
		}
		
		

	}
	
	//precondition: array of integers, x, (unsorted)
	//postcondition: array, x, has been sorted in ascending order 

	public static int[] BubbleSort(int[] array) {
		
		//looping through n number of times
		for (int n = 0; n < array.length; n++) {
		
			//looping through each term and seeing whether its greater than the following one 
		for (int i = 0; i < array.length - 1; i++) {
			
			//if its greater, than switch
			if (array[i] > array[i+1]) {
				
				//keeping these values in separate variables so I don't lose them
				int first = array[i];
				int second = array[i+1];
				
				//swap
				array[i] = second;
				array[i+1] = first;
				
				
			}
		}
	}
		
		
		return array;
	}

}

/*
 * Reason why Bubble Sort is O(n^2):
 * Because each time you iterate through the n terms in a given line, all you accomplish is moving the greatest remaining value to the end of the array. so you must repeat this process n times, so that each value has been appropriately sorted. If you look through n terms, n times- n*n = n^2 therefore you are needing to do n^2 calculations 
*/