
class TeaBag {

	public final static String GREEN = "Green";
	public final static String MINT = "Mint";
	public final static String CHAMOMILE = "Chamomile";
	public final static String PASSION_FRUIT = "Passion Fruit";

	private String flavor;

	TeaBag(String flavor) {
		this.flavor = flavor;
	}

	String getFlavor() {
		return flavor;
	}

}

