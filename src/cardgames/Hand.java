package cardgames;

import java.util.ArrayList;

public class Hand extends ArrayList<Card> {

	

		public int total(){
			int count=0; 
			for (Card card : this) {
				count +=card.getValue(); 	
			}
			return count; 
		}

	

}
