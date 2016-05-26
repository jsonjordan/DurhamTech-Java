import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 * Conversion Program
 */


public class Conversion {

	public static void main(String[] args) {
	// declare vars
		int selection=0;
		
	// Scanner
	Scanner input = new Scanner(System.in);
		
	// ask user for distance
	System.out.print("Enter a distance in meters: ");
	double meters = input.nextDouble();
	
	// menu loop
	while (selection < 4){
		System.out.println("1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program");
		
		selection = input.nextInt();
		
		if (selection == 1){
			kilometers (meters);
		} // end if 1
		
		if (selection == 2){
			inches (meters);
		} // end if 2
		
		if (selection == 3){
			feet (meters);
		} // end if 3
		
		if (selection == 4){
			System.out.print("Bye!");
		} // end if 4
		
	} // end while

} // end main

	//create method to convert to kilometers
		public static void kilometers (double meters){
			double converted = meters * 0.001;
			System.out.println(meters + " meters is " + converted + " kilometers.");
		} // end kilometers
		
	//create method to convert to inches
		public static void inches (double meters){
			double converted = meters * 39.37;
			System.out.println(meters + " meters is " + converted + " inches.");
		} // end inches

	//create method to convert to feet
		public static void feet (double meters){
			double converted = meters * 3.281;
			System.out.println(meters + " meters is " + converted + " feet.");
		} // end feet
	
} // end class
