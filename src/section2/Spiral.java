package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot rockyBalboa=new Robot();
		
		for (int i = 0; i < 75; i++) {
		
		rockyBalboa.penDown();
		
		rockyBalboa.setSpeed(100);
		
		rockyBalboa.turn(360/7);
		
		rockyBalboa.setPenWidth(1);
		
		rockyBalboa.move(5*i);
		
		rockyBalboa.setRandomPenColor();
		

			
		}
		
		
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		
			// 7. Change the pen color to random
		
			// 6. Move the robot 5 times the loop counter (5*i)
			
			// 2. Turn the robot 360/7 degrees to the right
		
			// 8. Set the pen width to i
			
	}
}
