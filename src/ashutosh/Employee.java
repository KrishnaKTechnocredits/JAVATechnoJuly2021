package ashutosh;

class Employee{
	String empName = "Ashutosh";
	String empLastName = "Band";
	int empId = 101;

	
	void disaplayInfo(){
		System.out.println("Employee Name is " +empName);
		System.out.println("Employee Last Name is " +empLastName);
		System.out.println("Employee Id is " +empId);
	}
	public static void main(String[] a){
		Employee e1 = new Employee();
		e1.disaplayInfo();
	}
}