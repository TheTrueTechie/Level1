public class Person {
	String Name;
	int Age;
	String Hobby;

	public void PrintMe() {
		System.out.println("Hello my name is " + Name + ". I'm " + Age + " Old. Also " + Hobby);

	}

	Person(String N, int A) {
		Name = N;
		Age = A;
	}
	Person(String N, int A, String H) {
		Name = N;
		Age = A;
		Hobby = H;
	}
}
