import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 * Retail Price Calculator
 */




public class RetailPrice {

	public static void main(String[] args) {
		// declare vars
		double markup, wholesale, retailPrice;
		
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// ask user for input
		System.out.print("Enter the wholesale price: ");
		wholesale = input.nextDouble();
		
		System.out.print("Enter the markup percentage: ");
		markup = input.nextDouble();
		markup = markup/100;
		
		// send to method
		retailPrice = calculateRetail(wholesale, markup);
		
		// output to user
		System.out.printf("The retail price of this item is $%.2f", retailPrice);

	} // end main
	
	//create method to accept one argument from main
		public static double calculateRetail (double wholesale, double markup){
	
		// determine the retail price
		double retailPrice = wholesale + (wholesale*markup);
		return retailPrice;
	
	
	} // end calculateRetail

} // end class
