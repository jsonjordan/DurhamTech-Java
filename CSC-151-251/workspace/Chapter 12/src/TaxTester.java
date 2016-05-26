/*
 * CSC 251
 * 
 * Jason Jordan
 * 
 * Tax Tester
 */
import javax.swing.JFrame;

public class TaxTester {

	public static void main(String[] args) {
MonthlySalesTax gui = new MonthlySalesTax();
		
		// set size
		gui.setSize(500, 400);
		// what to do when clicking x
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// make it visible
		gui.setVisible(true);
		

	}

}
