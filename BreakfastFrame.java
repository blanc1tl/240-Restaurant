import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BreakfastFrame extends JFrame {

	// sets up JButton
	private JButton[] buttons;
	
	// set up radio buttons
	JRadioButton[] radioButtons;

	// set up the labels for the buttons
	private String[] buttonLabels =
		{ "Order", "Cancel Order"};

	// set up the methods for the buttons
	private String[] methods = 
		{"Order", "Clear"};
	
	// set up the number of buttons
	final int buttonNumber = buttonLabels.length;
	
	// set up JTextField to display prices
	JTextArea breakfastField = new JTextArea();
	
	// set up JTextField to display message
	JTextField helloField = new JTextField();

	// set up the HasMap
	Map<String,String> labelMethods = new HashMap<String,String>(2);

	/**
	 * Initiate the view of the BreakfastFrame
	 * @param title The title of the java frame
	 */
	public BreakfastFrame(String title) {
		// set title of the frame
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set size of the frame
		setSize(500, 325);
		// make layout be a borderLayOut
		setLayout(new BorderLayout());
		
		// make JPanel for buttons
		JPanel p = new JPanel();
		p.setLayout( new FlowLayout() );
		buttons = new JButton[buttonNumber];
		for (int i = 0; i < buttons.length; i++) {  
			//set up button label
			buttons[i] = new JButton(buttonLabels[i]);
			// set up the font size, make it bold, and style
			buttons[i].setFont(new Font("TimesRoman", Font.BOLD, 24));
			// make the color of the words be blue
			buttons[i].setForeground(Color.BLACK);
			// add button
			p.add(buttons[i]);
			// add the buttons to the HasMap
			labelMethods.put(buttonLabels[i], methods[i]);
		}

		// set locations of the buttons and choices at 
		// the 'south' part of the JFrame
		add(p, BorderLayout.SOUTH);

		// make panel were buttons are
		JPanel panel = new JPanel(new GridLayout(0,1));
		// make button
		ButtonGroup group = new ButtonGroup();
		// make buttons and label them
		String[] labels = {"Eggs", "Bacon", "Toast", "Waffles", "Pancakes"}; //label that prints message when button is pressed
		int len = labels.length;
		radioButtons = new JRadioButton[len];
		// set a radio button to a label
		for (int i = 0; i < len; i++) {
			radioButtons[i] = new JRadioButton(labels[i]);
			// set them to group
			group.add(radioButtons[i]);
			panel.add(radioButtons[i]);
		}
		// put radioButtons at the 'west' part of frame
		add(panel, BorderLayout.WEST);
		// set the font, word size, and writing style of the words in breakfastField
		breakfastField.setFont(new Font("TimesRoman", Font.BOLD, 16));
		// set color of the letter in the area field
		breakfastField.setForeground(Color.BLUE);
		// display the price of the food
		breakfastField.setText(" Eggs cost $4.00\n\n Bacon cost $2.00\n\n"
				+ " Toast cost $5.00\n\n Waffels cost $6.00\n\n Pancakes cost $6.00");
		// put the area field at the center part of frame
		add(breakfastField, BorderLayout.CENTER);
		
		// set the font, word size, and writing style of the words in helloField
		helloField.setFont(new Font("TimesRoman", Font.BOLD, 24));
		// set color of the letter in helloField
		helloField.setForeground(Color.RED);
		// display message to user
		helloField.setText("Hello, please place your order");
		// put helloField at the 'north' part of frame
		add(helloField, BorderLayout.NORTH);
	}
	/**
	 * Get the radio buttons
	 */
	public JRadioButton[] getRadioButtons() {
		return radioButtons;
	}

	/**
	 * Get the buttons
	 */
	public JButton[] getButtons() {
		return buttons;
	}

	/**
	 * Get methods of the buttons
	 */
	public Map<String,String> getButtonMethods() {
		return labelMethods;
	}

}
