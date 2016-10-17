package cardgames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Deck extends ArrayList<Card> {

	public void makeDeck() {
		char[] suits = { '\u2660', '\u2666', '\u2663', '\u2764' };
		String[] cardNames = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		int[] cardValues = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1 };

		for (char suit : suits) {// loads this array list with cards
			int i = 0;// increments from 0-12 4x
			for (String name : cardNames) {
				Card card = new Card(name, suit, cardValues[i++]);
				this.add(card);
			}
		}
	}// makeDeck

	public void Shuffle() {
		makeDeck();
		Collections.shuffle(this);
	}// shuffle

	public void Deal(Hand hand) {// adds first card from deck to "this" hand list, and removes card from deck
		hand.add(this.get(0));
		this.remove(0);
	}
}// end class