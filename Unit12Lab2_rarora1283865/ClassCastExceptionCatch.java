
public class ClassCastExceptionCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Object i = Integer.valueOf(2);
		
		
		try {
			char char1 = (char)i;   
			}
			catch(Exception e) {
				System.out.println("i has been casted to an Integer, so it cannot be dowcasted to a char since char is a primitive type that isn't a suchclass of Integer.");
				
			}      
		
		
	}

}
