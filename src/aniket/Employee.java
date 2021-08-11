package aniket;
class Employee{
	//String empFname="Aniket";
	String empFname="Akshay";
	String empLname="Balsaraf";
	int empId=1;
	
	
	
	public static void main(String[] args){
		
		Employee employee = new Employee();
		employee.displyInfo();
		
	}
	
	void displyInfo(){
		System.out.println(empFname);
		System.out.println(empLname);
		System.out.println(empId);
	
	}


}