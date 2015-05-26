import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel();
	JButton Button1 = new JButton();
	JButton Button2 = new JButton();
	JButton Button3 = new JButton();
	JButton Button4 = new JButton();
	JButton Button5 = new JButton();
	JButton Button6 = new JButton();
	JButton Button7 = new JButton();
	JButton Button8 = new JButton();
	JButton Button9 = new JButton();
	JButton Button10 = new JButton();
	JButton Button11 = new JButton();
	JButton Button12 = new JButton();

	public static void main(String[] args) {
		WhackAMole a = new WhackAMole();
		a.startCode();
	}

	public void startCode() {
		mainFrame.setTitle("Whack Me!");
		mainFrame.add(mainPanel);
		mainPanel.add(Button1);
		mainPanel.add(Button2);
		mainPanel.add(Button3);
		//mainPanel.add(Button4);
		//mainPanel.add(Button5);
		//mainPanel.add(Button6);
		//mainPanel.add(Button7);
		//mainPanel.add(Button8);
		//mainPanel.add(Button9);
		//mainPanel.add(Button10);
		//mainPanel.add(Button11);
		//mainPanel.add(Button12);

		Button1.addActionListener(this);
		Button2.addActionListener(this);
		Button3.addActionListener(this);
		
		mainFrame.setVisible(true);
		mainPanel.setVisible(true);

		mainFrame.setSize(150,150);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		double a = 4*Math.random();
		int b = (int) a;
		JButton buttonPressed = (JButton) (arg0.getSource());
		if (b==1) {
			Button1.setText("Mole");
			//Button1.setBackground(Color.green);
			Button2.setText("");
			Button3.setText("");
			playSound("Beep.wav");
		}
		else if (b==0) {
			Button2.setText("Mole");
			//Button2.setBackground(Color.green);
			Button1.setText("");
			Button3.setText("");
			playSound("Beep.wav");
		}
		
		else if (b==2) {
			Button2.setText("Mole");
			//Button2.setBackground(Color.green);
			Button1.setText("");
			Button3.setText("");
			playSound("Beep.wav");
		}
		else if (b==3) {
			Button3.setText("Mole");
			//Button3.setBackground(Color.green);
			Button1.setText("");
			Button2.setText("");
			playSound("Beep.wav");
		}
		else {
			Button1.setText("");
			Button2.setText("");
			Button3.setText("");
		}
	}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
		
	}
}
