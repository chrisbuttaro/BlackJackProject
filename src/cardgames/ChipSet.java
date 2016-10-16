package cardgames;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.List;

public class ChipSet extends HashMap<Chip, Integer> implements Comparable<Chip> {

	public void display() {

		Set<Chip> s = this.keySet();
		Iterator<Chip> it = s.iterator();

		while (it.hasNext()) {
			System.out.print(it.next());// prints a chip, which has a two string
										// with a value and amount
		}

	}
	
	public void makeChange(int bet){// edited make change project overwrites the player's chipSet with a new Chip set
		int fifty=0; 
		int twenty=0; 	
		int ten=0; 
		int five=0; 
		int total=0;
		total=bet; 
		
		List<Chip> betChips=new ArrayList<Chip>(); 

		
		
		while(total > 0 ){
			
			if (total>50){
				fifty++; 
			total=total-50;
			}
			
			if (total >= 20 && total <50){
				twenty++;
				total=total-20;
			}

			if (total >= 10 && total <20){
				ten++; 
				total=total-10;
			}
			if (total >= 5f && total <10){
				five++; 
				total=total-5;
			}
		
			
			
		}//end while	
		
		Chip cFifty = new Chip(50, fifty);
		Chip cTwenty = new Chip(20, twenty);
		Chip cTen = new Chip(10, ten);
		Chip cFive = new Chip(5, five);
		
		

		Chip [] chips ={cFifty, cTwenty, cTen, cFive};

		for (Chip chip : chips) {
			for (int i=0; i<chip.amount; i++){
				betChips.add(chip);
				}
		}
	
			
		


		
	}///end countBills
		
	


	

	

	@Override
	public int compareTo(Chip o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
