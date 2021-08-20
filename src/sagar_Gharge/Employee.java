package sagar_Gharge;


class Employee {
	
	String EmployeeFirstName = "Sagar";
	String EmployeeLastname = "Gharge";
	int EmployeeID = 6281;
	String EmployeeDOB = " 7 March 1995";
	
	void displayInfo (){
		System.out.println ( " Employee First Name is  " + EmployeeFirstName );
		System.out.println ( " Employee Last name is " + EmployeeLastname );
		System.out.println ( " EmployeeDOB is " + EmployeeDOB );
		System.out.println ( " EmployeeID is " +  EmployeeID );
		}
	
	public static void main (String [] args) {
		Employee s1 = new Employee ();
		s1.displayInfo ();
	
	}

}