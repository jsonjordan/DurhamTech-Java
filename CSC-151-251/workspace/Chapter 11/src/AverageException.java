import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 * The average part of the exception programs
 */
public class AverageException {

	public static void main(String[] args) {
		Scanner input;
		double total = 0;
		int votes = 0;
		Formatter output = null;

		try{
			input = new Scanner( new File("G:\\Text\\data.txt"));
			while ( input.hasNext()) {
				double survey = Double.parseDouble(input.nextLine());
				if(survey != 0){
				total = total + survey;
				votes++;
			}
			}
			
			input.close();
		}
		
		catch (FileNotFoundException fileNotFoundException) {
			System.err.println("File was not found.");
			System.exit(1);
		}

		double average = total/votes;
	
		
		try {
			output = new Formatter("G:\\Text\\output.txt"); 
			System.out.println("File has been created.");
			
		}
		catch (FileNotFoundException fileNotFoundException){
			System.out.println("File could not be created or opened.");
			System.exit(1);
		}
		
		output.format("The average rating of the school cafeteria is %.2f", average);
		output.close();
		
		
		
	} // end main

} // end class
