import java.util.Random;

public class IllegalArgumentExceptionCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random num = new Random();
		try {
			 
		        
			  System.out.println(num.nextInt(0));
			}
			catch(Exception e) {
				System.out.println("0 is an illegal argument for nextInt in this circumstance.");
				
			}   
	}

}
