import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class TypeMe implements KeyListener {
public static void main(String[] args) {
	TypeMe a = new TypeMe(); 
	a.startCode(); 
}

private void startCode() {
	JFrame mainFrame = new JFrame(); 
	JPanel mainPanel = new JPanel(); 
	
	mainFrame.setVisible(true);
	mainPanel.setVisible(true);
	
	mainFrame.setSize(100,100);
	mainPanel.setSize(100,100);
	
	mainFrame.add(mainPanel);
	
	mainFrame.setTitle("TypeMe");
	
	mainFrame.addKeyListener(this);
	mainPanel.addKeyListener(this);

}

@Override
public void keyPressed(KeyEvent arg0) {
	System.out.println("Ouch3");
	speak("TryMe3");
}

@Override
public void keyReleased(KeyEvent arg0) {
	System.out.println("TryMe2");
	speak("TryMe2");
}

@Override
public void keyTyped(KeyEvent arg0) {
	System.out.println("TryMe1");
	speak("TryMe1");
}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
   }

}

