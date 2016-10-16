package cardgames;

import java.util.ArrayList;


public class Hand extends ArrayList<Card> implements Comparable<Hand>{

		public int total(){// sums the values of the cards in a hand
			int count=0; 
			for (Card card : this) {
				count +=card.value; 	
			}
			return count; 
		}

		
		  @Override
		    public int compareTo(Hand other) {
		        if (this.total() < other.total()) {
		            return -1;
		        }
		        else if (this.total() > other.total()) {
		            return 1;
		        }
		        else {
		            return 0;
		        }
		    }

}
