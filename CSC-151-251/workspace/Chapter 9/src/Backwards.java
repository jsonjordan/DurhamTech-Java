import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 * Backwards strings
 */
public class Backwards {

	public static void main(String[] args) {
		
		//declair vars
		String str;
		
		// instance of scanner
		Scanner input = new Scanner(System.in);
		
		// ask user for input
		System.out.print("Enter your word or phrase: ");
		str = input.nextLine();
		 
		int leng = str.length();
		
		// reverse the order of the characters
		for (int index = leng; index <= leng && index > 0; index--){
			System.out.print(str.charAt(index-1));
		}// end for
		
		
		
		

	} // end main

} // end class
