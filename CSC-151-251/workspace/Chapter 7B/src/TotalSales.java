import java.util.Scanner;

/*
 * Jason Jordan
 * CSC-151
 * 
 * Total Sales
 */
public class TotalSales {

	public static void main(String[] args) {
		// declare vars
		int salesPerson = 0, productNum = 0, value = 0;
		int salesTotals1 = 0, salesTotals2 = 0, salesTotals3 = 0, salesTotals4 = 0;  
		int[] productTotals = {0,0,0,0,0};
		
		//set up multidimensional array
				Scanner input = new Scanner(System.in);
				int [][] data = new int [4][5];
				
				System.out.print("Enter Sales Person Number (1-4) or -1 to quit and view data: ");
				salesPerson = input.nextInt();
				
				while ( salesPerson != -1){
				
					System.out.print("Enter the Product Number (1-5): ");
					productNum = input.nextInt();
					System.out.print("Enter the dollar value: ");
					value = input.nextInt();
					
					data [salesPerson -1][productNum -1] = value;
					
					System.out.print("Enter Sales Person Number (1-4) or -1 to quit and view data: ");
					salesPerson = input.nextInt();
					
				} // end while
		
				for (int col = 0; col < data[0].length; col++){
					salesTotals1 = salesTotals1 + data[0][col];
				} // end salesTotals1 for
				
				for (int col = 0; col < data[1].length; col++){
					salesTotals2 = salesTotals2 + data[1][col];
				} // end salesTotals2 for
				
				for (int col = 0; col < data[2].length; col++){
					salesTotals3 = salesTotals3 + data[2][col];
				} // end salesTotals3 for
				
				for (int col = 0; col < data[3].length; col++){
					salesTotals4 = salesTotals4 + data[3][col];
				} // end salesTotals4 for
				
				
				for (int row = 0; row < data.length; row++){
					productTotals[0] = productTotals[0] + data[row][0];
				} // end productTotals1 for
				
				for (int row = 0; row < data.length; row++){
					productTotals[1] = productTotals[1] + data[row][1];
				} // end productTotals2 for
				
				for (int row = 0; row < data.length; row++){
					productTotals[2] = productTotals[2] + data[row][2];
				} // end productTotals3 for
				
				for (int row = 0; row < data.length; row++){
					productTotals[3] = productTotals[3] + data[row][3];
				} // end productTotals4 for
				
				for (int row = 0; row < data.length; row++){
					productTotals[4] = productTotals[4] + data[row][4];
				} // end productTotals5 for
				
				
			System.out.println("Sales Person\tProduct 1\tProduct 2\tProduct 3\tProduct 4\tProduct 5\tSales Person Totals");
		
		
	
		
			System.out.print("       " + 1);
			for ( int col = 0; col < data[0].length; col++){
				System.out.printf("         %4d\t" , data[0][col]);
			}// end 1 for
			System.out.print("\t        " + salesTotals1);
		
			System.out.print("\n       " + 2);
			for ( int col = 0; col < data[1].length; col++){
				System.out.printf("         %4d\t" , data[1][col]);
			}// end 2 for
			System.out.print("\t        " + salesTotals2);
			
			System.out.print("\n       " + 3);
			for ( int col = 0; col < data[2].length; col++){
				System.out.printf("         %4d\t" , data[2][col]);
			}// end 3 for
			System.out.print("\t        " + salesTotals3);
			
			System.out.print("\n       " + 4);
			for ( int col = 0; col < data[3].length; col++){
				System.out.printf("         %4d\t" , data[3][col]);
			}// end 4 for
			System.out.println("\t        " + salesTotals4);
		
		System.out.println("__________________________________________________________________________________________________________________");
		
		System.out.print(" Product");
		for ( int index = 0; index < 5; index++){
			System.out.printf("         %4d\t" , productTotals[index]);
		}
		System.out.println("\n Totals");
		

	} // end main

} // end class
