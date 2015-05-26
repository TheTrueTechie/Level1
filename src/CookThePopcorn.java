
public class CookThePopcorn {
public static void main(String[] args) {
	Microwave Micro = new Microwave(); 
	Popcorn Pop = new Popcorn("Cheddar");
	
	Micro.setTime(2);
	Micro.putInMicrowave(Pop);
	Micro.startMicrowave();
	
}
}
