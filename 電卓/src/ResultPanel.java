import java.awt.Font;

import javax.swing.JTextArea;

class ResultPanel extends JTextArea {

	public static ResultPanel RP;

	private ResultPanel() {
		super("0", 1, 30);
		setFont(new Font("Arial", Font.PLAIN, 60));
		setEditable(false);
	}

	public double getTextAreaNum() {
		return Double.parseDouble(getText());
	}

	public static ResultPanel get() {
		if (ResultPanel.RP == null) {
			ResultPanel.RP = new ResultPanel();
			return RP;
		} else {
			return RP;
		}
	}

}
