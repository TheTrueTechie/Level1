
public class Dog {

	String Name;
	int Age;
	String Type;
	int numberOfteeth;
	Dog (String Name, int Age, String Type, int numberOfteeth) {
		this.Name = Name;
		this.Age = Age;
		this.Type = Type;
		this.numberOfteeth = numberOfteeth;
	}
	void bark() {
	System.out.println("Woof! Woof!!");
	speak("Woof! Woof!!");
	}
	void eat() {
		System.out.println("Yumm Yumm");
		speak("Yumm Yumm");
	}
	void bite() {
		System.out.println("Chomp! Chomp!!");
	}
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	    }

}

