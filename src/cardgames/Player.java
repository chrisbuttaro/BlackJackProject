package cardgames;

public class Player{
	private String name; 
	private Hand hand; 
	
		
	public Player(String n, Hand h){	
		this.name=n; 
		this.hand= h;  
	}
	
	public void display1stHand(){// for delaers who have the fist card not showing
		System.out.println("\u1F0A0"+hand.get(1)); 
	}
	
	public void displayHand() {
		System.out.println(name+": ");
		for (Card card : hand) {
			System.out.print(card+" ");
		}
		System.out.println();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Hand getHand() {
		return hand;
	}


	public void setHand(Hand hand) {
		this.hand = hand;
	}

	
		
	}
	

