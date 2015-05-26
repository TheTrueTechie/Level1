
public class SuperPower {
public static void main(String[] args) {
	Hero Person = new Hero(); 
	Hero Person2 = new Hero();
	Hero Person3 = new Hero();
	Person.setName("Billy");
	Person2.setName("Bob");
	Person3.setName("Joe");
Person.setPower("Fly");
Person2.setPower("Invincibility");
Person3.setPower("Speed");
	//Person.name = "BillyBobJoe"; 
	//Person.power = "Fly";
	//Person2.power = "Invincibility";
	//Person3.power = "Speed";
	//System.out.println(Person.name);
	//System.out.println(Person.power);
	//System.out.println(Person2.power);
	//System.out.println(Person3.power);
Person.Speak();
Person2.Speak();
Person3.Speak();
}
}
