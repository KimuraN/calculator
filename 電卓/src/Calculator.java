import java.awt.Dimension;

import javax.swing.JFrame;

public class Calculator {

	JFrame frame;

	public static void main(String args[]) {
		Calculator cal = new Calculator();
		cal.frame = new JFrame("calculator");
		cal.frame.setSize(new Dimension(640, 480));
		cal.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cal.frame.setVisible(true);
	}

}
