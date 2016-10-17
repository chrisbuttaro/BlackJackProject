package cardgames;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.List;

public class ChipStack extends ArrayList<Chip> implements Comparable<Chip> {
	
	public ChipStack(){
		Chip fifty = new Chip(50, 2);// 50 is the value, two is the number of chips
		Chip twenty = new Chip(20, 5);
		Chip ten = new Chip(10, 5);
		Chip five = new Chip(5, 5);
		
		Chip [] chips ={fifty, twenty, ten, five};
		
			for (Chip chip : chips) {
				this.add(chip);
					}
			}
	
	

	public int Total(){
		int total=0; 
		for (Chip chip: this) {
			total +=(chip.value*chip.amount); 
			
		}
		return total; 
	}



	public void Subtract(int bet) {// finds the amounts left of each chip, puts them in an Array list and over rights ''this List"
										
		
			while(bet >=50 && this.get(0).amount>0) {
	
				this.get(0).amount--; 
				bet -= 50;
			}

			while(bet >=20 && this.get(1).amount>0) {

				this.get(1).amount-=1; 
				bet -=20;
			}

			while(bet >=10 && this.get(2).amount>0) {
		
				this.get(2).amount-=1; 
				 bet -= 10;
			}
			while (bet >=5 && this.get(3).amount>0) {
		
				this.get(3).amount-=1; 
				 bet -=5;
			}


	
	}

	@Override
	public int compareTo(Chip o) {
		// TODO Auto-generated method stub
		return 0;
	}

}