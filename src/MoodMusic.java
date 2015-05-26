import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class MoodMusic {
	public static void main(String[] args) {
		String Question = JOptionPane
				.showInputDialog("What mood you in? Happy, Fun, Sleepy");
		if (Question.equals("Happy")) {
			playSound("Happy.mp3");
		}
		if (Question.equals("Fun")) {

		}
		if (Question.equals("Sleepy")) {

		}
		private void playSound(String fileName) {
			AudioClip sound = JApplet
					.newAudioClip(getClass().getResource(fileName));
			sound.play();
		
		}
	}
}

