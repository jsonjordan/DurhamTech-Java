import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 * Area Tester
 */
public class AreaTester {

	public static void main(String[] args) {
		// declare vars
		double r, width, length, height, area; 
		
		
		Scanner input = new Scanner(System.in);
		
		// ask user for shape
		System.out.println("What shape would you like to find the area of? \n1. Circle\n2. Rectangle\n3. Cylinder\n4. End");
		int choice = input.nextInt();
		while (choice !=4){
		if (choice == 1){
			System.out.print("Radius: ");
			r = input.nextDouble();
			area = Area.area(r);
			System.out.println("The area of the circle is " + area);
		} // end circle if
		
		if (choice == 2){
			System.out.print("Length: ");
			length = input.nextDouble();
			System.out.print("Width: ");
			width = input.nextDouble();
			area = Area.area(width, length);
			System.out.println("The area of the rectangle is " + area);
		} // end rectangle if
		
		if (choice == 3){
			System.out.print("Radius: ");
			r = input.nextDouble();
			System.out.print("Height: ");
			height = input.nextDouble();
			area = Area.area(r, height, Math.PI);
			System.out.println("The area of the cylinder is " + area);
		} // end cylinder if
	
		System.out.println("What shape would you like to find the area of? \n1. Circle\n2. Rectangle\n3. Cylinder\n4. End");
		choice = input.nextInt();
		
		} // end while
	
		
		


	}// end main

}// end class
