import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NumberButton extends JButton implements ActionListener {
	public int number;
	public String numStr;

	public NumberButton(int number, String s) {
		super(s);
		this.number = number;
		numStr = s;
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ResultPanel RP = ResultPanel.get();
		String panelStr = RP.getText();

		if (panelStr.equals("0")) {
			RP.setText(String.valueOf(number));
		} else if (OperatorPanel.isOperatorString(panelStr)) {
			RP.setText(String.valueOf(number));
		} else {
			String tmp = RP.getText() + numStr;
			if (tmp.length() < 14) {
				RP.setText(tmp);
			}
		}
	}

}
