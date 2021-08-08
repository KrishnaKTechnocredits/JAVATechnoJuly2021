package nidhi;

class Employee{
	String empFname = "Nidhi";
	String empLname = "Chauhan";
	int empID = 5088037;
	
	void employeeInfo(){
		System.out.println("First Name is :" + empFname);
		System.out.println("Last Name is :" + empLname);
		System.out.println("Employee ID is :" + empID);
	}
	
	public static void main(String[] ar){
		Employee emp = new Employee();
		emp.employeeInfo();
		System.out.println(emp);
	}
}