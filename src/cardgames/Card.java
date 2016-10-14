package cardgames;

public class Card {

	
	private int value;
	private Suit suit;

	public int getValue() {
		return value;
	}

	public Card(int value, Suit suit) {
		
		this.value = value;
		this.suit = suit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
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
		Card other = (Card) obj;
		if (suit != other.suit)
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit s) {
		this.suit = s;
	}
	
	@Override
	public String toString() {
		return "Card [value=" + value + ", suit=" + suit + "]";
	}

}
