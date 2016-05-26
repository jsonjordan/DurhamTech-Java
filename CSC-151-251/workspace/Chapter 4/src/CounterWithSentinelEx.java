import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 * Counter with sentinel example
 * 
 */
public class CounterWithSentinelEx {

	public static void main(String[] args) {
		// declare vars
		double grade, total = 0.00, average = 0.00;
		int numOfGrades = 0;
		
		
		// Scanner
		Scanner input = new Scanner(System.in);
		
		
		do{
			System.out.print("Enter a numeric grade OR -1 to quit: ");
			grade = input.nextDouble();
			
			// check for valid entry or sentinel
			if (grade != -1){
				total+= grade;   // total + total + grade
				numOfGrades++;
			} // end if
		
		
		
		}while( grade != -1 );
		
		// calculate averages
		average = total/numOfGrades;
		
		// display average
		System.out.printf("Your average is %.2f ", average);

	}

}
