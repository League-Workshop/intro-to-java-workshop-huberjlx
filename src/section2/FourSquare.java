package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot rockyBalboa=new Robot();


	void go() {
		rockyBalboa.setSpeed(100);
		rockyBalboa.setPenWidth(5);
		
for (int i = 0; i < 4; i++) {
	
	rockyBalboa.setPenColor(Color.blue);
	
	drawSquare();
	rockyBalboa.turn(90);
}

	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
	for (int i = 0; i < 4; i++) {
		
		rockyBalboa.move(200);
		rockyBalboa.turn(90);
		
	}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



