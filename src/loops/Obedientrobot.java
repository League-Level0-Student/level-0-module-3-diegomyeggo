package loops;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class Obedientrobot {
	public static void main(String[] args) {

String Shape = JOptionPane.showInputDialog("What shape and color do you want? Triangle,Square or Cirle in Red, Green or Blue?");{

	

if (Shape.equals("Red Triangle")) {
	

Robot rob = new Robot();
	rob.penDown();
	rob.setPenColor(300, 0, 0);
	rob.setSpeed(100);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.turn(120);
}		
}
if (Shape.equals("Green Triangle")) {
	

Robot rob = new Robot();
	rob.penDown();
	rob.setPenColor(0, 300, 0);
	rob.setSpeed(100);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.turn(120);
}		
if (Shape.equals("Blue Triangle")) {
	

Robot rob = new Robot();
	rob.penDown();
	rob.setPenColor(0, 0, 300);
	rob.setSpeed(100);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.turn(120);
}		
		
	



if (Shape.equals("Red Square")) {

	Robot rob = new Robot();
	rob.penDown();
	rob.setPenColor(300, 0, 0);
	rob.setSpeed(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	
}
if (Shape.equals("Green Square")) {

	Robot rob = new Robot();
	rob.penDown();
	rob.setPenColor(0, 300, 0);
	rob.setSpeed(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	
}
if (Shape.equals("Blue Square")) {

	Robot rob = new Robot();
	rob.penDown();
	rob.setPenColor(0, 0, 300);
	rob.setSpeed(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	
}

	



if (Shape.equals("Red Circle")) {
		Robot rob = new Robot();
		for(int i=0; i< 36;i++) {
			rob.penDown();
			rob.setPenColor(300, 0, 0);
			rob.setSpeed(10);
			rob.move(10);
			rob.turn(11);
		}
	
	}
	if (Shape.equals("Green Circle")) {
		Robot rob = new Robot();
		for(int i=0; i< 36;i++) {
			rob.penDown();
			rob.setPenColor(0, 300, 0);
			rob.setSpeed(10);
			rob.move(10);
			rob.turn(11);
		}
	
	}
	if (Shape.equals("Blue Circle")) {
		Robot rob = new Robot();
		for(int i=0; i< 36;i++) {
			rob.penDown();
			rob.setPenColor(0, 0, 300);
			rob.setSpeed(10);
			rob.move(10);
			rob.turn(11);
		}
	
	}
	}
}
	
	
