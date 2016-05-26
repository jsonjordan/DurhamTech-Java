import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * reading the output file and writing data to the console
 */
public class ReadTextFile {

	public static void main(String[] args) {
		
		// still use Scanner to read data from file
		Scanner input;
		
		try{
			input = new Scanner( new File("c:\\client.txt"));
			while ( input.hasNext()) {
				System.out.println(input.nextLine());
			}
			
			input.close();
		}
		
		catch (FileNotFoundException fileNotFoundException) {
			System.err.println("File was not found.");
			System.exit(1);
		}
		
		
		
		
		
		
	}// end main

}// end class
