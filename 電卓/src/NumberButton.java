import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NumberButton extends JButton implements ActionListener {
	public int number;

	public NumberButton(int number) {
		super(Integer.toString(number));
		this.number = number;
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ResultPanel RP = ResultPanel.get();
		String t = RP.getText();

		if (t.equals("0")) {
			RP.ResultNumber = number;
			RP.setText(String.valueOf(number));
		} else {
			int tmp = RP.ResultNumber;
			String next = Integer.toString(tmp) + Long.toString(number);
			RP.ResultNumber = Integer.valueOf(next);
			RP.setText(String.valueOf(Long.parseLong(next)));
		}
	}

}
