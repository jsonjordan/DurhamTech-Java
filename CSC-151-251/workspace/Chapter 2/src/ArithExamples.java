import java.util.Scanner;

/*
 * J. Jordan
 * CSC - 151
 * 
 * This will show arithmetic examples
 * 
 */


public class ArithExamples {

	public static void main(String[] args) {
		//declare cars
		double hoursWorked, hourlyRate, grossPay;
		
		// create an instance of Scanner - our input method
		Scanner input = new Scanner(System.in);
		
		// Ask the user for hours worked
		System.out.print("Enter your hours worked:  ");
		hoursWorked = input.nextDouble();
		
		// Ask the user for hourly rate
		System.out.print("Enter your hourly rate:  ");
		hourlyRate = input.nextDouble();
		
		// calculate gross pay
		grossPay = hoursWorked * hourlyRate;
		
		// display gross pay
		System.out.print("Your gross pay is $" + grossPay);
		
			
		
	} // end main method

}	// end class
