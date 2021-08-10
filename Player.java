/**
 * Player class; builds default player object to be modified in Run class.
 * 
 * @author Jake
 * @version 08.03.2021
 */
public class Player {

	private boolean turn;
	private int totalScore;
	
	/**
	 * Default constructor.
	 */
	Player() {
		this.turn = false;
		this.totalScore = 0;
	}
	
	/**
	 * Turn getter.
	 * 
	 * @return current value of turn variable for this player object.
	 */
	public boolean getTurn() {
		return this.turn;
	}
	
	/**
	 * Turn setter.
	 * 
	 * @param turn is the new value for this player object's turn parameter.
	 */
	public void setTurn( boolean turn ) {
		this.turn = turn;
	}
	
	/**
	 * Getter for total score of this player.
	 * Total score cannot be explicitly set- only have amounts added.
	 * 
	 * @return total score of this player object.
	 */
	public int getTotalScore() {
		return this.totalScore;
	}
	
	/**
	 * Add given amount to total score.
	 * 
	 * @param addValue is amount to be added to the total score of this player object.
	 */
	public void addToScore( int addValue ) {
		this.totalScore += addValue;
	}
}
