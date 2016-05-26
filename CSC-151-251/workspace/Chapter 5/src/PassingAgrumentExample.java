import java.util.Scanner;

/*
 * Example of using a method with passing of arguments and passing multiple arguments
 */


public class PassingAgrumentExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		
		doubleTheNumber (num1, num2);
		

	} // end main

	//create method to accept one argument from main
	public static void doubleTheNumber (int num1, int num2){
		int answer = num1 + num2;
		System.out.println("The answer is " + answer);
	} // end doubleTheNumber
	
	
	
	
	
	
	
	
} // end class
