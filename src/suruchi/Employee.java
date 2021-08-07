package suruchi;

//Employee has empFirstName, empLastName, empId; it should be printabled

class Employee{

	String empFirstName = "Suruchi";
	String empLastName = "Joshi";
	int empId = 100;

	void displayInfo(){
	
		System.out.println("Employee name is: " + empFirstName + " " + empLastName);
		System.out.println("Employee Id is: " + empId);

	}
	
	public static void main(String[] args){
		
		Employee e1= new Employee();
		e1.displayInfo();
		
	}

}