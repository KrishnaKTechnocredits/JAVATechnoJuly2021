package akshay;

class Employee{
	String empFirstName = "Akshay";
	String empLastName = "Malshetwar";
	int empId = 1;
	
	void displayInfo(){
		System.out.println("First Name:" + empFirstName);
		System.out.println("Last Name:" + empLastName);
		System.out.println("Employee Id" + empId);
	}
	
	public static void main(String[] args){
		Employee e1 = new Employee();
		System.out.println(e1);
		e1.displayInfo();
	}
}