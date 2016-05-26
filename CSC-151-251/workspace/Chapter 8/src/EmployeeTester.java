/*
 * Tester app to test Employee class
 */
public class EmployeeTester {

	public static void main(String[] args) {
		// create instance of Employee
		Employee emp1 = new Employee("Don","S12345");

		// output
		System.out.println(emp1.getName() + " has an employee number of " + emp1.getNumber());
		
		// show number of employees
		System.out.println("Number of employees is " + emp1.getNumberOfEmployees());
		
		// create another instance of Employee
		Employee emp2 = new Employee("Bob","W67890");
		System.out.println(emp2.getName() + " has an employee number of " + emp2.getNumber());
		
		System.out.println("Number of employees is " + emp2.getNumberOfEmployees());
		
		// example of passing object to a method
		displayEmployeeInfo( emp2 );
		
		
	} // end main

	// method to accept object as parameter 
	public static void displayEmployeeInfo ( Employee e ){
		System.out.println(e.getName() + " has an employee number of " + e.getNumber());
	}
	
	
	
	
	
	
	
	
} // end class
