package ranjeet;

class Employee{
	
	String empName = "Ranjit";
	String empLastName = "Dhumal";
	int empId = 112;
	
	void displayEmployeeInfo(){
		
		System.out.println("Employee name is "+ empName);
		System.out.println("Employee name is "+ empLastName);
		System.out.println("Employee name is "+ empId);
		 
	}
	public static void main(String[] args){
		Employee e1 = new Employee();
		e1.displayEmployeeInfo();
	}
}