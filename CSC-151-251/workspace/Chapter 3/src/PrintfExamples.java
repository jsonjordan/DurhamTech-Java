/*
 * Examples of using Printf
 */


public class PrintfExamples {

	public static void main(String[] args) {
		// declare vars

		double TAX = 0.0675;
		double meal = 10000.00;
		
		double total = meal + (meal * TAX);
		
		// output total
		System.out.printf("Your total is $%,.2f", total);
		
		
		int month = 12;
		System.out.printf("\nYour month is %d", month);
		
	} // end main

} // end class
