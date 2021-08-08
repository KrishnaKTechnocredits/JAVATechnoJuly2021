package amol_Vyas;
// create Emp class with empFirstName ,empLastName, empId,it should be printable

class Employee{
	String empFirstName= "akanksha";
	String empLastName= "vyas";
	int empId= 1;
	void displayInfo(){
	System.out.println("Employee name is "+empFirstName+"   "+ empLastName+"  and her id is "+empId);
	
	}
	public static void main(String[] a){
	Employee E1= new Employee();
	E1.displayInfo();
	}
}