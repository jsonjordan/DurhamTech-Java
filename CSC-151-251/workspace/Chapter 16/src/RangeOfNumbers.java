import java.util.Scanner;

/*
 * User enters a positive integer
 * Using recursion to add numbers from that number to 1 and display the sum
 */
public class RangeOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number and I will sum the range to 1: ");
		int number = input.nextInt();
		
		System.out.println(number + " summed down to one is " + addNumbers( number ));

	} // end main

	public static int addNumbers(int n){
		
		if ( n == 1){
			return n;
		}
		else {
			return n + addNumbers(n - 1);
		}
	
	} // end addNumbers
	
} // end class
