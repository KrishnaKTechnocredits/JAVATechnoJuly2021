package tanmoy_Sarkar;

public class Employee {
	String empFirstName = "Tanmoy";
	String empLastName = "Sarkar";
	int empId = 16253;

	void printDetails(){
		System.out.println("Employee Frist name is : " +empFirstName);
		System.out.println("Employee Last name is: " +empLastName);
		System.out.println("EmployeeId is: " +empId);
	}

	public static void main(String args[]){
		Employee e1 = new Employee();
		e1.printDetails();
	}

}
