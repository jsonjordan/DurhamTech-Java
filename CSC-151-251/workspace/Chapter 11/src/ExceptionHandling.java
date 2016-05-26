import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Examples of exception handling
 */
public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x;
		double y;
		double answer;

		// keep track of invalid entries
		boolean invalidEntries = true; 

		do {

			try{
				System.out.print("Enter the first number: ");
				x = input.nextDouble();

				System.out.print("Enter the second number: ");
				y = input.nextDouble();

				answer = x/y;

				System.out.println(answer);
				invalidEntries = false;
			} // end try

			catch (InputMismatchException inputError){
				System.out.println("Must enter a number");
				input.nextLine();    // trust me, you need this
			}

			finally {
				// this block will execute all the time
			}
			
		} while (invalidEntries);







	} // end main

} // end class
