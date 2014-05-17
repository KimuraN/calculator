import javax.swing.JButton;


public class OperatorButton extends JButton{
	
	char operator;
	
	public OperatorButton(char operator){
		super(Character.toString(operator));
		this.operator = operator;
	}

}
