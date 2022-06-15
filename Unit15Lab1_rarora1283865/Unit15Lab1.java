/*
 * @author Rahul Arora
 */
public class Unit15Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(factSum(20));
	}
	
	//precondition: n >= 0
	//postcondition: factorial of number is returned 
	
	public static int Fact(int n) {
	    if (n == 0)
	        return 1;
	    else 
	        return (n*Fact(n-1));
	}

	//precondition: n >= 0
	//postcondition: the sum of 1/1!...1/n!  is returned 
	
	public static double factSum(int n) {
	    if (n == 0)
	        return 1;
	    
	  
	    
	    else {
	    	double x = (Fact(n));
	    	double y = 1/x;
	    	double z = (factSum(n-1));
	    	double a = y+z;
	    //	System.out.println(a);
	        return (a);
	    	
	    }
	}
	

}
