//Employee has empFirstName, empLastName, empId, It should printable
package paresh;

class Employee{
	
	String empFirstName="Paresh";
	String empLastName="Patil";
	int empId=101;
	
	void displayEmpInfo(){
		System.out.println("Employee First Name is:" + empFirstName);
		System.out.println("Employee Last Name is:" + empLastName);
		System.out.println("Employee ID is:" + empId);
	
	}
	
	public static void main (String [] args){
		Employee e1 = new Employee();
		e1.displayEmpInfo();
		
	}
	
}