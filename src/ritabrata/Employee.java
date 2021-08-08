package ritabrata;
class Employee {
	String empFirstName= "Ritabrata";
	String empLastName= "Bhattacharyya";
	int empId= 111001100;
	
	
	void displayInfo(){
		System.out.println("Employee name is: "+ empFirstName+ " "+ empLastName);
		System.out.println("Employee Id no is: " + empId);
		
		
	}
	public static void main(String[] args){
		Employee e1= new Employee();
		e1.displayInfo();
		
		
		
	}
}