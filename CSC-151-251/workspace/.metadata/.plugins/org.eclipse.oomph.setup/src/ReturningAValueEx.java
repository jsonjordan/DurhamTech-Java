import java.util.Scanner;

/*
 * Example of using a method that accepts parameters and returns a value
 */


public class ReturningAValueEx {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		
		int answer = doubleTheNumber (num1, num2);
		
		System.out.println("The answer is " + answer);

	} // end main

	//create method to accept one argument from main
	public static int doubleTheNumber (int num1, int num2){
		int answer = num1 + num2;
		return answer;
	} // end doubleTheNumber
	
	
	
	
	
} // end class
