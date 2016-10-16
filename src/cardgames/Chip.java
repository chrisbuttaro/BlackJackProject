package cardgames;

public class Chip {
protected int value;
	protected int amount; 
	
	public Chip (int v, int a){
		this.value=v; 
		this.amount=a; 
	}

	@Override
	public String toString() {
		return " "+amount +"x"+ value+"Chips ";
	}
	

}
