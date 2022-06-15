/**
 * a program that prompts the user to enter three words and displays the words in alphabetical order.
 * 
 * @author Rahul Arora
 *
 */

import java.util.Scanner;

public class Unit7Lab3 {
	 //method that returns words in alphabetical order
	public static String[] sortWords(String word1, String word2, String word3) {
		
		//create new array that will hold the sorted words at the end (returned array)
		String[] sortedWords = new String[3];
		
		//comparing 1 and 2
		if (word1.compareTo(word2) < 0) {
			//1 > 2
			
			//comparing 1 and 3
			if (word1.compareTo(word3) < 0) {
				//1 > 2 && 1 > 3
				
				//comparing 2 and 3
				if (word2.compareTo(word3) < 0) {
					//1 > 2 && 2 > 3
					//append in order 1,2,3
					sortedWords[0] = word1;
					sortedWords[1] = word2;
					sortedWords[2] = word3;
					
				
					
				} else {
					//1 > 2, 1 > 3, && 3 >= 2
					//append in order 1,3,2
					sortedWords[0] = word1;
					sortedWords[1] = word3;
					sortedWords[2] = word2;
					
					
				}
				
			} else {
				//1 > 2 && 3 >= 1
				//append in order 3,1,2
				
				sortedWords[0] = word3;
				sortedWords[1] = word1;
				sortedWords[2] = word2;
				
			}
			
		} else {
			
			//2>=1
			
			//comparing 2 and 3
			if (word2.compareTo(word3) < 0) {
				//2>= 1 && 2 > 3
				
				//comparing 1 and 3
				if (word1.compareTo(word3) < 0) {
					//2>=1 && 1 > 3
					
					
					//append in order 2,1,3
					
					sortedWords[0] = word2;
					sortedWords[1] = word1;
					sortedWords[2] = word3;
				
					
				} else {
					//2 >= 1, 2>3, && 3 >= 1
					
					//append in order 2,3,1
					sortedWords[0] = word2;
					sortedWords[1] = word3;
					sortedWords[2] = word1;
					
				}
				
			} else {
				//2>=1 && 3>=2
				//append in order 3,2,1
				
				sortedWords[0] = word3;
				sortedWords[1] = word2;
				sortedWords[2] = word1;
				
			}
			
		}
		return sortedWords;
		
		
	}

	public static void main(String[] args) {
		
		// create scanner/ prompt user to enter 3 words: a,b,c
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Word 1: ");
		String a = input.nextLine();
		System.out.print("Enter Word 2: ");
		String b = input.nextLine();
		System.out.print("Enter Word 3: ");
		String c = input.nextLine();
		
		  // call method that returns words in alphabetical order
		String [] words = sortWords(a,b,c);
		
		 // display sorted words
		System.out.println();
		System.out.println("Words in alphabetical order: ");
		for (String word:words){
			System.out.println(word);
			
		}
		
		
		
		
		
		

		

	}

}
