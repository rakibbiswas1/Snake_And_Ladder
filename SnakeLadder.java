
public class SnakeLadder {
	
	public static void main(String[] args) {
		

		
		int rollDicePlayer1 = 0;
		int dicePlayer1 = 0;
		int POSITIONPlayer1 = 0;
		int rollDicePlayer2 = 0;
		int dicePlayer2 = 0;
		int playOption = 0;
		int POSITIONPlayer2 = 0;
		
		System.out.println("Welcome to Snake And Ladder Game");
		
		while (POSITIONPlayer1 < 100 && POSITIONPlayer2 < 100) {
			
		    System.out.println();
			rollDicePlayer1 = (int)((Math.random()*6)+1);
		    System.out.println("\nPLAYER 1");
			System.out.println("Rolled Dice Value Player 1 : " + rollDicePlayer1);
			playOption = (int) Math.floor(Math.random() * 10) % 3;
			dicePlayer1++;
			
		    switch (playOption) {
				case 0 :
					System.out.println("You encountered a LADDER!");
					System.out.println("You can move " + rollDicePlayer1 +" places ahead Player 1.");
					POSITIONPlayer1 += rollDicePlayer1;
					break;
					
				case 1 :
					System.out.println("You encountered a SNAKE!");
					System.out.println("You will move " + rollDicePlayer1 +" places back Player 1.");
					POSITIONPlayer1 -= rollDicePlayer1;
					break;
					
				case 2 :
					System.out.println("You got NO PLAY");
					System.out.println("You will have to skip your turn Player 1.");
			
			}
			
		    if (POSITIONPlayer1 < 0)
				POSITIONPlayer1 = 0;
		    else
		    	if (POSITIONPlayer1 > 100) {
		    		POSITIONPlayer1 -= rollDicePlayer1;
		    		System.out.println("But Player 1 you need to score exactly " + (100-POSITIONPlayer1) +" to win the game.");
		    	}
		    System.out.println("Current Position Player 1 : Square " + POSITIONPlayer1);
		    
		    
		    System.out.println("\nPLAYER 2");
			rollDicePlayer2 = (int)((Math.random()*6)+1);
		    System.out.println("Rolled Dice Value Player 2 : " + rollDicePlayer2);
		    playOption = (int) Math.floor(Math.random() * 10) % 3;
		    dicePlayer2++;
			
		    switch (playOption) {
				case 0 :
					System.out.println("You encountered a LADDER!");
					System.out.println("You can move " + rollDicePlayer2 +" places ahead Player 2.");
					POSITIONPlayer2 += rollDicePlayer2;
					break;
					
				case 1 :
					System.out.println("You encountered a SNAKE!");
					System.out.println("You will move " + rollDicePlayer2 +" places back Player 2.");
					POSITIONPlayer2 -= rollDicePlayer2;
					break;
					
				case 2 :
					System.out.println("You got NO PLAY");
					System.out.println("You will have to skip your turn Player 2.");
			
			}
			
		    if (POSITIONPlayer2 < 0)
				POSITIONPlayer2 = 0;
		    else
		    	if (POSITIONPlayer2 > 100) {
		    		POSITIONPlayer2 -= rollDicePlayer2;
		    		System.out.println("But Player 2 you need to score exactly " + (100-POSITIONPlayer2) +" to win the game.");
		    	}
		    System.out.println("Current Position Player 2 : Square " + POSITIONPlayer2);
			
		}
		
		System.out.println();
		if(POSITIONPlayer1 == 100)
			System.out.println("Player 1 WINS THE GAME!");
		else
			System.out.println("Player 2 WINS THE GAME!");
		System.out.println();
		System.out.println("Total Number of dice rolls PLayer 1 = " + dicePlayer1);
		System.out.println("Total Number of dice rolls PLayer 2 = " + dicePlayer2);
		System.out.println("Final Position PLayer 1 = " + POSITIONPlayer1);
		System.out.println("Final Position PLayer 2 = " + POSITIONPlayer2);

	}


	
}
