import java.awt.Font;

import javax.swing.JTextArea;

class ResultPanel extends JTextArea {

	public static ResultPanel RP;

	private ResultPanel() {
		super("0");
		setFont(new Font("Arial", Font.PLAIN, 30));
		setEditable(false);
	}
	
	@Override
	public void setText(String str){
		if(str.length() > 14){
			super.setText("Screen is small");
		}else{
			super.setText(str);
		}
	}
	

	public double getTextAreaNum() {
		try{
			double num = Double.parseDouble(getText());
			return num;
		}catch(NumberFormatException e){
			//演算子連打は無視する。
			return Calculator.TMP;
		}
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
