import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JokeButton implements ActionListener {
	JFrame MainFrame = new JFrame();
	JButton Joke = new JButton("Joke");
	JButton Answer = new JButton("Answer");
	JPanel MainPanel = new JPanel();

	public static void main(String[] args) {
		JokeButton Stuff = new JokeButton();
		Stuff.Stuff();
	}

	void Stuff() {
		MainFrame.setVisible(true);
		MainFrame.setSize(150, 150);
		MainPanel.add(Joke);
		MainPanel.add(Answer);
		MainFrame.add(MainPanel);
		Joke.addActionListener(this);
		Answer.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton Pressed = (JButton) arg0.getSource();
		String PressedStatment = (Pressed.getText());
		if ("Joke".equals(PressedStatment)) {
			playSound("JokeSay.wav");
			JOptionPane.showMessageDialog(null,
					"A Man Walks Into The Bar And Says What?");
		}
		if ("Answer".equals(PressedStatment)) {
			playSound("JokeDrums.wav");
			JOptionPane.showMessageDialog(null, "Ouch!!");

		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}
