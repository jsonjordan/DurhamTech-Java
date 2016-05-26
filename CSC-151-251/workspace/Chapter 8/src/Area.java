/*
 * Jason Jordan
 * CSC 151
 * 
 * Area Class
 */
public class Area {

	public static double area ( double r){
		return (Math.PI * r * r);
	} // end circle
	
	public static double area ( double width, double length){
		return (width * length);
	} // end rectangle
	
	public static double area ( double r, double height, double Pi){
		return (Pi * r * r * height);
	} // end cylinder
} // end class
