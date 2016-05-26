/*
 * Example of using static fields
 */
public class Employee {

	// declare static field/var to keep track of number of employees
	private static int numberOfEmployees = 0;
	
	
	// declare instance vars
	String empName;
	String empNumber;
	
	// constructor
	public Employee( String name, String numb ){
		empName = name;
		empNumber = numb;
		numberOfEmployees++;
		
	} // end constructor
	
	public void setName( String name ){
		empName = name;
	}// end setName
	
	public String getName (){
		return empName;
	}// end getName
	
	public void setNumber( String numb ){
		empNumber = numb;
	}// end setNumber
	
	public String getNumber (){
		return empNumber;
	}// end getNumber
	
	public int getNumberOfEmployees(){
		return numberOfEmployees;
	} // end getNumberOfEmployees
	
} // end class
