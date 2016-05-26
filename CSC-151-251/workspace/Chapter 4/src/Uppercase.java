import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 * Uppercase File Converter
 */



public class Uppercase {

	public static void main(String[] args) throws FileNotFoundException {
		// declare vars
		String newfile1, newfile2, str;
		
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// Ask user for file names
		System.out.print("Name of input file:");
		newfile1 = input.nextLine();
		
		System.out.print("Name of output file:");
		newfile2 = input.nextLine();
		
		// PrintWriter
		PrintWriter outputfile = new PrintWriter(newfile2);
		
		// File
		File myFile = new File(newfile1);
		Scanner input1 = new Scanner(myFile);
		while ( input1.hasNext() ){
			str = input1.nextLine();
			outputfile.printf("%S",str);
			
		} // end while
		
		// close file
		outputfile.close();
		input.close();
		input1.close();
		
		
		
		
	} // end main

} // end class
