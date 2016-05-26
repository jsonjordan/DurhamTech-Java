/*
 * Another example of inheritance
 * also with a sub-subclass
 */
public class DTInheritance {

	public static void main(String[] args) {
		
		// create instance of Faculty
		Faculty fac = new Faculty();
		// set data and months
		fac.setEmployeeData("Jason Jordan", "Jordan10100", "Instructor of Networking");
		fac.setMonths(12);
		System.out.println(fac._name + " " + fac._empNumber + " works "+ fac._months + " months.");
		
		
		// create instance of FacultyType
		FacultyType ft = new FacultyType();
		ft.setEmployeeData("Roy Williams", "Will20200", "Instructor of Basketball");
		ft.setMonths(12);
		ft.setFacultyType("Full Time");
		double pay = ft.calculateRaise() * 10000.00;
		System.out.println(pay);
		
		
	} // end main

} // end class



class DTEmployees {
	public String _name;
	public String _empNumber;
	public String _title;
	
	public void setEmployeeData( String name, String empNumber, String title){
		_name = name;
		_empNumber = empNumber;
		_title = title;
		
	}
	
} // end superclass

class Faculty extends DTEmployees {
	public int _months;
	
	public void setMonths ( int months){
		_months = months;
	}
} // end subclass Faculty

class Staff extends DTEmployees {
	public String _type;
	
	public void setType (String type){
		_type = type;
	}
} // end subclass Staff

class FacultyType extends Faculty {
	public String _facultyType;
	
	public void setFacultyType ( String facultyType){
		_facultyType = facultyType;
	}
	
	public double calculateRaise(){
		if ( _facultyType == "Full Time"){
			return 0.10;
		}
		else {
			return 0.12;
		}
	}
	
} // end sub sub class FacultyType



