package cardgames;

import java.util.Scanner;

public class BlackJack {
	Deck deck = new Deck();
	Hand pH = new Hand();
	Hand dH = new Hand();
	Player dealer = new Player("Dealer", dH);
	Player player = new Player("Player", pH);

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

			if (decision == 's') {
				break;
			} else {
				deck.Deal(player.getHand());
				player.displayHand();
				if (player.getHand().total() > 21) {
					System.out.println("Bust!");
					decision = 's';
				}
			}
		}
		dealerTurn();
	}

	public void dealerTurn() {
		char decision='h';
		dealer.displayHand();
		while (decision == 'h') {
			deck.Deal(dealer.getHand());
			dealer.displayHand();
			if (dealer.getHand().total()<17) {
				decision='h';
			
			}else if(dealer.getHand().total()==17 || dealer.getHand().total()<=21){
					decision='s';
				} else { 
				dealer.displayHand();
				System.out.println("Bust!");
				decision = 's';
				
			}
		}

	}
}
