package enums;

public enum Suits {
	DIAMOND(1), SPADE(2), HEART(3), CLUB(4);
	
	public final int value;
	
	Suits (int value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		String ret = "";
		
		switch (value) {
		case 1:
			ret = "♦";
			break;
			
		case 2:
			ret = "♠";
			break;
			
		case 3:
			ret = "♥";
			break;
			
		case 4:
			ret = "♣";
			break;

		}
		
		return ret;
	}
}