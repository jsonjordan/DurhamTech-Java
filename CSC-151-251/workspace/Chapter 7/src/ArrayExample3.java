/*
 * Example of summing array elements
 */
public class ArrayExample3 {

	public static void main(String[] args) {
		// declare and assign grades array
		int[] grades = { 90 , 80 , 70 , 60 };
		int total = 0;
		
		// use for loop to add grades
		for ( int index = 0; index < grades.length; index++){
			total += grades[index];
		} // end for
		
		double average = total/grades.length;
		System.out.println(average);
		
		
		

	} // end main

} // end class
