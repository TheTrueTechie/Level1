// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int RandomNumber = new Random().nextInt(4);; 
	// 3. Print out this variable
System.out.print(RandomNumber);
	// 4. Get the user to enter a question for the 8 ball
String Question = JOptionPane.showInputDialog("Number 1 to 3. Answers will be yes or no or maybe!");
	// 5. If the random number is 0
if (Question.equals("0")) {
	JOptionPane.showMessageDialog(null, "Yes");
} 
	// -- tell the user "Yes"

	// 6. If the random number is 1
if (Question.equals("1")) {
	JOptionPane.showMessageDialog(null, "No");
} 
	// -- tell the user "No"

	// 7. If the random number is 2
if (Question.equals("2")) {
	JOptionPane.showMessageDialog(null, "Maybe?");
} 
	// -- tell the user "Maybe?"

	// 8. If the random number is 3
if (Question.equals("3")) {
	JOptionPane.showMessageDialog(null, "I dont even want to say it?");
} 
	// -- write your own answer

}
}

