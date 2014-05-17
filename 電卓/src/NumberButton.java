import javax.swing.JButton;


public class NumberButton extends JButton{
	public int number;
	
	public NumberButton(int number){
		super(Integer.toString(number));
		this.number = number;
	}
	
}
