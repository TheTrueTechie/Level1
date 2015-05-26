// Copyright Wintriss Technical Schools 2013
/* 
 * 1. Watch this smurf cartoon: http://www.youtube.com/watch?v=drf4t7wBTsA
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurf {

	private String name;
	private String Gender;
	private String Hat;

	Smurf(String name) {
		this.name = name;
		System.out.println(name);
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if (name.equals("PapaSmurf")) {
			Hat = "Blue";
		}
		else {
			Hat = "White";
		}
		System.out.println("His hat is " + Hat);
		return "";
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		if (name.equals("Smurfette")) {
		Gender = "Female";
		}
		else {
			Gender = "Male";
		}
		System.out.println(Gender);
		return "";
	}

	public static void main(String[] args) {
Smurf PapaSmurf = new Smurf("Papa Smurf");
PapaSmurf.getHatColor();
PapaSmurf.isGirlOrBoy();
Smurf Smurfette = new Smurf("Smurfette");
Smurfette.getHatColor();
Smurfette.isGirlOrBoy();
Smurf HandySmurf = new Smurf("Handy Smurf");
HandySmurf.eat();
	}
}
