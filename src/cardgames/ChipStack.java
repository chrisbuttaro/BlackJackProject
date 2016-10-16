package cardgames;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.List;

public class ChipStack extends ArrayList<Chip> implements Comparable<Chip> {

	public int Total(){
		int total=0; 
		for (Chip chip: this) {
			total +=(chip.value*chip.amount); 
			
		}
		return total; 
	}



	public void Subtrack(int bet) {// edited make change project overwrites
										// the player's chipStack with a new Chip Stack
										
		int fifty = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int total = 0;
		total = Total()-bet;

		List<Chip> betChips = new ArrayList<Chip>();

		while (total > 0) {

			if (total > 50) {
				fifty++;
				total = total - 50;
			}

			if (total >= 20 && total < 50) {
				twenty++;
				total = total - 20;
			}

			if (total >= 10 && total < 20) {
				ten++;
				total = total - 10;
			}
			if (total >= 5f && total < 10) {
				five++;
				total = total - 5;
			}

		} // end while

		
		
		for (Chip chip : this) {
			for (int i = 0; i < chip.amount; i++) {
				betChips.add(chip);
			}
		}

	}/// end countBills

	@Override
	public int compareTo(Chip o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
