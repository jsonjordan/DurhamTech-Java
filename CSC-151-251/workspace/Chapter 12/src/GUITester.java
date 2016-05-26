import javax.swing.JFrame;

/*
 * Tester for GUIExample of adding two numbers
 */
public class GUITester {

	public static void main(String[] args) {
		
		GUIExample gui = new GUIExample();
		
		// set size
		gui.setSize(400, 400);
		// what to do when clicking x
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// make it visible
		gui.setVisible(true);
		
		
		
		
	} // end main

}// end class
