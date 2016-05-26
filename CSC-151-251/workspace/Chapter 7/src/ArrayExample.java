import java.util.Scanner;

/*
 * Create an array of three elements
 * Use scanner to populate array
 */
public class ArrayExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// ask user for number of grades -used to define size of array
		System.out.print("How many grades will you enter: ");
		int numGrades = input.nextInt();
		
		
		// declare array of 3 elements 
		int[] grades = new int[numGrades];
		
		// get inputs
		System.out.print("Enter grade 1: ");
		grades[0] = input.nextInt();
		
		System.out.print("Enter grade 2: ");
		grades[1] = input.nextInt();
		
		System.out.print("Enter grade 3: ");
		grades[2] = input.nextInt();
		
		// output data from array
		// System.out.println("You have entered " + grades[0] +", " + grades[1] + ", " + grades[2]);
		
		// use for-loop to do above
		System.out.println("You have entered ");
		for ( int index = 0; index < grades.length; index++){
			System.out.println(grades[index]);
		}
		
		

	} // end main

} // end class
