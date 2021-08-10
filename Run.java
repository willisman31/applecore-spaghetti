/**
 * Run class; runs the basic logic of Yahtzee program.
 * 
 * @author Jake
 * @version 08.03.2021
 */
public class Run {

	/**
	 * Main method.
	 * 
	 * @param args accepts command line arguments.
	 */
	public static void main(String [] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		for (int i = 0; i < 13; i++) {
			turn(player1);
			turn(player2);
		}
		score();
	}
	
	/**
	 * Turn logic for each player.
	 */
	public static void turn(Player p) {
		// TODO
	}
	
	/**
	 * Compares scores and produces winning message.
	 */
	public static void score() {
		// TODO
	}
}
