package cardgames;

import java.util.Scanner;

public class BlackJack {
	Deck deck;
	Player dealer;
	Player player;

	public static void main(String[] args) {
		BlackJack game = new BlackJack();
		game.startGame();

	}

	public void startGame() {
		deck = new Deck();
		dealer = new Player("Dealer");
		player = new Player("Player");
		loadChips(); // unused did not complete

		System.out.println("*************");
		System.out.println("  Black Jack ");
		System.out.println("*************");
		System.out.println();
		deck.Shuffle();
		
		for (int i = 0; i < 2; i++) {// deals two cards to dealer and player
			deck.Deal(player.hand);
			deck.Deal(dealer.hand);
		}
		dealer.display1stHand();
		player.displayHand();
		//player.chipSet.display();
		playerTurn();
	}

	public void playerTurn() {
		Scanner keyboard = new Scanner(System.in);
		char decision = 'h';

	///	System.out.println("How much would you like to bet?");
		//int bet=keyboard.nextInt(); 
		
		
		while (decision == 'h') {// deals a new hard to a player until the player "stays" or busts. 
		

			System.out.println("Hit or Stand (h/s)");
			decision = keyboard.next().charAt(0);

			if (decision == 's') {
				dealerTurn();
				break;
			} else if (player.hand.total() < 21) {
				deck.Deal(player.hand);
				player.displayHand();
			}
			if (player.hand.total() == 21) {
				dealerTurn();
				break;
			}
			if (player.hand.total() > 21) {
				System.out.println("Busted! You Lose");
				System.out.println();
				startGame();
				break;
			}
		}
	}

	public void dealerTurn() {
		char decision = 'h';
		dealer.displayHand();
		while (decision == 'h') {// delaer will hit only while under 17 

			if (dealer.hand.total() < 17) {
				deck.Deal(dealer.hand);
				dealer.displayHand();
				decision = 'h';

			}
			if (dealer.hand.total() >= 17 && dealer.hand.total() <= 21) {
				compareHands();
				this.startGame();
				break;
			}
			if (dealer.hand.total() > 21) {

				System.out.println("Dealer Busted!");
				System.out.println("You win!");
				System.out.println();
				startGame();
				decision = 's';
				break;
			}
		}
	}

	public void compareHands() {
		switch (dealer.hand.compareTo(player.hand)) {
		case -1:
			System.out.println("You WIn!");
			break;
		case 0:
			System.out.println("Draw!");
			break;
		case 1:
			System.out.println("Dealer Wins!");
			break;
		}

	}

	public void loadChips() {// not used did not complete
		
		Chip fifty = new Chip(50, 2);
		Chip twenty = new Chip(20, 5);
		Chip ten = new Chip(10, 5);
		Chip five = new Chip(5, 5);
		
		Chip [] chips ={fifty, twenty, ten, five};

			for (Chip chip : chips) {
				for (int i=0; i<chip.amount; i++){
					player.chipSet.put(chip, chip.value);
					}
			}
			
		}

}
