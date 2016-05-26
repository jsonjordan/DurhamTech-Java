import java.util.Scanner;

/*
 * Jason Jordan
 * CSC-151
 * 
 * Grades Tracking
 */
public class GradesTracking {

	public static void main(String[] args) {
		// declare vars
		int highest = 0;
		int lowest = 100;
		int grades[] = {0,0,0,0,0};
		String letters[] = {"A", "B", "C", "D", "F"};
		int grade;
		double total = 0.0; 
		double counter = 0.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a numeric grade (0-100) or -1 to quit: ");
		grade = input.nextInt();
		
		while (grade != -1){
			total += grade;
			counter++;
			if (grade > highest){
				highest = grade;
			} // end of highest if
			if (grade < lowest){
				lowest = grade;
			}// end of lowest if
			
			if (grade >= 90){
				grades[0]++;
			} // end 90 if
			else {
				if (grade >= 80){
					grades[1]++;
				} // end 80 if
				else{
					if (grade >= 70){
						grades[2]++;
					} // end 70 if
					else{
						if (grade >= 60){
							grades[3]++;
						} // end 60 if
						else{
							grades[4]++;
							
						} // end 60 else
					} // end 70 else
				} // end 80 else
			} // end 90 else
			
			System.out.print("Enter a numeric grade (0-100) or -1 to quit: ");
			grade = input.nextInt();
		} // end while
		
		for ( int index = 0; index < grades.length; index++){
			System.out.println("Number of " + letters[index] + " grades: " + grades[index]);
		} // end for
		
		double average = total/counter;
		System.out.printf("Average is: %.2f\n", average);
		System.out.println("Highest grade is: " + highest);
		System.out.println("Lowest grade is: " + lowest);
		
		

	} // end main

} // end class
