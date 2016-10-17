package cardgames;

public class Chip {
protected int value;
	protected int amount; // number of chips to be added to the chip stack
	
	public Chip (int v, int a){
		this.value=v; 
		this.amount=a; 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chip other = (Chip) obj;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return " "+amount +"x"+ value+"Chips ";
	}
	

}
