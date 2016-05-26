import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

/*
 * Three procedures to create text file, add records, and close text file
 */
public class CreateTextFile {

	// create file object
	private Formatter output;
	
	// procedure to create and open output file
	public void createopenFile() {
		try {
			output = new Formatter("c:\\client.txt"); // or something like C:\\Users\\974student\\Documents\\client.txt
			System.out.println("File has been created.");
			
		}
		catch (FileNotFoundException fileNotFoundException){
			System.out.println("File could not be created or opened.");
			System.exit(1);
		}
	} // end createopenFile
	
	// procedure to add records/data to our output file
	public void addRecords() {
		String rec;
		Scanner input = new Scanner(System.in);
		// ask user for data
		System.out.println("Enter client name and money owed: ");
		System.out.println("Press crtl-z to quit.");
		
		while ( input.hasNext()){
			rec = input.nextLine();
			try{
				output.format("%s\r\n", rec);
				
			}
			catch (FormatterClosedException formatterClosedException){
				System.err.println("Error writing to file.");
			}
		}
		
		
		
	} // end addRecords
	
	//procedure to close the output file
	public void closeFlie() {
		output.close();
	} // end closeFile
	
	
	
	
	
	
	
} // end class
