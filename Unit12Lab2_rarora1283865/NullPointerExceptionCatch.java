
public class NullPointerExceptionCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = null;
		try {
			//trying to call a method on an object pointing to nothing (Dereferencing)
			x.charAt(0);
		}
		catch(Exception e){
			System.out.println("You need to assign the variable to an object reference before you can use it.");
			
			
			
		}

	}

}
