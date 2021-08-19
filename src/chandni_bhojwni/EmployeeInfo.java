package chandni_bhojwni;

class EmployeeInfo {

	int Empid;
	String Empname;
	
	void setdisplaydata(int id, String name) {
		Empid = id;
		Empname = name;
	}
	
	public static void main (String [] args) {
		EmployeeInfo employeeinfo = new EmployeeInfo ();
		employeeinfo.setdisplaydata(2, "Kiran");
		employeeinfo.setdisplaydata(3,"Divya");
		employeeinfo.setdisplaydata(4,"Soham");
	}
	
}
