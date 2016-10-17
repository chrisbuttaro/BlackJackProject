package cardgames;

public class Chip {
protected int value;
	protected int amount; // number of chips to be added to the chip stack
	
	public Chip (int v, int a){
		this.value=v; 
		this.amount=a; 
	}
	
	@Override
	public String toString() {
		return " "+amount +"x $"+ value+" Chips ";
	}
	

}
