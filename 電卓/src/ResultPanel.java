import java.awt.Font;

import javax.swing.JTextArea;


public class ResultPanel extends JTextArea{
	
	public static int ResultNumber;//電卓の画面に表示する値
	
	public ResultPanel(){
		super("0",1,30);
		setFont(new Font("Arial", Font.PLAIN, 60));
		setEditable(false);
	}
	
	public static void reset(){
		ResultNumber = 0;
	}
	
	
}
