import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TypingTutor implements KeyListener {
	//TypingTutor TT = new TypingTutor(); 
	int keyCount = 0; 
	char currentLetter = 'a';
	static JFrame mainFrame = new JFrame();
	static JPanel mainPanel = new JPanel();
	static JLabel Label1 = new JLabel();

	public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "Type a To Start");
		new TypingTutor().Start();

	}

	public void Start() {
		mainFrame.setVisible(true);
		mainPanel.setVisible(true);
		Label1.setVisible(true);

		mainFrame.add(mainPanel);
		mainPanel.add(Label1);

		mainFrame.setTitle("Type or Die");
		mainFrame.setSize(150, 150);

		mainFrame.addKeyListener(this);

		Label1.setFont(Label1.getFont().deriveFont(28.0f));
		Label1.setHorizontalAlignment(JLabel.CENTER);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		char keyTyped = arg0.getKeyChar();
		System.out.println("You Typed " + keyTyped);
		keyCount++;  
		if (keyCount > 10) {
			showTypingSpeed(keyCount); 
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		currentLetter = generateRandomLetter();
		Label1.setText("" + currentLetter);

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		char keyTyped = arg0.getKeyChar();
		String StringFix = "" + keyTyped;
		
		if (StringFix.equals("" + currentLetter)) {
			mainFrame.setBackground(Color.green);
			playSound("Right.wav");
		} 
		else {
			mainFrame.setBackground(Color.red);
			playSound("Wrong.wav");
		}

	}
	
	
	//Date timeAtStart = new Date();
	public void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
		
	}

	Date timeAtStart = new Date();
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}

}
