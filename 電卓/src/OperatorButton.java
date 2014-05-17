import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class OperatorButton extends JButton implements ActionListener {

	char operator;

	public OperatorButton(char operator) {
		super(Character.toString(operator));
		this.operator = operator;
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (operator) {
		case 'C':
			Calculator.Clear();
			break;
		case '+':
		case '-':
		case '÷':
		case '×':
			Calculator.OPE = operator;
			Calculator.TMP = ResultPanel.get().getTextAreaNum();
			ResultPanel.get().setText("0");
			return;
		case '=':
			if (Calculator.OPE != '\u0000') {
				Calculator.TMP = Calculator.getCaluResult(ResultPanel.get()
						.getTextAreaNum());
				ResultPanel.get().setText(String.valueOf(Calculator.TMP));
			}
			break;
		}
	}

}
