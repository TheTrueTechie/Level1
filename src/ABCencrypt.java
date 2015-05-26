import java.net.URL;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class ABCencrypt {
	
	public static void main(String[] args) {
		/* Your mission: use the tryCode method to crack the safe by trying all possible combinations of letters*/


		//1. Create a string with letters a-z called “characters”
String Characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String Passcode = null; 
		//for{
	//3. create a random integer between 0 and 25
	

	//2. Use a for loop to print each letter at a time
	for (int i = 0; i < 4; i++) {
		double index = Math.random() * 26;
		System.out.println(Characters.charAt((int)index));
		Passcode = Passcode + Characters.charAt((int)index);; 
		
	}
//characters.charAt((int) index);

//4. print 4 random letters
	//System.out.print((int)index);
	
//5. create a secret code 4 letters long 
		//}
		
		//6. Create a loop to print every combination of letters
	
		//7. Store these combinations into a string and test to the secret code
	
		//8. If a match is found display a message with the final code
	}
}
