import java.awt.im.InputContext;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;


public class Houses {
public static void main(String[] args) {
	Spawn();
	Building("Large");
	Building("Small");
	Building("Large");
	Building("Small");
	Building("Large");
	Building("Small");
}
private static void Building(String Input) {
	if (Input.equals("Large")) {
		Large();
}
if (Input.equals("Small")) {
	Small();
}
}

private static void Spawn() {
	
	Tortoise.setSpeed(10);
	Tortoise.show();
	Tortoise.setX(20);
	//Tortoise.move(1);
	Tortoise.setY(425);
	//Tortoise.move(1);
}

private static void Large() {
	Tortoise.move(250);
	Tortoise.turn(90);
	Tortoise.move(50);
	Tortoise.turn(90);
	Tortoise.move(250);
	Tortoise.turn(-90);
	Tortoise.move(50);
	Tortoise.turn(-90);
	Tortoise.setSpeed(10);
}

private static void Small() {
	Tortoise.move(150);
	Tortoise.turn(90);
	Tortoise.move(50);
	Tortoise.turn(90);
	Tortoise.move(150);
	Tortoise.turn(-90);
	Tortoise.move(50);
	Tortoise.turn(-90);
	Tortoise.setSpeed(10);
}


	

}





