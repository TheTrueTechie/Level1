// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FortuneTeller extends JPanel implements Runnable, MouseListener {

	BufferedImage fortuneTellerImage;

	int frameWidth = 364;
	int frameHeight = 450;

	FortuneTeller() throws Exception {
		// 1. Choose an image for your fortune teller and put it in your default
		// package
		fortuneTellerImage = ImageIO.read(getClass().getResource(
				"Fortune Teller.jpg"));
		// 2. Adjust the frameWidth and frameHeight variables to fit your image
		// nicely (doesn�t need a new line of code)
		// DONE
		// 4. add a mouse listener
		addMouseListener(this);
	}

	static void begin() {
		// 3. Welcome the user. Give them a hint for the secret location.
		JOptionPane.showMessageDialog(null,
				"Hello and welcome! To the Fortune Teller. Here is your hint! It is on the body :D");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		// 5. Print the mouseX variable
		System.out.println(mouseX + "X");
		// 6. Add a comma and the mouseY variable so that you print those out
		// too (no new line)
		System.out.println(mouseY + "Y");
		// 7. Adjust your secret location co-ordinates here:
		int secretLocationX = 154;
		int secretLocationY = 184;
		/**
		 * If the mouse co-ordinates and secret location are close, we'll let
		 * them ask a question.
		 */
		if (areClose(mouseX, secretLocationX)
				&& areClose(mouseY, secretLocationY)) {
			// 8. Get the user to enter a question for the fortune teller
			JOptionPane.showInputDialog("What is your question?");
			// 9. Find a spooky sound and put it in your default package
			// (freesound.org)
			AudioClip sound = JApplet.newAudioClip(getClass().getResource("TechoDrums.wav"));
			// 10. Play the sound
			sound.play();
			// 11. Use the pause() method below to wait until your music has
			// finished
			int S = 3;
			pause(S);

			// 12. Insert your completed Magic 8 ball recipe
			// (http://bit.ly/Zdrf6d) here
			int RandomNumber = new Random().nextInt(4);; 
			// 3. Print out this variable
		System.out.print(RandomNumber);
			// 4. Get the user to enter a question for the 8 ball
		//String Question = JOptionPane.showInputDialog("Number 1 to 3. Answers will be yes or no or maybe!");
			// 5. If the random number is 0
		if (RandomNumber==0) {
			JOptionPane.showMessageDialog(null, "Yes");
		} 
			// -- tell the user "Yes"

			// 6. If the random number is 1
		if (RandomNumber==1) {
			JOptionPane.showMessageDialog(null, "No");
		} 
			// -- tell the user "No"

			// 7. If the random number is 2
		if (RandomNumber==2) {
			JOptionPane.showMessageDialog(null, "Maybe?");
		} 
			// -- tell the user "Maybe?"

			// 8. If the random number is 3
		if (RandomNumber==3) {
			JOptionPane.showMessageDialog(null, "I dont even want to say it");
		} 
			// -- write your own answer
		}

	}

	private boolean areClose(int mouseX, int secretLocationX) {
		return mouseX < secretLocationX + 15 && mouseX > secretLocationX - 15;
	}

	private void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**************** don't worry about the stuff under here *******************/

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new FortuneTeller());
		begin();
	}

	@Override
	public void run() {
		JFrame frame = new JFrame();
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	private void showAnotherImage(String imageName) {
		try {
			fortuneTellerImage = ImageIO
					.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(fortuneTellerImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
