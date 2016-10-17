package cardgames;

public class Player {
	protected String name;
	protected Hand hand;
	protected ChipStack chipStack;

	public Player(String n) {
		this.name=n;
		this.hand = new Hand();
		this.chipStack= new ChipStack();
	}

	public void display1stHand() {// for dealers who have the first card not
									// showing
		System.out.print(name + ":   ");
		String s = "\uD83C\uDCA0    ";// ascii card face down
		System.out.println(s + hand.get(1));// one face down, one face up

	}

	public void displayHand() {
		System.out.print(name + ":  ");
		for (Card card : hand) {
			System.out.print(card + "  ");
		}
		System.out.println("\n" + hand.total());
		System.out.println();

	}

	public void displayChipStack() {

		
		for (Chip chip: chipStack) {
			System.out.println(chip +" "); 
			}
		}

		
}
