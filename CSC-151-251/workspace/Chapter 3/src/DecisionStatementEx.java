import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 * Decision Statement Examples
 */

public class DecisionStatementEx {

	public static void main(String[] args) {
		// declare vars
		int grade = 0;
		
		//  instance of Scanner
		Scanner input = new Scanner(System.in);
		
		// prompt user for grade
		System.out.print("Enter a numeric grade:");
		grade = input.nextInt();
		
		//  example of using if statement
		if (grade >= 60){
			System.out.println("You passed!");
			
			// nested if statement
			if (grade >= 70){
			System.out.println("On to Advanced Java");
			} // end nested if
			
		} // end if
			
		
		else {
			System.out.println("You did not pass.");
		} // end else
		
		
		// shortcut
		String y = grade >= 60 ? "passed!" : "did not pass.";
		System.out.println("You " + y);
		
		
		
		
		
		
		
	} // end main

} // end class
