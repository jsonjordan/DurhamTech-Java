import java.util.Scanner;

/*
 * Test app for MetricConverter class
 */
public class MetricConverterTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// ask user
		System.out.print("Enter miles to convert: ");
		double miles = input.nextDouble();
		
		double kilos = MetricConverter.milesToKilos(miles);
		System.out.println(miles + " miles is " + kilos + " kilos.");

		
		
		
		
		
		
		
		
	} // end main

} // end class
