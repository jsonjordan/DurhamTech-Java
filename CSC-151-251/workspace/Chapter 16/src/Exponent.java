import java.util.Scanner;

/*
 * Jason Jordan
 * 
 * CSC 251
 * 
 * Exponents
 */
public class Exponent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.print("Enter an exponent to raise the number to: ");
		int exp = input.nextInt();
		
		System.out.println(number + " raised to the power of " + exp + " equals " + raise(number, exp));
		

	} // end main

	public static int raise( int n, int e){
		if (e == 1){
			return n;
		}
		else {
			return n * raise( n, e-1 );
		}
		
	} // end raise
	
} // end class
