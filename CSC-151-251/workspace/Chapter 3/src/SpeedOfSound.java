import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 * Speed of Sound
 */



public class SpeedOfSound {

	public static void main(String[] args) {
		// declare vars
		String medium;
		double distance;
	    double time= 0;
		
		
		// instance of scanner
		Scanner input = new Scanner(System.in);
		
		// prompt user for medium
		System.out.print("Choose Air, Water, or Steel: ");
		medium = input.nextLine();
		
		
		
		// overall if statement
		if ((medium.equalsIgnoreCase("Air")) || (medium.equalsIgnoreCase("Water")) || (medium.equalsIgnoreCase("Steel"))){
			
			// prompt the user for distance
			System.out.print("What distance, in feet, will \nthe sound wave travel?");
			distance = input.nextDouble();
			
		// if statement for Air
		if (medium.equalsIgnoreCase("Air")){
			time = distance / 1100;
		} // end air if
		
		// if statement for Water
		if (medium.equalsIgnoreCase("Water")){
			time = distance / 4900;
		} // end water if
		
		// if statement for Steel
		if (medium.equalsIgnoreCase("Steel")){
			time = distance / 16400;
		} // end steel if
		
		
		//  Print out answer to user	
		System.out.printf("It will take %.2f" + " seconds to travel\n", time);
		System.out.printf("%,.0f feet through " + medium, distance);	
		
		} // end overall if
		
		// else statement for incorrect material
		else{
			System.out.print("You did not select a correct material.");
		}
		
	} // end main

} // end class
