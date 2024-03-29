import java.util.Scanner;

/*
 * Example of using multidimensional array
 */
public class MultiDemExample {

	public static void main(String[] args) {
		
		// declare and assign an array of students grades
		int [][] studentGrades = {  { 90, 100, 82, 98 },
									{ 80, 100, 60, 90 },
									{ 88, 100, 78, 92 } };
			
		
									//  0,0  0,1  0,2  0,3
									//  1,0  1,1  1,2  1,3
									//  2,0  2,1  2,2  2,3
		
		
		// print out data in the studentGrades array
		for ( int row = 0; row < studentGrades.length; row++){
			for ( int col = 0; col < studentGrades[row].length; col ++){
				System.out.printf("%4d" , studentGrades[row][col]);
			} // end for loop
			System.out.println();
		} // end for
		
		
		// example of using a dynamic approach to entering data into an array
		Scanner input = new Scanner(System.in);
		int [][] scores = new int [3][4];
		
		// for loop to put in data
		for ( int row = 0; row < 3; row++){
			for( int col = 0; col < 4; col++){
				// ask user for scores
				System.out.print("Enter a score: ");
				scores[row][col] = input.nextInt();
			}
		}
		
		// print out data in the scores array
				for ( int row = 0; row < scores.length; row++){
					for ( int col = 0; col < scores[row].length; col ++){
						System.out.printf("%4d" , scores[row][col]);
					} // end for loop
					System.out.println();
				} // end for
		

	} // end main

} // end class
