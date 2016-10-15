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

		System.out.println("*************"); 
		System.out.println("  Black Jack "); 
		
		System.out.println("*************"); 
		
		System.out.println(); 
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
				dealerTurn(); 
				break;
			} else if (player.getHand().total()<21) {
				deck.Deal(player.getHand());
				player.displayHand();
			} if(player.getHand().total()==21){
				 dealerTurn();
				 break; 
				} if (player.getHand().total()>21){
					System.out.println("Bust! You Lose");
					System.out.println();
					startGame();
					break; 
				}
			}
		}

	

	public void dealerTurn() {
		char decision = 'h';
		dealer.displayHand();
		while (decision == 'h') {
			
			if (dealer.getHand().total() < 17) {
				deck.Deal(dealer.getHand());
				dealer.displayHand();
				decision = 'h';

			} if(dealer.getHand().total() >=17 && dealer.getHand().total() <= 21) {
				compareHands(); 
				this.startGame(); 
				break; 
			}  if(dealer.getHand().total()>21) {
				
				System.out.println("Dealer Bust!");
				System.out.println("You win!");
				System.out.println();
				startGame(); 
				decision = 's';
				break; 

			}
		}
	}

	public void compareHands(){
		switch (dealer.getHand().compareTo(player.getHand())){
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
}
