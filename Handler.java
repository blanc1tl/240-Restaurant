import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Handler implements ActionListener{

	// set up hashMap
	Map<String,String> buttonTask;
	// set up GameFrame variable
	BreakfastFrame frame;
	// set up StatFrame variable
	PriceFrame costFrame;
	// set up total price variable
	int totalPrice;
	// set up variables to keep track of the number of a type of
	// food the user ordered
	int totalEggs, totalBacon, totalWaffles, totalPancakes, totalToast;
	// variable for food
	String foodName;
	
	/**
	 * Constructor -- set reference to the the views
	 * 				  BreakfastFrame and PriceFrame
	 * @param frame The view of the BreakfastFrame
	 * @param costFrame The model of the PriceFrame
	 */
	public Handler(BreakfastFrame frame, PriceFrame costFrame) {
		this.frame = frame;
		this.costFrame = costFrame;
		
		// register this controller (event handler) with
		// each button (event source) in the view
		JButton[] buttons = frame.getButtons();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(this);
		}
		
		JRadioButton[] radioButtons = frame.getRadioButtons();
		// register radio buttons
		for (JRadioButton rb : radioButtons) {
			rb.addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		buttonTask = frame.getButtonMethods();
		// if the user clicks a button
		if (source instanceof JButton) {
			JButton b = (JButton)source;
			// sets the label of button to a variable
			String buttonLabel = b.getActionCommand();
			// sets the task to a variable
			String task = buttonTask.get(buttonLabel);
			// call the doTask method
			doTask(buttonLabel, task);
		}
		if (source instanceof JRadioButton) {
			JRadioButton rb = (JRadioButton)source;
			// sets the food name to a variable
			foodName = rb.getActionCommand();
			// call the getPrice method
			getPrice();
		}

	}
	
	/**
	 * checks to see what the user ordered and
	 * adds the price of it to the totalPrice variable.
	 * Displays message that their item was added to order
	 */
	private void getPrice() {
		// if the user hits the eggs radio button
		if (foodName.equals("Eggs")) {
			// add the price for eggs to totalPrice
			totalPrice = totalPrice + 4;
			// add to the total count of eggs the user ordered
			totalEggs = totalEggs + 1;
			// Display message that tells the user that eggs has been add to there order
			frame.helloField.setText("Eggs has been added to you order");
		}
		// if the user hits the bacon radio button
		if (foodName.equals("Bacon")) {
			// add to the total count of bacon the user ordered
			totalBacon = totalBacon + 1;
			// add the price for bacon to totalPrice
			totalPrice = totalPrice + 2;
			// Display message that tells the user that bacon has been add to there order
			frame.helloField.setText("Bacon has been added to you order");
		}
		// if the user hits the toast radio button
		if (foodName.equals("Toast")) {
			// add the price for toast to totalPrice
			totalPrice = totalPrice + 5;
			// add to the total count of toast the user ordered
			totalToast = totalToast + 1;
			// Display message that tells the user that toast has been add to there order
			frame.helloField.setText("Toast has been added to you order");
		}
		// if the user hits the waffles radio button
		if (foodName.equals("Waffles")) {
			// add the price for waffles to totalPrice
			totalPrice = totalPrice + 6;
			// add to the total count of waffles the user ordered
			totalWaffles = totalWaffles + 1;
			// Display message that tells the user that waffles has been add to there order
			frame.helloField.setText("Waffles has been added to you order");
		}
		// if the user hits the pancakes radio button
		if (foodName.equals("Pancakes")) {
			// add the price for eggs to totalPrice
			totalPrice = totalPrice + 6;
			// add to the total count of pancakes the user ordered
			totalPancakes = totalPancakes + 1;
			// Display message that tells the user that pancakes has been add to there order
			frame.helloField.setText("Pancakes has been added to you order");
		}
		
	}
	
	/**
	 * Process the button click by reseting the order, totalPrice,
	 * , and the total amount of each food to zero or, displaying the
	 * PriceFrame showing how much of each food the user bought and the total
	 * cost the user must pay.
	 * 
	 * @param buttonLabel The label on the button
	 * @param task The nature of the button (Order, Clear)
	 */
	private void doTask(String buttonLabel, String task) {
		// if the user Order button
		if (task.equals("Order")) {
			// set a message in the areaField of the costFrame
			costFrame.orderCost.setText("You bought " + totalEggs + " order of eggs\n" 
					+ "You bought " + totalBacon + " orders of bacon\n" + 
					"You bought " + totalToast + " orders of toast\n"
					+ "You bought " + totalWaffles + " orders of waffles\n" + 
					"You bought " + totalPancakes + " orders of pancakes\n\n" +
					"Your meal cost $" + totalPrice + ".00");
			// make the PriceFrame visible
			costFrame.setVisible(true);
		}
		// if the user hits the cancel order button
		if (task.equals("Clear")) {
			// display message in the helloField of the BreakfastFrame 
			frame.helloField.setText("Your order has been canceled");
			// reset totalPrice
			totalPrice = 0;
			// reset totalEggs
			totalEggs = 0;
			// reset totalBcon
			totalBacon = 0;
			// reset totalWaffles
			totalWaffles = 0;
			// reset totalPancakes
			totalPancakes = 0;
			// reset totalToast
			totalToast = 0;
		}
		
	}

}
