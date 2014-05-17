import java.awt.FlowLayout;

import javax.swing.JPanel;

public class NumberPanel extends JPanel {

	NumberButton numButtons[] = new NumberButton[10];

	public NumberPanel() {
		initNumberButtons();
		for (int i = 0; i < 10; i++) {
			add(numButtons[i]);
		}
	}

	private void initNumberButtons() {
		for (int i = 0; i < 10; i++) {
			numButtons[i] = new NumberButton(i, Integer.toString(i));
		}
	}

}
