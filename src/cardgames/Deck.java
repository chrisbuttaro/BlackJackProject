package cardgames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Deck extends ArrayList<Card> {


	public void makeDeck() {
		char[] suits = { '\u2660', '\u2666', '\u2663', '\u2764' };
		String[] cardNames = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K", "A" };
		int [] cardValues={2,3,4,5,6,7,8,9,10,10,10,10,1}; 
		
		for (char suit : suits) {
			int i=0;// increments from 0-12 4x
			for (String name : cardNames) {
				  Card card = new Card(name, suit, cardValues[i++]);
				  this.add(card);
				}
			}
		
		//  for (Card card : this) {System.out.println(card.getvalue()+ " " +card.getSuit());}
	}// makeDeck
	
	public void Shuffle() {
		makeDeck();
		Collections.shuffle(this);
		//for (Card card : this) {System.out.println(card.getName()+" "+card.getSuit()+" "+card.getValue());}
	}// shuffle

	public void Deal(Hand hand){
		hand.add(this.get(0));
		this.remove(0);
	}
}// end class