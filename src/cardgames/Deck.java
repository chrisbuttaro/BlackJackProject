package cardgames;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Deck {
	int numberOfcards;
	Card cards[] = new Card[52];

	public void makeDeck() {
		

	for (int i = 0; i < 52; i++) {
			if (i <13) {
				cards[i]=new Card(i, Suit.Spades);
			
			} else if (i >=13 && i < 26) {
				cards[i]=new Card(i, Suit.Clubs);
		
		} else if (i >= 26 && i < 39) {
			cards[i]=new Card(i, Suit.Diamonds);
	
			} else if (i >= 39 && i < 52) {
				cards[i]=new Card(i, Suit.Hearts);
			
			}
			
		} // end for

	}// makeDeck
	
	public void Shuffel(){
		int currentIndex=cards.length, randomIndex=0;
		Card temporaryValue; 
			while (0 != currentIndex) {

			    // Pick a remaining element...
			    randomIndex = (int)(1+Math.random() * currentIndex);
			    currentIndex -= 1;

			    // And swap it with the current element.
			    temporaryValue = cards[currentIndex];
			    cards[currentIndex] = cards[randomIndex];
			    cards[randomIndex] = temporaryValue;
			  }
			for (int i = 0; i < 52; i++) {
				if ( i>0 && cards[i].equals(cards[i-1] )) 
			System.out.println(cards[i]);
			}
		}
		
		
	
	
	
	
}// end class