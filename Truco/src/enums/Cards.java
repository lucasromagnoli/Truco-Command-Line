//
package enums;

public enum Cards {
	ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEEN(10), QUEEN(11), JACK(12), KING(13);
	
	private final int value;

	Cards (int value) {
		this.value = value;
		
	}

	public int getValue() {
		return value;
	}
	
}
