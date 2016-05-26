import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 *
 *Bar Chart 
 */
public class BarChart {

	public static void main(String[] args) {
		// declare vars
		double store1, store2, store3, store4, store5;
		int counter = 0;
		
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// ask user for input
		System.out.print("Enter today's sales for store 1: ");
		store1 = input.nextDouble();
		
		System.out.print("Enter today's sales for store 2: ");
		store2 = input.nextDouble();
		
		System.out.print("Enter today's sales for store 3: ");
		store3 = input.nextDouble();
		
		System.out.print("Enter today's sales for store 4: ");
		store4 = input.nextDouble();
		
		System.out.print("Enter today's sales for store 5: ");
		store5 = input.nextDouble();
		

		// Start of bar cart
		System.out.println("SALES BAR CHART");
		
		// store 1
		System.out.print("Store 1: ");
		while (counter < store1/100 ){
			System.out.print("*");
			counter ++;
		}
		
		// store 2
		System.out.print("\nStore 2: ");
		counter = 0;
		while (counter < store2/100 ){
			System.out.print("*");
			counter ++;
		}

		// store 3
		System.out.print("\nStore 3: ");
		counter = 0;
		while (counter < store3/100 ){
			System.out.print("*");
			counter ++;
		}

		// store 4
		System.out.print("\nStore 4: ");
		counter = 0;
		while (counter < store4/100 ){
			System.out.print("*");
			counter ++;
		}

		// store 5
		System.out.print("\nStore 5: ");
		counter = 0;
		while (counter < store5/100 ){
			System.out.print("*");
			counter ++;
		}





	} // end main

} // end class
