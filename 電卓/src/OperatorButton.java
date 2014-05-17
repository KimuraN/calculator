import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class OperatorButton extends JButton implements ActionListener {

	String operator;

	public OperatorButton(String operator) {
		super(operator);
		this.operator = operator;
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ResultPanel RP = ResultPanel.get();
		switch (operator) {
		case "C":
			Calculator.Clear();
			break;
		case "+":
		case "-":
		case "÷":
		case "×":
			Calculator.OPE = operator;
			Calculator.TMP = RP.getTextAreaNum();
			ResultPanel.get().setText(operator);
			return;
		case "=":
			Calculator.doCalu();
			break;
		}
	}

}
