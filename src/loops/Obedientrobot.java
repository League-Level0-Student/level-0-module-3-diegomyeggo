package loops;
import org.jointheleague.graphical.robot.Robot;
public class Obedientrobot {
	public static void main(String[] args) {


		//public static void drawSquare() {
		Robot rob = new Robot();
	rob.penDown();
	rob.setRandomPenColor();
	rob.setSpeed(100);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.turn(120);
		}
	

public static void drawSquare(); {
	Robot rob = new Robot();
	rob.penDown();
	rob.setRandomPenColor();
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
}

