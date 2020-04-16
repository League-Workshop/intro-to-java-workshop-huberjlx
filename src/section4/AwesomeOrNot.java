package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {
	

	public static void main(String[] args) {
		
		
		Random factory=new Random();
		int randomNumber=factory.nextInt(4);
		
		String awesomeAnswer=JOptionPane.showInputDialog(null, "What is something you think is awesome?");
		
		if (randomNumber==0) {
			
			JOptionPane.showMessageDialog(null, awesomeAnswer+" is awesome!");
		}
		
		if (randomNumber==1) {
			
			JOptionPane.showMessageDialog(null, awesomeAnswer+" is ok.");
		}
		
		if (randomNumber==2) {
			
			JOptionPane.showMessageDialog(null, awesomeAnswer+" is boring.");
		}
		
		if (randomNumber==3) {
			
			JOptionPane.showMessageDialog(null, awesomeAnswer+" is a piece of ****");
		}
		
}
}

	// 1. Make a main method that includes all the steps below…

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome

	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.


	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer




