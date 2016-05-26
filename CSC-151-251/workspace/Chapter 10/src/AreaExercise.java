import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 * Area Exercise
 */
public class AreaExercise {

	public static void main(String[] args) {
		// create instance of Scanner
		Scanner input = new Scanner(System.in);
		
		// ask user for input
		System.out.print("Which shape would you like to calculate the area for (circle, square, sphere, or cube): ");
		String desiredShape = input.nextLine();
		
		if (desiredShape.equalsIgnoreCase("circle")){
			System.out.print ("Enter the radius: ");
			double radius = input.nextDouble();
			Circle cir = new Circle();
			cir.calcArea(radius);
			cir.setDimension();
			System.out.printf("For the " + cir.getDimension() + ", the area of the circle with a radius " + radius + " is %.2f" ,cir.getArea());
			
		}
		
		if (desiredShape.equalsIgnoreCase("square")){
			System.out.print ("Enter the length of one side:");
			double sides = input.nextDouble();
			Square squ = new Square();
			squ.setDimension();
			squ.calcArea(sides);
			System.out.printf("For the " + squ.getDimension() + ", the area of the square with a side of " + sides + " is %.2f" ,squ.getArea());
		}
		
		if (desiredShape.equalsIgnoreCase("sphere")){
			System.out.print ("Enter the radius: ");
			double radius = input.nextDouble();
			Sphere sph = new Sphere();
			sph.calcArea(radius);
			sph.setDimension();
			System.out.printf("For the " + sph.getDimension() + ", the area of the sphere with a radius " + radius + " is %.2f" ,sph.getArea());
		}
		
		if (desiredShape.equalsIgnoreCase("cube")){
			System.out.print ("Enter the length of one side:");
			double sides = input.nextDouble();
			Cube cub = new Cube();
			cub.setDimension();
			cub.calcArea(sides);
			System.out.printf("For the " + cub.getDimension() + ", the area of the cube with a side of " + sides + " is %.2f" ,cub.getArea());
		}
		
		
		
	}

}

class Shape {
	
} // end class Shape



class TwoDimensionalShape extends Shape {
	public String _shapeDimension;
	
	public void setDimension(){
		_shapeDimension = "two dimensional shape";
	}

	public String getDimension(){
		return _shapeDimension;
	}
	
} // end subclass 2DS

class Circle extends TwoDimensionalShape {
	public double _radius;
	public double _area;
	
	public void calcArea( double radius ){
		_radius = radius; 
		double area = Math.PI * radius * radius;
		_area = area;
	}
	
	public double getArea(){
		return _area;
	}
} // end subsubclass Circle

class Square extends TwoDimensionalShape {
	public double _sides;
	public double _area;
	
	public void calcArea( double sides ){
		_sides = sides; 
		double area = sides * sides;
		_area = area;
	}
	
	public double getArea(){
		return _area;
	}
} // end subsubclass Square



class ThreeDimensionalShape extends Shape {
public String _shapeDimension;
	
	public void setDimension(){
		_shapeDimension = "three dimensional shape";
	}

	public String getDimension(){
		return _shapeDimension;
	}
	
} // end subclass 3DS

class Sphere extends ThreeDimensionalShape {
	public double _radius;
	public double _area;
	
	public void calcArea( double radius ){
		_radius = radius; 
		double area = 4 * Math.PI * radius * radius;
		_area = area;
	}
	
	public double getArea(){
		return _area;
	}
} // end subsubclass Sphere

class Cube extends ThreeDimensionalShape {
	public double _sides;
	public double _area;
	
	public void calcArea( double sides ){
		_sides = sides; 
		double area = sides * sides * 6;
		_area = area;
	}
	
	public double getArea(){
		return _area;
	}
} // end subsubclass Cube
