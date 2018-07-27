//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot arnold = new Robot(); 
		arnold.penDown();
		arnold.setSpeed(200);
		//3. Ask the user what color they would like the robot to draw
		
		String PenColor=JOptionPane.showInputDialog("What color do you want to draw?");
		//5. Use an if/else statement to set the pen color that the user requested

	switch(PenColor) {
	case "red":
		arnold.setPenColor(Color.red);
		break;
	case "orange":
		arnold.setPenColor(Color.orange);
		break;
	case "yellow":
		arnold.setPenColor(Color.yellow);
		break;
	case "green":
		arnold.setPenColor(Color.green);
		break;
	case "blue":
		arnold.setPenColor(Color.blue);
		break;
	case "black":
		arnold.setPenColor(Color.black);
	
	}
 if(PenColor.equals("")) {
arnold.setRandomPenColor();
}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them

		//4. Set the pen width to 10
		arnold.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
        arnold.move(100);
        arnold.turn(90);
        arnold.move(100);
        arnold.turn(90);
        arnold.move(100);
        arnold.turn(90);
        arnold.move(100);
        arnold.turn(90);
	}
}
