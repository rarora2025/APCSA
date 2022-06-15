/**
 * 
 * @author Rahul Arora
 *
 */

//importing Scanner
import java.util.Scanner;


public class NumberConverter {
	 
	
	/*
	  The method binaryToDecimal() converts the given binary to a decimal.
	  
	  */
	public static int binaryToDecimal(String binaryString) {
		//number is the decimal value
		int number = 0;
		
		String input = binaryString; 
		  
		
		//defining new string builder
        StringBuilder input1 = new StringBuilder(); 
  
        // append a string into StringBuilder input1 
        input1.append(input); 
  
        // reverse StringBuilder input1 
        input1 = input1.reverse(); 
  
		//loop through all numbers in binary sequence
		for (int s = 0; s < input1.length(); s++) {
		if (input1.charAt(s) == '1') {
	
	
			number += Math.pow(2,s);
		}
			
		}

		return number;
		
	}
	/*
	  The method binaryToHex() converts the given binary to a hexadecimal.
	  
	  */
	public static String binaryToHex(String binaryString) {
		//new string builder holding the binary value
		StringBuilder bString = new StringBuilder();
		bString.append(binaryString);
		
		//finding length of the binary sequence
		int blength = binaryString.length();
	
		//making binary sequence a multiple of four so that I can create even groups of 4 numbers 
		while ((blength % 4) != 0) {
			bString.insert(0, "0");
			blength = bString.length();
		
		}
		
		
		
		//array that holds the decimal numbers, not accounting for letters, reversed
		int revdecnums[] = new int[blength/4];
		
		//final array holding the hex values of the binary code
		char hexdecnums[] = new char[blength/4];
		
		//looping through each group of four
		for (int x = 0; x < (blength / 4); x++) {
			
			//default values
			char [] chars = {'0', '2', 'g', 'x'};
			
			//making sure that the first time, I start with the top (.length())
			if (x > 0) {
				blength -= 4;
			}
			
			//grabbing that group of 4
			 bString.getChars(blength-4, blength, chars, 0);
			 
			 //converting binary to hex, not account for letters
			 int a =Integer.parseInt(String.valueOf(chars[3]));  
			 int num1 = a * 1;
			 int b =Integer.parseInt(String.valueOf(chars[2]));  
			 int num2 = b * 2;
			  int c =Integer.parseInt(String.valueOf(chars[1]));  
			 int num3 = c * 4;
			  int d =Integer.parseInt(String.valueOf(chars[0]));  
			 int num4 = d * 8;
			
			 revdecnums[x] = num1+num2+num3+num4;
		
			 
		
		}
		
		
		//reversing the order, I found this trick on StackOverflow
		for(int i=0; i<revdecnums.length/2; i++){ 
			int temp = revdecnums[i]; 
			revdecnums[i] = revdecnums[revdecnums.length -i -1]; 
			revdecnums[revdecnums.length -i -1] = temp; 
			}
		
		
		
		//acounting for letters
		for (int z = 0; z < revdecnums.length; z++) {
			if (revdecnums[z] > 9) {
				switch (revdecnums[z]) {
				
				
				
				case 10:
					hexdecnums[z] = 'A';
					break;
				case 11:
					hexdecnums[z] = 'B';
					break;
				case 12:
					hexdecnums[z] = 'C';
					break;
				case 13:
					hexdecnums[z] = 'D';
					break;
				case 14:
					hexdecnums[z] = 'E';
					break;
				case 15:
					hexdecnums[z] = 'F';
					break;
					
				}
				
			} else {
			hexdecnums[z] = (char)(revdecnums[z]+'0');
			}
			
		}
		
		String hexdecnum = new String(hexdecnums);
		return hexdecnum;


	
	
	
		
	}
	
	
	
	/*
	  The method decimalToHex() converts the given decimal to hexadecimal.
	  
	  */
		
		
	public static String decimalToHex(int decimalNumber) {
		
		//new string builder
		StringBuilder binaryNumber = new StringBuilder();
		
		//current dividend- the number being divided by 
		int currentdiv = decimalNumber;
		
		
		//waiting for quotient to not be zero 
		while (currentdiv != 0) {
			
			if ((currentdiv%16) > 9) {
				switch (currentdiv%16) {
				//accounting for letters, if number is greater than 9
				
				case 10:
					binaryNumber.insert(0, 'A');
					break;
				case 11:
					binaryNumber.insert(0, 'B');
					break;
				case 12:
					binaryNumber.insert(0, 'C');
					break;
				case 13:
					binaryNumber.insert(0, 'D');
					break;
				case 14:
					binaryNumber.insert(0, 'E');
					break;
				case 15:
					binaryNumber.insert(0, 'F');
					break;
					
				}
				
			} else {
			binaryNumber.insert(0, Integer.toString(currentdiv%16));
			}
			
			
			currentdiv /= 16;
			
		}
		
		return binaryNumber.toString();
		
	}
	/*
	  The method decimalToBinary() converts the given decimal to Binary.
	  
	  */
	public static String decimalToBinary(int decimalNumber) {
		
		//new stiring builder
		StringBuilder binaryNumber = new StringBuilder();
		
		//dividend- number being dividend 
		int currentdiv = decimalNumber;
		
		
		//waiting for dividend to be zero, this is how you know when to stop
		while (currentdiv != 0) {
			binaryNumber.insert(0, Integer.toString(currentdiv%2));
			currentdiv /= 2;
			
		}
		
		//converting the sequence to a string
		return binaryNumber.toString();
		
	}
	public static void main(String[] args) {
		//asking for binary and converting it to decimal
		Scanner scan = new Scanner(System.in);
		System.out.print("Number in Binary to Convert to Decimal: ");
		String binNum = scan.nextLine();
		int x = binaryToDecimal(binNum);
		System.out.println(binNum + " in decimal is " + x + ".");
		
		//asking for decimal and converting it to binary
		System.out.print("Number in Decimal to Convert to Binary: ");
		int decNum = scan.nextInt();
		String y = decimalToBinary(decNum);
		System.out.println(decNum + " in binary is " + y + ".");
		
		//asking for binary and converting it to hexadecimal
		System.out.print("Number in Binary to Convert to Hexadecimal: ");
		Scanner scanner = new Scanner(System.in);
		String bintohexNum = scanner.nextLine();
		String z = binaryToHex(bintohexNum);
		System.out.println(bintohexNum + " in hexadecimal is " + z + ".");
		
		//asking for decimal and converting it to hexadecimal
		System.out.print("Number in Decimal to Convert to Hexadecimal: ");
		int decNum2 = scanner.nextInt();
		String a = decimalToHex(decNum2);
		System.out.println(decNum2 + " in hexadecimal is " + a + ".");
		
	}
	
	

}
