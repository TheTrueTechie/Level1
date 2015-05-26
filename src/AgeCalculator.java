import javax.swing.JOptionPane;

//Created by Andrew Erickson, Sept 2014
//Level 1 - using methods


public class AgeCalculator {

	public static void main(String[] args) {
		// 1. Create a string variable for your name and an int for your age
String Name = "Shiva"; 
int Age = 40;
int Months;
int Days;
int Minute;
// 2. Call the Hello() method 
//3. Create and call your own void method that takes a name as a string input and prints a greeting. Ex. ÒHello <input>. How are you?Ó
Input(Name);
//4. Modify that method so that it outputs the string

//5. Create a method that takes your age in years and returns your age in months
//Months = Age(Age);
//Days = Days(Age);
Months = printMonths(Age);

//6. Create a method called printAge that takes an int as an input. Have this method say ÒYou are <input> months old. Ò
//monthsAge(Days);
printAge(Months, " months");

//7. Create a method called that takes your age in years and returns your age in days
Days = printDays(Age);
printAge(Days," days");

//8. Create a method that takes your age in years and returns your age in mins
Minute = printMinute(Age);
printAge(Minute, " minutes");
//printMinute(Minute," minute");
//9. Modify printAge to take a string value for a unit as well. Have this method say ÒYou are <input> <units> old.Ó

//10. Call this method several times to display your age in months and mins. 

	}
	
	private static int printMinute(int input) {
		//System.out.println(input);
				input = input * 365*24*60; 
				return input;  
	}

	private static void printAge(int input, String input2) {
		System.out.print("You are ");
		System.out.print(input);
		System.out.print(input2);
		System.out.println(" old");
	}

	private static int Age(int age) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int printDays(int input) {
		//System.out.println(input);
		input = input * 365; 
		return input;  
	}

	private static int printMonths(int input) {
		System.out.println(input);
		input = input * 12; 
		return input;
	}

	private static int monthsAge(int input) {
		System.out.println(input);
		input = input * 12; 
		return input;  
	}

	private static String Input(String input) {
		System.out.println(input);
		return input; 
	}


	
}


