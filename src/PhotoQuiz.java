// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String FrogImage = "http://upload.wikimedia.org/wikipedia/commons/b/be/Red_eyed_tree_frog_edit2.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component FrogPic;
		// 3. use the "createImage()" method below to initialize your Component
FrogPic = createImage(FrogImage); 

		// 4. add the image to the quiz window
quizWindow.add(FrogPic);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String Question = JOptionPane.showInputDialog("What picture is this? The main picture. Start with a captial letter");
		// 7. print "CORRECT" if the user gave the right answer
if (Question.equals("Frog")) {
	JOptionPane.showMessageDialog(null, "Correct!");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "Incorrect");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(FrogPic);
		// 10. find another image and create it
String DogImage = "http://news.distractify.com/wp-content/uploads/2014/01/new-userguide-image.jpg";
		// 11. add the second image to the quiz window
Component DogPic;
DogPic = createImage(DogImage);
quizWindow.add(DogPic);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String Question2 = JOptionPane.showInputDialog("What picture is this? The main picture. Start with a captial letter");
		// 14+ check answer, say if correct or incorrect, etc.
if (Question2.equals("Dog")) {
	JOptionPane.showMessageDialog(null, "Correct");
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect");
}
System.exit(0);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}



