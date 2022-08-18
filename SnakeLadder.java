
public class SnakeLadder {
	
	public static final int POSITION = 0;
	public static final int ROLL_DICE = 0;
	
	public static void main(String args[]) {
		
    System.out.println("Welcome to Snake And Ladder Game");
    System.out.println("The Player starts roll the die to get a number between 1 to 6, and ladder or a snake keeps doing till the winning spot 100 is achieved.");

    System.out.println("Let's begin the game...");
    System.out.println("Initial position is Square Zero");
    System.out.println("Position : Square " + POSITION);

    int rollDice = 0;

    rollDice = (int)((Math.random()*6)+1);
    System.out.println("Rolled Dice Value :" + rollDice);
	}
 }

