/*
 * Author:		Tyler Blanchard
 * Date:		12/12/2018
 * 
 * Description:		This program takes orders from the user using radio button.
 * 					one click from a radio button will add food to their order.
 * 					Will display a message to tell the user that their food was added
 * 					to order. Uses to button, one that resets their order and another that
 * 					opens up another frame that shows the total number of which food was bought
 * 					and the total price for the order.
 */
public class Main {

	public static void main(String[] args) {
		
		// set title of the BrakfastFrame
		BreakfastFrame frame = new BreakfastFrame("Tyler's Dinner");

		// set title of the PriceFrame
		PriceFrame CostFrame = new PriceFrame("Your check");

		// set up handler
		new Handler(frame, CostFrame);

		// make the BrakfastFrame visible at the start
		frame.setVisible(true);

	}

}
