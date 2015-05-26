// Copyright Wintriss Technical Schools 2013 
import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class FeedTheTortoise2Player implements KeyEventDispatcher
{

	// 1. Decide where to put the food by setting these variables
	int foodLocationX = 100;
	int foodLocationY = 200;

	// 2. Choose a character for your food or leave it as *
	Component food = new Label("Food");

	private void goUp()
	{
Tortoise.move(10);
}

	private void goDown()
	{
		Tortoise.turn(180);
		Tortoise.move(10);
	}

	private void goLeft()
	{
		Tortoise.turn(270);
		Tortoise.move(10);
	}

	private void goRight()
	{
		Tortoise.turn(270);
		Tortoise.move(10);
	}

	private void checkIfFoodFound() throws Exception
	{
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 7. if tortoise is near the food
			// say something. Hint: Runtime.getRuntime().exec("say chomp")
		if (tortoiseLocationX<foodLocationX+20) {
			//Runtime.getRuntime().exec("say Target is nearby!");
			if (tortoiseLocationY<foodLocationY+20) {
				if (tortoiseLocationX>foodLocationX-20) {
					if (tortoiseLocationY>foodLocationY-20) {
						Runtime.getRuntime().exec("say Target is located!");
					}
				}
			}
		}
	}

	public boolean dispatchKeyEvent(KeyEvent e)
	{
		if (e.getID() == KeyEvent.KEY_PRESSED)
		{
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();

			//Hint: "e.getKeyCode() == KeyEvent.VK_T" is TRUE when T is pressed
			// 8. if the W key is pressed,
				// call the method moveFoodUp();
			
			//11. Do the same for left, right, and down. You can choose your own keys if you like. You will need to make new methods for moving the food.
			
			//12. If the secret key is pressed
				// Call the method moveFoodToARandomLocation
			
		}
		return processEvent();
	}

	private void moveFoodUp()
	{
		System.out.println("Move food up!");
		//9. decrement foodLocationY 

		//10. call the moveFood() method

	}
	
	private void moveFoodToARandomLocation()
	{
		foodLocationX = new Random().nextInt(window.getSize().width);
		foodLocationY = new Random().nextInt(window.getSize().height);
		moveFood();
	}

	private void moveFood()
	{
		food.setLocation(foodLocationX, foodLocationY);
		window.add(food);
	}

	TurtlePanel window = Tortoise.getBackgroundWindow();

	public static void main(String[] args)
	{
		FeedTheTortoise2Player feeder = new FeedTheTortoise2Player();
		feeder.controlTheTortoise();
		feeder.feedTheTortoise();
	}

	private void controlTheTortoise()
	{
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
//Tortoise.getBackgroundWindow().setBackground(Colors.getRandomColor());

	}

	private void feedTheTortoise()
	{
		moveFood();
	}
	
	private boolean processEvent()
	{
		try
		{
			checkIfFoodFound();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}


