
public class ArrayIndexOutOfBoundsExceptionThrown {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size_of_array = 5;
		int[] x = new int[size_of_array];
		
		//trying to get an element of an array that doesn't exist
		System.out.println(x[size_of_array+1]);

	}

}
