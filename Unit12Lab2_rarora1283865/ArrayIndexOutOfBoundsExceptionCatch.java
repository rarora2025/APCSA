
public class ArrayIndexOutOfBoundsExceptionCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size_of_array = 5;
		int[] x = new int[size_of_array];
		
		//trying to get an element of an array that doesn't exist
		
		try {
		System.out.println(x[size_of_array+1]);
		}
		catch(Exception e) {
			System.out.println("The element being looked for doesn't exsist since its index is one higher than the size of the array");
			
		}
		
		
		
	}

}
