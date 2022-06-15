/*
 * @author Rahul Arora 
 */

//import Random
import java.util.Random;

public class Deck {
	
	//default constructor- auto unshuffles deck
	public Deck() {
		unshuffleTheDeck();
	}
	
	//creates new deck of 52 cards
	static Card[] deck = new Card[52];
	
	//pre-condition: 52 cards have been created
	//post-condition: 52 cards have been unshuffled
	
	public static Card[] unshuffleTheDeck(){
		
		//array of suits
		String[] suits = new String[] {
				"Clubs", "Hearts", "Spades", "Diamonds"
		};
		
		//array of faces
		String[] face_vals = new String[] {
				"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
		};
		
		//loop through faces and suits and make a card of each in order
		for (int x = 0; x < suits.length; x++) {
			//loop through all suits
			for (int n = 1; n <= face_vals.length; n++) {
				//loop through all faces
				
				//this is how I can calculate how many cards I have done  
				int number = (n + (13*x))-1;
				deck[number] = new Card(suits[x],face_vals[n-1]);
				
				
			}
			
			
		}
		
		return deck;
		
	}
	
	//this function switches the location of a  given card with a random card in the deck. I run this function with every card to shuffle the deck.
	
	//pre-conditions: two cards given
	//post-condition: the location of the cards has been switched.
	
	public static Card[] switchCardsInDeck(Card[] new_deck, int index1, int index2) {
		
		//creating a temporary variable so that I can perform the switch without losing the first
		Card temp = new_deck[index2];
		new_deck[index2] = new_deck[index1];
		new_deck[index1] = temp;
		
		//returning the new deck with those cards switched
		return new_deck;
		
	}
	
	//this is the function which runs the switchCardsInDeck() function on every card in the deck
	
	public Card[] shuffleTheDeck(){
		
		for(int counter = 0; counter < deck.length; counter++) {
			//loop through all cards in the deck
			int rnd = new Random().nextInt(deck.length);
			deck = switchCardsInDeck(deck, counter, rnd);
		}
		//returned the new shuffled deck
		return deck;
		
	}
	
	//looping through the entire deck and printing it 
	public static void printCurrentDeck() {
		for(Card card:deck) {
			System.out.println(card.face_val + " of " +  card.suit);
			
		}
	}

}
