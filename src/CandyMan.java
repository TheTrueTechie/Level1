import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CandyMan implements ActionListener {
	int pressedNumber = 0; 
	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel(); 
	JButton Button1 = new JButton(); 
public static void main(String[] args) {
	CandyMan a = new CandyMan();
	JOptionPane.showMessageDialog(null, "I dare you to press CandyMan 5 times!");
	a.startCode();
}

private void startCode() {
	mainFrame.setVisible(true);
	mainPanel.setVisible(true);
	Button1.setVisible(true);
	
	Button1.addActionListener(this);
	
	mainFrame.add(mainPanel);
	mainPanel.add(Button1); 
	
	mainFrame.setTitle("Candy Man");
	Button1.setText("Press Me! :D");
	
	mainFrame.pack();
}

@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton)(arg0.getSource());
	if (buttonPressed==Button1) {
		pressedNumber ++; 
		System.out.println(buttonPressed);
		System.out.println(pressedNumber);
		if (pressedNumber==5) {
			playSound("WeirdScream.wav");
			showPictureFromTheInternet("https://lh3.googleusercontent.com/-2Fruib2EXyE/AAAAAAAAAAI/AAAAAAAAABQ/214Dt8zDzhw/photo.jpg");
		}
	}
	
}
private void showPictureFromTheInternet(String imageUrl) {
	try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		JFrame frame = new JFrame();
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.pack();
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}
static final int CREEPY = 0;
static final int SCREAM = 1;

private void playSound(String fileName) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
	
}
}

