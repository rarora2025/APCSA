/*
 * @author Rahul Arora
 */
public class Card {
	//attributes
	String suit;
	//C, S, H, D
	String face_val;
	//A,2,3,4,5,6,7,8,9,10,J,Q,K
	
	
	//default constructor
	public Card() {
		this.suit = "Clubs";
		this.face_val = "A";
	}
	
	//constructor given suit and face 
	public Card(String suit, String face_val) {
		//check to see if suit or face_val is invalid and get rid of it if it is invalid. 
		if (suit.equals("Diamonds") || suit.equals("Hearts") || suit.equals("Clubs") || suit.equals("Spades")) {
			this.suit = suit;
		} else {
			//throw error
			throw new IllegalArgumentException("invalid club");
		}
		
		if (face_val.equals("A") || face_val.equals("2") || face_val.equals("3") || face_val.equals("4") || face_val.equals("5") || face_val.equals("6") || face_val.equals("7") || face_val.equals("8") || face_val.equals("9") || face_val.equals("10") || face_val.equals("J") || face_val.equals("Q") || face_val.equals("K")) {
			this.face_val = face_val;
		} else {
			//throw error 
			throw new IllegalArgumentException("invalid face");
			
		}
		
		
	}
	
	

}
