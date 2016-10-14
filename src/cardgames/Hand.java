package cardgames;

import java.util.ArrayList;

public class Hand extends ArrayList<Card> {

	public void displayHand() {
		for (Card card : this) {
			System.out.println(card);
		}

	}

}
