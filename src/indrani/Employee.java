// Employee has empFirstName, empLastName, empId, it should printable

package indrani;
class Employee{
   String empFirstName = "INDRANI";
   String empLastName = "BANERJEE";
	int empId = 1816427;
	
	void displayInfo(){
		System.out.println("Employee name is " + empFirstName + " " + empLastName);
		System.out.println("Employee id " + empId);
	}
	public static void main(String args[]){
		Employee e1 = new Employee();
		e1.displayInfo();
	}
}
	
 
