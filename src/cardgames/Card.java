package cardgames;

public class Card {

	protected String name;
	protected char suit;
	protected int value; 

	public Card(String n, char s, int v) {
		this.name = n;
		this.suit = s;
		this.value=v; 
	}

		public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return  name + " " + suit;
	}

}
