import java.util.Scanner;

/*
 * Examples of using wrapper functionality
 * 
 * use for primitive data types
 */
public class WrapperExamples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a single character: ");
		String s = input.nextLine();
		
		char ch= s.charAt(0);
		
		// how to use character wrapper
		if ( Character.isLowerCase(ch)){
			System.out.println("This is a lower case letter.");
		}
		
		if ( Character.isDigit(ch)){
			System.out.println("This is a digit.");
		}
		
		// wrapper for numerics
		int number = 20;
		String s20 = Integer.toString(number);
		
		String s2 = "20";
		int number20 = Integer.parseInt(s2);
		
		
		// homework help.   split
		
		
		

	} // end main

} // end class
