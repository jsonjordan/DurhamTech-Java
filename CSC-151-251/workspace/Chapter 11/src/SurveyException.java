import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 * The survey part of the Exception programs
 */
public class SurveyException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Formatter output = null;
		
		int response = 0;
		int invalidEntries = 0;
		
		try {
			output = new Formatter("G:\\Text\\data.txt");
			System.out.println("File has been created.");
			
		}
		catch (FileNotFoundException fileNotFoundException){
			System.out.println("File could not be created or opened.");
			System.exit(1);
		}
		
		System.out.println("On a scale of 1-5, rate your school cafeteria (5 being the best) - press ctrl-z to quit ");
		
		

		
		while ( input.hasNext()){
			
			
		
			do{
				try{
					response = input.nextInt();
				
					invalidEntries = 1;
				} // end try

				catch (InputMismatchException inputError){
					System.out.println("Must enter a number");
					input.nextLine();    
					response = 0;
				}	
			}while (invalidEntries == 0);
			
			try{
				output.format("%s\r\n", response);
				
			}
			catch (FormatterClosedException formatterClosedException){
				System.err.println("Error writing to file.");
			}
		}
		
		output.close();
		

	}// end main

}// end class
