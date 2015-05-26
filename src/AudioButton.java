import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

import javazoom.jl.decoder.JavaLayerException;

public class AudioButton extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException, JavaLayerException {
		new AudioButton().setVisible(true);
	}
	
	private AudioButton() {
		//1. Set the size of the window
	 setSize(500, 500);
		//2. Set the title of the window using super(“title”);
		super.setTitle("Sounds");
		//3. Set the layout to FlowLayout()
		setLayout(new FlowLayout());
		//4. Define a JButton called “button1”
		JButton button1 = new JButton("SnareDrums");
		JButton button2 = new JButton("HardClubDrums");
		JButton button3 = new JButton("TechoDrums");
		JButton button4 = new JButton("TF2Sound");		
		JButton button5 = new JButton("TF2Sound2");		
		//JButton button1 = new JButton("button1");
		//5. Add button1 to AudioButton
		setLayout(new BorderLayout());
		setLayout(new GridLayout(2,3));
	add(button1, BorderLayout.WEST);
	add(button2, BorderLayout.SOUTH);
	add(button3, BorderLayout.CENTER);
	add(button4, BorderLayout.EAST);
	add(button5, BorderLayout.NORTH);
		//6. add ActionListner() to button1
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button5.addActionListener(this);		
		//////////////////////////////////////////////////////

		//11. add 4 more buttons that play 4 more sounds
		
		//13. Change FlowLayout() to BorderLayout

		//14. Where you added the buttons to AudioButton, add a second argument “BorderLayout.WEST”
		
		//15. Change the rest of the Border layouts for each button to EAST, NORTH, SOUTH, and CENTER
		
		//16. Change the button names to reflect the sound name

		
		
		//setResizable(false);  //resize bars
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		String SnareDrum = "SnareDrum.wav";
		String HardClubDrums = "HardClubDrums.wav";
		String TechoDrums = "TechoDrums.wav";
		String TF2Sound = "TF2Sound.wav";
		String TF2Sound2 = "TF2Sound2.wav";
		//7. Edit if-statement to look for “button1”
		if(name.equals("SnareDrums")) {
			//8. Print to screen “button 1 clicked” 
			System.out.println("button 1 clicked");
			//9. Download a short sound from freesound.org and drop it into your "default package"
			playSound(SnareDrum);
			//10. play the sound using the method below			
		}
		else if (name.equals("HardClubDrums")){
			System.out.println("button 2 clicked");
			playSound(HardClubDrums);

		}
		else if (name.equals("TechoDrums")) {
			System.out.println("button 3 clicked");
			playSound(TechoDrums);
		
		}
	else if (name.equals("TF2Sound")){
		System.out.println("button 4 clicked");
		playSound(TF2Sound);
	}
	
	else if ((name.equals("TF2Sound2"))){
		System.out.println("button 5 clicked");
		playSound(TF2Sound2);
	}
	}
		//12. Use else if to listen for the other 4 buttons
		
    private void playSound(String fileName) {
      	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
      	 sound.play();
	}
}




