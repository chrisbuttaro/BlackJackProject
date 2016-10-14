package cardgames;

import java.util.Scanner;

public class BlackJack {

	Hand dealerHand = new Hand();
	Hand playerHand = new Hand();
	Player dealer = new Player(dealerHand);
	Player player = new Player(playerHand);
	Deck deck = new Deck();

	public static void main(String[] args) {
		BlackJack game = new BlackJack();
		game.startGame();

	}

	public void startGame() {
		deck.Shuffle();

		for (int i = 0; i < 2; i++) {
			deck.Deal(playerHand);
			deck.Deal(dealerHand);
		}
		System.out.println("Player hand");
		playerHand.displayHand();
		System.out.println("Dealer hand");
		dealerHand.displayHand();
		playerTurn(); 
	}

	public void playerTurn() {
		char decision = 'h';
		while (decision == 'h') {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Hit or Stand (h/s)");
			decision = keyboard.next().charAt(0);
		//	keyboard.close();
			if (decision == 's') {
				break;
			} else {
				deck.Deal(playerHand);
				playerHand.displayHand();
			}
		}
		dealerTurn(); 
	}

	public void dealerTurn() {

	}
}
