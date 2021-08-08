package parthav;

//Employee has employee firstname, last name and ID . The requirement is to display it

class Employee{
	String employeeFName = "Parthav";
	String employeeLName = "Dani";
	int employeeID = 100;
	
	void displayEmployeeInfo() {
		System.out.println ("Employee First Name is " + employeeFName);
		System.out.println ("Employee Last Name is " + employeeLName);
		System.out.println ("Employee ID is " + employeeID);
		
	}
	
	public static void main(String [] args) {
		Employee e1 = new Employee();
		System.out.println("Directly printing the class variable Firstname: " + e1.employeeFName);
		e1.displayEmployeeInfo();
		System.out.println("Printing the memory address of reference variable: " + e1);
	}
	
	

}