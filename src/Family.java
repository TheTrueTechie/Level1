public class Family {
	public static void main(String[] args) {
		Person Dad = new Person("Manni", 30, "I like reading");
		Person Mom = new Person("Reena", 30, "I like cooking");
		Person Brother = new Person("Sahil", 14, "I like playing video games");
		Person Myself = new Person("Shiva", 12, "I like programming");
		Person Dog = new Person("Ploopy", 14, "I like licking");
		
		Dad.PrintMe();
		Mom.PrintMe();
		Brother.PrintMe();
		Myself.PrintMe();
		Dog.PrintMe();
	}
}
