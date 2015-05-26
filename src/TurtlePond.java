/****** MUST BE USED WITH JAVA 1.6 *****/

import java.awt.Color;
import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class TurtlePond implements KeyEventDispatcher {

	// 1. Set a location for the food
	int cookieX = 100;
	int cookieY = 200;

	// 2. Choose the speed you want the Tortoise to go at
	int speed = 10;
	
	void setup() {
		// 3. Add an intro message to tell the user what to do
JOptionPane.showMessageDialog(null, "Use the arrow keys to move the player to reach the food");
		// 4. For debugging purposes, show the food
	showFood();
	}

	private void goUp() {
		Tortoise.move(speed);
	}

	private void goDown() {
		Tortoise.move(-speed);
	}

	private void goLeft() {
		// 5. make the tortoise move left (3 lines of code)
		Tortoise.turn(90);
	}

	private void goRight() {
		
		// 6. make the tortoise move right
		Tortoise.turn(270);
	}

	private void checkForFood() throws Exception {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 7. If the Tortoise is within 100 pixels of the food, set the background color to yellow
		if (tortoiseLocationX>cookieX-100) {
			if (tortoiseLocationX<cookieX+100) {
				//setBackgroundColor(Color.yellow);
				if (tortoiseLocationY>cookieY-100) {
					if (tortoiseLocationY<cookieY+100) {
						setBackgroundColor(Color.yellow);
					}
				}
			}
		}
			


		// 8. If the Tortoise is within 50 pixels of the food, set the background color to orange
		if (tortoiseLocationX>cookieX-50) {
			if (tortoiseLocationX<cookieX+50) {
				//setBackgroundColor(Color.orange);
				if (tortoiseLocationY>cookieY-50) {
					if (tortoiseLocationY<cookieY+50) {
						setBackgroundColor(Color.orange);
					}
				}
			}
			
		}
		
		// 9. If the Tortoise is within 20 pixels of the food, set the background color to red
		if (tortoiseLocationX>cookieX-20) {
			if (tortoiseLocationX<cookieX+20) {
				//setBackgroundColor(Color.red);
				if (tortoiseLocationY>cookieY-20) {
					if (tortoiseLocationY<cookieY+20) {
						setBackgroundColor(Color.red);
					}
				}
			}
		}
		
		// 10. If tortoise is within 5 pixels of the cookie, make a pop-up to tell them they found it
		if (tortoiseLocationX>cookieX-5) {
			if (tortoiseLocationX<cookieX+5) {
				//JOptionPane.showMessageDialog(null, "You have found the cookie!");
				if (tortoiseLocationY>cookieY-5) {
					if (tortoiseLocationY<cookieY+5) {
						JOptionPane.showMessageDialog(null, "You have found the cookie!");

					}
				}
			}
		}
	
		// 11. If the Tortoise crosses it's own path, move them back to the beginning
		if (wasHereBefore(cookieX, cookieY)) {
		JOptionPane.showMessageDialog(null, "FAIL: Crossed lines");	
		}
		// 12. If more than 20 seconds have elapsed, tell them the turtle died of hunger
		//getTimeElapsed(20);
	}
	
	private long getTimeElapsed() {
		 Date currentTime = new Date();
		 return (currentTime.getTime() - startTime.getTime())/1000;
	}

	void setBackgroundColor(Color color) {
		Tortoise.getBackgroundWindow().setBackground(color);
	}

	private void hideFood() {
		window.remove(component);
	}

	private void showFood() {
		// If the food doesn't show up, make sure you are on Java 1.6
		component.setLocation(cookieX, cookieY);
		window.add(component);
	}

	private boolean wasHereBefore(int xPosition, int yPosition) {
		if (previousLocations.contains(new Point(xPosition, yPosition)))
			return true;
		else
			return false;
	}

	/*********************** don't worry about the stuff under here ******************/

	TurtlePanel window = Tortoise.getBackgroundWindow();
	Label component = new Label("*");
	Date startTime = new Date();

	public static void main(String[] args) {
		TurtlePond feeder = new TurtlePond();
		feeder.controlTheTortoise();
		feeder.setup();
	}

	private void controlTheTortoise() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setPenColor(Colors.Purples.DarkMagenta);
		Tortoise.getBackgroundWindow().setBackground(Colors.Grays.SlateGray);
		Tortoise.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {

			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();

			try {
				checkForFood();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			savePosition(Tortoise.getX(), Tortoise.getY());
		}
		return false;
	}

	ArrayList<Point> previousLocations = new ArrayList<Point>();

	private void savePosition(int xPosition, int yPosition) {
		previousLocations.add(new Point(xPosition, yPosition));
	}
}

