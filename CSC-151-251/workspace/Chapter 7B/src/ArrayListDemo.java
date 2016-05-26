import java.util.ArrayList;

/* 
 * Example of using an arraylist
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		// declare a string arraylist
		ArrayList< String > colors = new ArrayList< String >();
		
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		//colors.remove("blue");
		
		//  display elements
		for ( int row = 0; row < colors.size(); row++){
			System.out.printf("%s\n", colors.get(row));	
			
		} // end for
		
		
		boolean b = colors.contains("green");
		System.out.println(b);
		
		int size = colors.size();
		System.out.println(size);

	}

}
