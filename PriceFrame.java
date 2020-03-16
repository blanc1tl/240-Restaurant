import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class PriceFrame extends JFrame{
	
	// set up JTextArea
	JTextArea orderCost = new JTextArea();
	
	/**
	 * Initiate the view of the PriceFrame
	 * @param title The title of the java frame
	 */
	public PriceFrame(String title) {
		// set title of the frame
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set size of the frame
		setSize(355, 325);
		// make layout be a borderLayOut
		setLayout(new BorderLayout());

		// sets the font size, style, and make it bold for the text area
		orderCost.setFont(new Font("TimesRoman", Font.BOLD, 24));
		// make the text black
		orderCost.setForeground(Color.BLACK);
		// make the text area be blank at the start
		orderCost.setText("");
		// A text filed is added at the 'west' of the frame
		// to displaying the choices for the question.
		add(orderCost, BorderLayout.WEST);
	}

}
