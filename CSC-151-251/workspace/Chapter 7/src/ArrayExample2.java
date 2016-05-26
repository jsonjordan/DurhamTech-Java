/*
 * Example of declaring and assigning data to an array in one step.
 */
public class ArrayExample2 {

	public static void main(String[] args) {
		int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
				
		// Enhanced for loop just for arrays
		for ( int val : daysOfMonth ){
			System.out.println(val);
		}
		
		// passing daysOfMonth into a method
		displayArray( daysOfMonth );
		

	} // end main

	//method to display array data
	public static void displayArray( int[] days){
		for ( int index = 0; index < days.length; index++){
			System.out.println("Month " + (index + 1) + " has " + days[index] + " days.");
		}
		
		
		
		
	} // end displayArray
	
	
	
	
	
	
	
} // end class
