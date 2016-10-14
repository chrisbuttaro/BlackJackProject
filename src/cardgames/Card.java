package cardgames;

public class Card {

	private String name;
	private char suit;
	private int value; 

	public Card(String n, char s, int v) {
		this.name = n;
		this.suit = s;
		this.value=v; 
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public char getSuit() {
		return suit;
	}

	public void setSuit(char s) {
		this.suit = s;
	}
	
	@Override
	public String toString() {
		return "Card [name=" + name + ", suit=" + suit + "]";
	}

}
