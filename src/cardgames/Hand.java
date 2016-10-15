package cardgames;

import java.util.ArrayList;


public class Hand extends ArrayList<Card> implements Comparable<Hand>{

	

		public int total(){
			int count=0; 
			for (Card card : this) {
				count +=card.getValue(); 	
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
