import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Calculator {

	JFrame frame;
	ResultPanel RP;
	NumberPanel NP;
	OperatorPanel OP;

	public static double TMP = 0;// 計算時に一時的に値を格納
	public static String OPE = null;// 演算子を格納

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
		OPE = null;
	}

	// 覚えていた値と画面上の値を計算し更新
	public static void doCalu() {
		ResultPanel RP = ResultPanel.get();
		// 画面上の値
		double panelNum = RP.getTextAreaNum();

		switch (Calculator.OPE) {
		case "+":
			Calculator.TMP = Calculator.TMP + panelNum;
			break;
		case "-":
			Calculator.TMP = Calculator.TMP - panelNum;
			break;
		case "÷":
			Calculator.TMP = Calculator.TMP / panelNum;
			break;
		case "×":
			Calculator.TMP = Calculator.TMP * panelNum;
			break;
		}
		RP.setText(Double.toString(Calculator.TMP));
		Calculator.OPE = null;
	}
}
