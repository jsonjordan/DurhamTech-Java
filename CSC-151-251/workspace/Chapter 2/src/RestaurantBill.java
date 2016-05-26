import java.util.Scanner;

/*
 * J. Jordan
 * CSC - 115
 * 
 * This program will display a meal charge, with tax and tip
 */

public class RestaurantBill {

	private static final String Final = null;

	public static void main(String[] args) {
		
		// declair vars and constants
		double charge;
		double tax;
		double tip;
		double total;
		
		final double TAX_RATE = .0675;
		final double TIP_RATE = .20;
		
		// create an instance of Scanner
		Scanner input = new Scanner(System.in);
		
		// ask user for bill ammount
		System.out.print("How much was your restaurant bill?");
		charge = input.nextDouble();
		
		// calculate tax, tip and total
		tax = charge * TAX_RATE;
		tip = (charge + tax) * TIP_RATE;
		total = charge + tax + tip;
		
		// display information to user
		System.out.println("Your initial bill was $" + charge);
		System.out.println("Your tax was $" + tax);
		System.out.println("Your tip of 20% was $" + tip);
		System.out.println("Your total bill is $" + total);
		
		
		
		
	} // end main

}	// end class
