package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		int score=0;
				
		String videoGameAnswer1=JOptionPane.showInputDialog(null, "What is the most wathed video game?");
		if (videoGameAnswer1.equalsIgnoreCase("League of Legends")) {
		
			score = score + 1;
		}
		
		String videoGameAnswer2=JOptionPane.showInputDialog(null, "What position in League of Legends is made \n"+
		"primarily from tanks?");
		if (videoGameAnswer2.equalsIgnoreCase("Top")) {
			
			score = score + 1;
		}
		
		String videoGameAnswer3=JOptionPane.showInputDialog(null, "What position does Millan play?");
		if (videoGameAnswer3.equalsIgnoreCase("adc") | videoGameAnswer3.equalsIgnoreCase("Bot")) {
			
			score=score+1;
		}
	
		String videoGameAnswer4=JOptionPane.showInputDialog(null, " What is the name of the tower, inside both teams' bases \n "+
		"that you want to destroy?");
		if (videoGameAnswer4.equalsIgnoreCase("Nexus") | videoGameAnswer4.equalsIgnoreCase("Nexus tower")) {
			
			score=score+1;
		}
		
		String videoGameAnswer5=JOptionPane.showInputDialog(null, "What is the main position Pyke plays?");
		if (videoGameAnswer5.equalsIgnoreCase("sup") | videoGameAnswer5.equalsIgnoreCase("Support")) {
			
			score=score+1;
		}
		
		JOptionPane.showMessageDialog(null, "You got a score of " +score+"!");
		// 1.  Create a variable to hold the user's score 
		
		// 2.  Ask the user a question 
		
		// 3.  Use an if statement to check if their answer is correct
		
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
