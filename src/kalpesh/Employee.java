// Employee has empFirstName, empLastName, empId, it should printable
package kalpesh;

class Employee{
     String empFirstName = "Kalpesh";
	 String empLastName = "Chaudhari";
	 int empId = 434;
	 
	 void displayInfo(){
	 System.out.println("Employee First Name is "+ empFirstName);
	 System.out.println("Employee Last Name is "+ empLastName);
	 System.out.println("Employee Id is "+ empId);
	 
	 }
	 
	 public static void main (String[] args) {
		Employee e1 = new Employee();
		e1.displayInfo();
	 }
}