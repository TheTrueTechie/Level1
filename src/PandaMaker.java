
public class PandaMaker {
public static void main(String[] args) {
	Panda Fluffy = new Panda("Fluffy", 2, "Unknown", 70);
	
	Panda Joey = new Panda("Joey", 5, "Unknown", 140);
	
	Fluffy.bite();
	Fluffy.eat();
	Fluffy.yawn();
	
	Joey.bite();
	Joey.eat();
	Joey.yawn();
}
}
