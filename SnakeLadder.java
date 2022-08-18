
public class SnakeLadder {

	public static void main(String args[]) {
		int rollDice = 0;
		int playOption = 0;
		int POSITION = 0;

		System.out.println("Welcome to Snake And Ladder Game");
		System.out.println(
				"The Player starts roll the die to get a number between 1 to 6, and ladder or a snake keeps doing till the winning spot 100 is achieved.");

		System.out.println("Let's begin the game...");
		System.out.println("Initial position is Square Zero");
		System.out.println("Position : Square " + POSITION);

		rollDice = (int) ((Math.random() * 6) + 1);
		System.out.println("Rolled Dice Value :" + rollDice);

		playOption = (int) Math.floor(Math.random() * 10) % 3;
		int LadderSnake = (int) (Math.random() * (10 + 1) + 1);

		switch (playOption) {
		case 0:
			System.out.println("You encountered a LADDER!");
			System.out.println("You can move " + LadderSnake + " places ahead.");
			POSITION += rollDice + LadderSnake;
			break;

		case 1:
			System.out.println("You encountered a SNAKE!");
			System.out.println("You will move " + LadderSnake + " places back.");
			POSITION += rollDice - LadderSnake;
			break;

		case 2:
			System.out.println("You got NO PLAY");
			System.out.println("You will have to skip your turn.");
			POSITION += rollDice;
			System.out.println(POSITION);

		}

		System.out.println("Current Position : Square " + POSITION);
	}
}
