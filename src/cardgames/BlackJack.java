package cardgames;

import java.util.Scanner;

public class BlackJack {
	Deck deck=new Deck();
	Player dealer=new Player("Dealer");
	Player player= new Player("Player");
	int bet=0; 
	Scanner keyboard= new Scanner(System.in);
	

	public static void main(String[] args) {
		BlackJack game = new BlackJack();
		game.startGame();
		
	}

	public void startGame() {
		
		if(player.chipStack.Total()<=0){// check to see if the player chipStack is positive, ends game otherwise
			System.out.println("Game Over");
			System.exit(0);
		}
			
		player.hand.clear();// start with fresh hands each round
		dealer.hand.clear();
		
		System.out.println("*************");
		System.out.println("  Black Jack    ");
		System.out.println("*************\n");
		
		
		player.displayChipStack();
		System.out.println("\nTotal Stack: $"+player.chipStack.Total()+"\n");
		
		System.out.println("How much would you like to bet?");
		bet=keyboard.nextInt(); 
		
		if(bet>player.chipStack.Total()){
			System.out.println("You don't have enough chips!");
			startGame(); 
		}
		
		
		if(deck.isEmpty()){// creates new deck if deck empty
			Deck deck1=new Deck(); 
			deck=deck1; 
		}
		deck.Shuffle();
		
		for (int i = 0; i < 2; i++) {// deals two cards to dealer and player
			deck.Deal(player.hand);
			deck.Deal(dealer.hand);
		}
		dealer.display1stHand();
		player.displayHand();
	
		
		playerTurn();
	}

	public void playerTurn() {
		
		char decision = 'h';

		while (decision == 'h') {// deals a new hard to a player until the player "stays" or busts. 

			System.out.println("Hit or Stand (h/s)");
			decision = keyboard.next().charAt(0);

			 if (decision=='h' && player.hand.total() < 21) {
				deck.Deal(player.hand);
				player.displayHand();
			}
			if (player.hand.total() == 21) {
				dealerTurn(); 
			}
			if (player.hand.total() > 21) {
				System.out.println("Busted! You Lose");
				player.chipStack.Subtract(bet);	
				startGame();// starts a new round
				
				
			}
		
		}
		dealerTurn(); 
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
				compareHands();// displays the winner if dealer doesn't bust
				this.startGame();
				break;
			}
			if (dealer.hand.total() > 21) {

				System.out.println("Dealer Busted!");
				System.out.println("You win! \n");
				player.chipStack.Add(bet); // player collects winnings
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
			player.chipStack.Subtract(bet);
			break;
		case 1:
			System.out.println("Dealer Wins!");
			player.chipStack.Subtract(bet);
			break;
		}

	}

	

}
