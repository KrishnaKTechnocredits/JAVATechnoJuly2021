// employee has first name, last name and emp id, It should be printable
package varun;

class Employee {
	String empName = "Varun";
	String lastName = "Joshi";
	int empId = 18164;

	void employeeDetails() {
		System.out.println("Employee Name is " + empName);
		System.out.println("Employee Last Name is " + lastName);
		System.out.println("Employee Id is " + empId);
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.employeeDetails();
	}
}