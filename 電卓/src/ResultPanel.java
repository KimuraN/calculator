import java.awt.Font;

import javax.swing.JTextArea;

public class ResultPanel extends JTextArea {

	public static int ResultNumber;// 電卓の画面に表示する値
	public static ResultPanel RP;

	private ResultPanel() {
		super("0", 1, 30);
		setFont(new Font("Arial", Font.PLAIN, 60));
		setEditable(false);
	}

	public void reset() {
		ResultNumber = 0;
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
