package tanmoy_Roy;

class Employee{

	String empFirstName = "Tanmoy";
	String empLastName = "Roy";
	int empId = 1;
	
	void displayInfo(){
		System.out.println(empFirstName);
		System.out.println(empLastName);
		System.out.println(empId);
	}
	
	public static void main(String[] args){
		Employee Emp = new Employee();
	
		Emp.displayInfo();
	}
}

