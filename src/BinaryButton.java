import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BinaryButton implements ActionListener {
	
	public static void main(String[] args) {
		new BinaryButton().createUI();
	}
	double maximum = 15;
	int randomNum = (int)(Math.random()*maximum); 
	int Number; 
	int Flag1 = 0;
	int Flag2 = 0;
	int Flag4 = 0;
	int Flag8 = 0;
	JButton One = new JButton();
	JButton Two = new JButton();
	JButton Four = new JButton();
	JButton Eight = new JButton();
	JButton Check = new JButton();
	JButton Random = new JButton();
	
	
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(200,200);
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
	
		// 1. Add the panel to the frame
frame.add(panel);
		// 2. Make the frame visible
frame.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
One.setText("1");
Two.setText("2");
		// 4. Set the text of the rightButton to "Click me!"
Four.setText("4");
Eight.setText("8");
Check.setText("Check");
Random.setText(String.valueOf(randomNum));
		// 5. Add an action listener to the leftButton
One.addActionListener(this);
Two.addActionListener(this);

		// 6. Add an action listener to the rightButton
Four.addActionListener(this);
Eight.addActionListener(this);
Check.addActionListener(this);
Random.addActionListener(this);

		// 7. Add the leftButton to the panel
panel.add(One);
panel.add(Two);
		// 8. Add the rightButton to the panel
panel.add(Four);
panel.add(Eight);
panel.add(Check);
panel.add(Random);
		// 9. Pack the frame
Random.setPreferredSize(BIG);
frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
frame.setTitle("Binary Blast!");

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if (buttonPressed == One) {
			Number = Number + 1; 
			Flag1 = 1;
		}
		
		
		if (buttonPressed == Two) {
			Number = Number + 2; 
			Flag2 = 2;
		}
		if (buttonPressed == Four) {
			Number = Number + 4; 
			Flag4 = 4;
		}
		if (buttonPressed == Eight) {
			Number = Number + 8; 
			Flag8 = 8;
		}
		if (buttonPressed == Check) {
			Number = Flag1 + Flag2 + Flag4 + Flag8;
			if (Number==randomNum) {
				JOptionPane.showMessageDialog(null, "Correct!!!");
				Flag1 = 0;
				Flag2 = 0;
				Flag4 = 0;
				Flag8 = 0;
				 maximum = 15;
				 randomNum = (int)(Math.random()*maximum ); 
				 Random.setText(String.valueOf(randomNum));
			}
			else {
				JOptionPane.showMessageDialog(null, "Wrong!!");
				System.exit(0);
			}
		}
		Number = Flag1 + Flag2 + Flag4 + Flag8;
		System.out.println(Number);
		/* If the buttonPressed was the leftButton....*/
			// Set the text of the rightButton to "No, click Me!"
			// Set the preferred size of the rightButton to BIG
			// Set the text of the leftButton to "Click Me!"
			// Set the preferred size of the leftButton to SMALL
		
		
		/* If the buttonPressed was the rightButton, do the opposite. */
		

		frame.pack();
	}
}

