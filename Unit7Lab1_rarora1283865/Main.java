
public class Main {
	
	public static void wordCount(String word) {
		int words = 1;
		for (int x = 0; x < word.length(); x++) {
			if (word.charAt(x) == ' ') {
				words += 1;
				
			}
		}
		System.out.println("Number of Words: " + words);
		
		
		
	}
	public static void charCount(String word) {
		System.out.println("Number of Characters: " + word.length());
		
	}

	public static void main(String[] args) {
		StringBuilder input = new StringBuilder(args.length);
		for (int x = 0; x < args.length; x++) {
			input.append(args[x]);
		}
		
		
	
		if (input.length() < 12) {
			StringBuilder errorMessage = new StringBuilder("You have used the wrong Syntax. Please re-run the program using the following Syntax: ");
			System.out.println(errorMessage);
			System.out.println("\"StringCount –[c][w] user_string\" - remember to use quotes for word count");
			
		} else if (input.substring(0, 13).equals("StringCount -")) {
			StringBuilder cleaninput = input.replace(0,13, "-");
		
			
			String code = null;
			String word = null;
			
			for (int count = 0; count < cleaninput.length(); count++) {
				char currentChar = cleaninput.charAt(count); 
				if (currentChar == ' '){
					code = cleaninput.substring(1, count);
					word = cleaninput.substring(count+1, cleaninput.length());
					break;
						
				}
			}
			
			if (code.contains("c")) {
				charCount(word);
				
			}
			if (code.contains("w")) {
				wordCount(word);
				
			}
			
			
			
			
		} else {
			StringBuilder errorMessage = new StringBuilder("You have used the wrong Syntax. Please re-run the program using the following Syntax: ");
			System.out.println(errorMessage);
			System.out.println("\"StringCount –[c][w] user_string\" - remember to use quotes for word count");
			
		}

	}

}
