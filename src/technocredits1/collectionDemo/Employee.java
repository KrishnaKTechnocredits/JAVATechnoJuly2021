package technocredits1.collectionDemo;

class Employee implements Comparable<Employee>{
	int empid;
	String empname;
	int salary;

	Employee(int empid, String empname, int salary) {
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}

//	@Override
//	public int compareTo(Employee emp) {
//		return this.salary - emp.salary; // -Ve, 0, +Ve
//	}// -ve means smaller, which comes previous.  +ve means greater which comes after current object

	// aab // aaf
	public int compareTo(Employee emp) {
		if(this.empname.compareTo(emp.empname) == 0) {
			if(this.salary - emp.salary != 0) {
				return this.salary - emp.salary;
			}else {
				return this.empid - emp.empid;
			}
		}
		return this.empname.compareTo(emp.empname);
		/*if(this.empname.compareTo(emp.empname) == 0) 
			return 0;
		else if(this.empname.compareTo(emp.empname) > 0)
			return 1;
		else
			return -11;*/
	}
	
	public String toString() {
		return empid + "-" +  empname + "-" + salary;
	}
}