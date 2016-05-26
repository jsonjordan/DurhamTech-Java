import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 * And Or Examples
 */


public class AndOrExample {

	public static void main(String[] args) {
		// declair vars
		double salary = 0.00;
		int years = 0;
	
		
		// create instance of Scanner
		Scanner input = new Scanner(System.in);
		
		// ask user for salary and years worked
		System.out.print("Enter you salary: ");
		salary = input.nextDouble();
		
		System.out.print("Enter your years worked: ");
		years = input.nextInt();
		
		// test our && and ||
		if (salary > 50000 || years > 5){
			System.out.print("You qualified for the loan.");
		} // end if
		
		else {
			System.out.print("You did not qualify for the loan.");
		} // end else
		
		
		
		

	} // end main

} // end class
