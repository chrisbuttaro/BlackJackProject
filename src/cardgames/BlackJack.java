package cardgames;

import java.util.Scanner;

public class BlackJack {
	Deck deck=new Deck(); 
	Hand pH=new Hand();
	Hand dH=new Hand();
	Player dealer = new Player("dealer", dH);
	Player player = new Player("player",pH);

	public static void main(String[] args) {
		BlackJack game = new BlackJack();
		game.startGame();

	}

	public void startGame() {
		deck.Shuffle();

		for (int i = 0; i < 2; i++) {
			deck.Deal(player.getHand());
			deck.Deal(dealer.getHand());
		}
		dealer.display1stHand();
		player.displayHand();
		playerTurn(); 
	}

	public void playerTurn() {
		char decision = 'h';
		while (decision == 'h') {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Hit or Stand (h/s)");
			decision = keyboard.next().charAt(0);
			
			
		    if (player.getHand().total()>21){
		    	System.out.println("Bust!");
		    	decision='s';
		    	}
		    
			if (decision == 's') {
			    break;
			}else{
				deck.Deal(player.getHand());
				player.displayHand();
			}
		}
		dealerTurn(); 
	}

	public void dealerTurn() {

	}
}
