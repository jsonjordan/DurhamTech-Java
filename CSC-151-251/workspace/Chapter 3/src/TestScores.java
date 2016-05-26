import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 * Test Scores and Grade
 */



public class TestScores {

	public static void main(String[] args) {
		// declare vars
		double score1,
			   score2,
			   score3,
			   average;
		
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// prompt user for three test grades
		System.out.print("Please enter three test grades: ");
		score1 = input.nextDouble();
		score2 = input.nextDouble();
		score3 = input.nextDouble();
		
		// calculate the average
		average = (score1 + score2 + score3)/3;
				
		// display average to user
		System.out.println("Your average test score is " + average);
		
		// determine letter grade
		
		if (average >= 90){
			System.out.print("This score is an A");
			
		} // end if
			
		if (average >= 80 && average < 90){
			System.out.print("This score is a B");
			
		} // end if
		
		if (average >= 70 && average < 80){
			System.out.print("This score is a C");
					
		} // end if
		
		if (average >= 60 && average <70){
			System.out.print("This score is a D");
		
		} // end if
				
				
		if (average < 60){
			System.out.print("This score is an F");
			
		} // end if
		
}// end main
	
}// end class
