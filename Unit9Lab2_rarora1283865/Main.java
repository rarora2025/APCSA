/*
 * @author Rahul Arora
 */
public class Main {

	public static void main(String[] args) {
	
	//creating a new deck object which will automatically create 52 new card objects (default constructor)	
	//these cards will be in order, because the default constructor calls the unshuffle method
		Deck deck = new Deck();
		
		//notifying user that the presented deck will be unshuffled.
		System.out.printf("Original Deck: \n\n");
		deck.printCurrentDeck();
		deck.shuffleTheDeck();
		
		//notifying the user that the shuffle method has been called
		System.out.printf("\n\nShuffled Deck: \n\n");
		
		//calling the print
		deck.printCurrentDeck();

	}

}
