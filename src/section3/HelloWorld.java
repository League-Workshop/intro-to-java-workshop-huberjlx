package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	System.out.println("Hello World");
	JOptionPane.showMessageDialog(null, "  Hello World  ");
	String name=JOptionPane.showInputDialog("What Is Your Name");
	JOptionPane.showMessageDialog(null, " Hello " + name);
}
}
