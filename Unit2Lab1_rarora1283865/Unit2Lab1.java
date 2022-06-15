
public class Unit2Lab1 {

	public static void main(String[] args) {
		
		char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '-', '_', '=', '&', '@', '#', '$', '?', '>', '<', '|', '!', '~', ' '};
		int x = 0;
		
		
		
		while (x < 77) { // a real time saver I just read about
			
		System.out.printf("The character %c has the value %d%n", letters[x], ((int) letters[x]));
		x = x +1; 
		
		
		}
	
		
		

	}

}
