// Employee has empFirstName, empLastName, empId, it should printable
package avinash;

class Employee{

	String empFirstName = "Avinash";
	String empLastName = "Patil";
	int empId = 101;
	
	void empInfo(){
		System.out.println("Employee empFirstName:"+ empFirstName);
		System.out.println("Employee empLastName:"+ empLastName);
		System.out.println("Employee empId:"+ empId);
	}
	
	public static void main(String [] args){
		Employee emp = new Employee();
		emp.empInfo();
		
	}
	
}
