// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

    JLabel drumImage;

    public static void main(String[] args) throws Exception {
   	 new DrumKit().getGoing();
    }

    private void getGoing() throws MalformedURLException {
   	 // 1. Make a JFrame variable and initialize it using "new JFrame()"
   	 JFrame Frame = new JFrame();
   	 
   	 // 2. Make the frame visible
   	 Frame.setVisible(true);
   	 // 3. Set the size of the frame
   	 Frame.setSize(200, 200);
   	 // 4. Set the title of the frame
   	 	Frame.setTitle("DrumKit");
   	 // 5. Make a JPanel and initialize it.
   	 JPanel Panel = new JPanel();
   	 // 6. Add the panel to the frame. (The panel is invisible.)
    Frame.add(Panel);
   	 // 7. Download an image of a drum from the Internet. Drop it into your Eclipse project under "default package".
   	 // 8. Put the name of your image in a String variable.
    String DrumPic = "DrumPic.jpg";
   	 // 9. Use the "createImage()" method to initialize the drumImage variable.
   	Component Drum = createImage(DrumPic);
   	 // 10. Add the image to the panel
    Panel.add(Drum);
   	 // 11. Set the layout of the panel to "new GridLayout()"
    Panel.setLayout(new GridLayout());
   	 // 12. call the pack() method on the frame
   	 Frame.pack();
   	 // 13. add a mouse listener to your drumImage.
Frame.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
   	 //4. When the mouse is clicked, print "mouse clicked"

   	 JLabel drumClicked = (JLabel) e.getSource();
   	 // 15. Download a drum sound from freesound.org and drop it into your "default package"
   	 // 16. If they clicked on the drumImage...

   		 // 17. ...use the playSound method to play a drum sound.
playSound("DrumSound.wav");
   	 // 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.
    }

    private JLabel createImage(String fileName) throws MalformedURLException {
   	 URL imageURL = getClass().getResource(fileName);
   	 Icon icon = new ImageIcon(imageURL);
   	 JLabel imageLabel = new JLabel(icon);
   	 return imageLabel;
    }

    private void playSound(String fileName) {
   	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
   	 sound.play();
    }

}



