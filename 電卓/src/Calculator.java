import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Calculator {

	JFrame frame;
	ResultPanel RP;
	NumberPanel NP;
	OperatorPanel OP;

	public Calculator() {
		frame = new JFrame("電卓");
		frame.setSize(new Dimension(640, 480));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Calculator cal = new Calculator();

		cal.RP = new ResultPanel();
		cal.frame.add(cal.RP, BorderLayout.NORTH);

		cal.OP = new OperatorPanel();
		cal.frame.add(cal.OP, BorderLayout.CENTER);

		cal.NP = new NumberPanel();
		cal.frame.add(cal.NP, BorderLayout.SOUTH);

		cal.frame.setVisible(true);
	}

}
