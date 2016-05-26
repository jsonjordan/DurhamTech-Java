import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Example of creating and writing to output file
 * Example of reading from file
 * 
 */
public class FileExample {

	public static void main(String[] args) throws FileNotFoundException {
		// create instance of PrintWriter
		PrintWriter outputfile = new PrintWriter("c:\\names.txt"); // creates file
		
		outputfile.println("Don");
		outputfile.println("Susan");
		outputfile.println("Rob");
		
		// close file
		outputfile.close();
		
		
		// read the file line by line
		String str;
		
		File myFile = new File("c:\\names.txt");  // opens the file
		Scanner input = new Scanner(myFile);
		
		while ( input.hasNext() ){   // was the end of file marker hit
			str = input.nextLine();
			System.out.println(str);
		} // end while
		
		// close the file
		input.close();
		
		
		
	} // end main

} // end class
