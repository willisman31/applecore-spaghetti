
public class Dice {

	private int[] value;
	private boolean[] toRoll;
	
	/**
	 * Default Dice constructor.
	 */
	public Dice() {
		toRoll = new boolean[5];
		for (int i = 0; i < 5; i++) {
			toRoll[i] = false;
			value[i] = -1;
		}
	}
	
	/**
	 * Roll dice if corresponding array value is true.
	 */
	public void roll() {
		for (int i = 0; i < 5; i++) {
			if (this.toRoll[i]) value[i] = (int) (Math.random() * 6) + 1;
		}
	}
	
	/**
	 * Select which dice will be rolled.
	 * Make sure that this function is looped in the play class/method so that 
	 * multiple dice can be selected to be rolled.
	 * 
	 * @param a is index of dice to be rolled.
	 */
	public void select(int a) {
		if (a < 5 && a >= 0)
		toRoll[a] = true;
	}
	
}
