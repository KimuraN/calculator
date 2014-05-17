import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Calculator {

	JFrame frame;
	ResultPanel RP;
	NumberPanel NP;
	OperatorPanel OP;

	public static double TMP = 0;
	public static char OPE = '\u0000';

	public Calculator() {
		RP = ResultPanel.get();
		frame = new JFrame("電卓");
		frame.setSize(new Dimension(640, 480));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Calculator cal = new Calculator();

		cal.frame.add(cal.RP, BorderLayout.NORTH);

		cal.OP = new OperatorPanel();
		cal.frame.add(cal.OP, BorderLayout.CENTER);

		cal.NP = new NumberPanel();
		cal.frame.add(cal.NP, BorderLayout.SOUTH);

		cal.frame.setVisible(true);
	}

	public static void Clear() {
		ResultPanel.get().setText("0");
		TMP = 0;
		OPE = '\u0000';
	}

	public static double getCaluResult(double num) {
		double result = 0.0;
		switch (Calculator.OPE) {
		case '+':
			result = Calculator.TMP + num;
			break;
		case '-':
			result = Calculator.TMP - num;
			break;
		case '÷':
			result = Calculator.TMP / num;
			break;
		case '×':
			result = Calculator.TMP * num;
			break;
		}
		Calculator.OPE = '\u0000';
		return result;
	}
}
