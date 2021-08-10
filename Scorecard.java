/**
 * Scorecard object class; creates mechanism for storing live player data/scores.
 * 
 * @author Jake
 * @version 08.03.2021
 */
public class Scorecard {

	private int yahtzee; // score 50
	private int ones; // sum of all ones
	private int twos; // sum of all twos
	private int threes; // sum of all threes
	private int fours; // sum of all fours
	private int fives; // sum of all fives
	private int sixes; // sum of all sixes
	private int threeOfAKind; // sum of all dice
	private int fourOfAKind; // sum of all dice
	private int fullHouse; // score 25
	private int smallStraight; // score 30
	private int largeStraight; // score 40
	private int chance; // sum of all dice
	private int bonus; // set to 35 or 0 depending on subtotal
	private int subtotal; // total of ones, twos, ..., sixes
	private int total; // total of all scores
	
	/** 
	 * Default Constructor.
	 * All values set to 0 by default.
	 */
	public Scorecard() {
		this.yahtzee = 0;
		this.ones = 0;
		this.twos = 0;
		this.threes = 0;
		this.fours = 0;
		this.fives = 0;
		this.sixes = 0;
		this.threeOfAKind = 0;
		this.fourOfAKind = 0;
		this.fullHouse = 0;
		this.smallStraight = 0;
		this.largeStraight = 0;
		this.chance = 0;
		this.bonus = 0;
		this.subtotal = 0;
		this.total = 0;
	}
	
	/**
	 * Getter for value of yahtzee.  Yahtzee is scored if 5 of a kind are rolled.
	 * 
	 * @return value of yahtzee- set to either 50 or 0.
	 */
	public int getYahtzee() {
		return this.yahtzee;
	}
	
	/**
	 * Yahtzee setter.  Yahtzee is either 50 or 0.
	 */
	public void scoreYahtzee() {
		this.yahtzee = 50;
		this.total += this.yahtzee;
	}
	
	/**
	 * Ones getter.  Returns the sum of all ones rolled in a turn.
	 * 
	 * @return sum of all ones only.
	 */
	public int getOnes() {
		return this.ones;
	}
	
	/**
	 * Ones score setter.  Sums all of the ones rolled in a turn.
	 * 
	 * @param rolledOnes number of ones to add to score.
	 */
	public void scoreOnes(int rolledOnes) {
		this.ones += rolledOnes;
		this.subtotal += this.ones;
		this.total += this.ones;
	}
	
	/**
	 * Twos getter.  Returns the sum of all twos rolled in a turn.
	 * 
	 * @return sum of all twos only.
	 */
	public int getTwos() {
		return this.twos;
	}
	
	/**
	 * Twos score setter.  Sums all of the twos rolled in a turn.
	 * 
	 * @param rolledTwos sum of twos to add to score.
	 */
	public void setTwos(int rolledTwos) {
		this.twos += rolledTwos;
		this.subtotal += this.twos;
		this.total += this.twos;
	}
	
	/**
	 * Threes getter.  Returns the sum of all threes rolled in a turn.
	 * 
	 * @return sum of all threes only.
	 */
	public int getThrees() {
		return this.threes;
	}
	
	/**
	 * Threes score setter.  Sums all of the threes rolled in a turn.
	 * 
	 * @param rolledThrees sum of threes to add to score.
	 */
	public void setThrees(int rolledThrees) {
		this.threes += rolledThrees;
		this.subtotal += this.threes;
		this.total += this.threes;
	}
	
	/**
	 * Fours getter.  Returns the sum of all fours rolled in a turn.
	 * 
	 * @return sum of all fours only.
	 */
	public int getFours() {
		return this.fours;
	}
	
	/**
	 * Fours score setter. Sums all of the fours rolled in a turn.
	 * 
	 * @param rolledFours sum of fours to add to score.
	 */
	public void setFours(int rolledFours) {
		this.fours += rolledFours;
		this.subtotal += this.fours;
		this.total += this.fours;
	}
	
	/**
	 * Fives getter.  Returns the sum of all fives rolled in a turn.
	 * 
	 * @return sum of all fives only.
	 */
	public int getFives() {
		return this.fives;
	}
	
	/**
	 * Fives score setter.  Sums all of the fives rolled in a turn.
	 * 
	 * @param rolledFives sum of fives to add to score.
	 */
	public void setFives(int rolledFives) {
		this.fives += rolledFives;
		this.subtotal += this.fives;
		this.total += this.fives;
	}
	
	/**
	 * Sixes getter.  Returns the sum of all sixes rolled in a turn.
	 * 
	 * @return sum of all sixes only.
	 */
	public int getSixes() {
		return this.sixes;
	}
	
	/**
	 * Sixes score setter.  Sums all of the sixes rolled in a turn.
	 * 
	 * @param rolledSixes sum of sixes to add to score.
	 */
	public void setSixes(int rolledSixes) {
		this.sixes += rolledSixes;
		this.subtotal += this.sixes;
		this.total += this.sixes;
	}
	
	/**
	 * Set value of three of a kind roll.  Sum all dice as long as three of a kind 
	 * are present.
	 * 
	 * @param rolledThreeOfAKind sum of all dice rolled.
	 */
	public void setThreeOfAKind(int rolledThreeOfAKind) {
		this.threeOfAKind += rolledThreeOfAKind;
		this.total += this.threeOfAKind;
	}
	
	/**
	 * Set value of four of a kind roll.  Sum all dice as long as four of a kind are 
	 * present.
	 * 
	 * @param rolledFourOfAKind sum of all dice rolled.
	 */
	public void setFourOfAKind(int rolledFourOfAKind) {
		this.fourOfAKind += rolledFourOfAKind;
		this.total += this.fourOfAKind;
	}
	
	/**
	 * Get value of chance roll.  Sum of all dice rolled.
	 * 
	 * @return sum of all dice rolled in this turn.
	 */
	public int getChance() {
		return this.chance;
	}
	
	/**
	 * Set value of chance.  Sum of all dice rolled.
	 * 
	 * @param rolledChance sum of all dice rolled.
	 */
	public void setChance(int rolledChance) {
		this.chance = rolledChance;
		this.total += this.chance;
	}
	
	/**
	 * Set value of full house.  Set to 25 if 2 of a kind and 3 of a kind are 
	 * present.
	 */
	public void setFullHouse() {
		this.fullHouse = 25;
		this.total += this.fullHouse;
	}
	
	/**
	 * Set value of large straight.  Set to 40 if 5 dice straight is present.
	 */
	public void setLargeStraight() {
		this.largeStraight = 40;
		this.total += this.largeStraight;
	}
	
	/**
	 * Set value of small straight.  Set to 30 if 4 dice straight is present.
	 */
	public void setSmallStraight() {
		this.smallStraight = 40;
		this.total += this.smallStraight;
	}
	
	/**
	 * Get the total of ones, twos, ..., sixes.
	 * 
	 * @return sum of ones through sixes.
	 */
	public int getSubtotal() {
		return this.subtotal;
	}
	
	/**
	 * Get and set bonus based on subtotal and add to total score.
	 */
	public int setBonus() {
		this.bonus = 0;
		if (this.subtotal >= 63) this.bonus = 63;
		return bonus;
	}
	
	/**
	 * Total should be updated by all other methods as needed.
	 * 
	 * @return total of player score.
	 */
	public int getTotal() {
		return this.total;
	}
}
