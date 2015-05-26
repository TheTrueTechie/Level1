// Copyright Wintriss Technical Schools 2013
/* Your mission should you choose to accept it:
 * Use these classes to cook Popcorn without changing the Microwave or Popcorn classes.
 */

class Microwave {
	private int cookTime;
	Popcorn thingToBeCooked;
public static void main(String[] args) {

}
	Microwave() {
		System.out.println("Microwave says: a Microwave has been made.");
	}

	void putInMicrowave(Popcorn thingToBeCooked) {
		System.out.println("Microwave says: popcorn put in microwave.");
		this.thingToBeCooked = thingToBeCooked;
	}

	void setTime(int cookTime) {
		System.out.println("Microwave says: cook time is set to " + cookTime + " minutes.");
		this.cookTime = cookTime;
	}

	void startMicrowave() {
		if (thingToBeCooked == null)
			System.out.println("Microwave says: there's nothing in the microwave!");
		for (int i = 0; i < cookTime*10 + 1; i++) {
			thingToBeCooked.applyHeat();
		}
	}
}


