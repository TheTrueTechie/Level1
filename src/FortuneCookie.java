import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	
	
	
	public static void main(String[] args) {
		FortuneCookie Cookie = new FortuneCookie();
		Cookie.FramesPanelsButtons();
	}
	
	public void FramesPanelsButtons() {
		Panel mainPanel = new Panel();
		JFrame mainWindow = new JFrame();
		JButton Fortune = new JButton();

		mainPanel.add(Fortune);
		mainWindow.add(mainPanel);

		mainWindow.setVisible(true);

		mainWindow.setTitle("Fortune Cookie");
		Fortune.setText("Your Fortune");

		// Fortune.setSize(640, 360);
		mainWindow.setSize(1280, 720);

		Fortune.addActionListener(this);

	
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int randomNum; 
		int minimum = 1; 
		int maximum = 5; 
		randomNum = minimum + (int)(Math.random()*maximum); 
		if (randomNum==1) {
			JOptionPane.showMessageDialog(null, "This will be your lucky day");
		}
		if (randomNum==2) {
			JOptionPane.showMessageDialog(null, "You will soon get promoted in work");
		}
		if (randomNum==3) {
			JOptionPane.showMessageDialog(null, "Something random will happen to you");
		}
		if (randomNum==4) {
			JOptionPane.showMessageDialog(null, "You will find a penny if not sue me");
		}

	}
}
