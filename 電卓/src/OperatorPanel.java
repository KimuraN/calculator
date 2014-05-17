import javax.swing.JPanel;

public class OperatorPanel extends JPanel {

	OperatorButton[] operatorButtons = new OperatorButton[6];

	public OperatorPanel() {
		initOperatorButtons();
		for (int i = 0; i < operatorButtons.length; i++) {
			add(operatorButtons[i]);
		}
	}

	private void initOperatorButtons() {
		String tmp[] = { "+", "-", "×", "÷", "=", "C" };
		for (int i = 0; i < operatorButtons.length; i++) {
			operatorButtons[i] = new OperatorButton(tmp[i]);
		}
	}

	public static boolean isOperatorString(String str) {
		switch (str) {
		case "+":
		case "-":
		case "÷":
		case "×":
			return true;
		}
		return false;
	}

}
