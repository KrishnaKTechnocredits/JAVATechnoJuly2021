package dattaraj.dattaraj_Assignment_52;

public class Assignment_52_Employee implements Comparable<Assignment_52_Employee> {

	int empid;
	String name;
	int salary;
	int yearsOfExp;
	
	public Assignment_52_Employee(int empid, String name, int salary, int yearsOfExp) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.yearsOfExp = yearsOfExp;
	}
	
	@Override
	public int compareTo(Assignment_52_Employee employee) {
		if(!this.name.equals(employee.name))
			return this.name.compareTo(employee.name);
		else if(!(this.yearsOfExp == employee.yearsOfExp))
			return this.yearsOfExp - employee.yearsOfExp;
		else
			return this.salary - employee.salary;
	}
	
	@Override
	public String toString() {
		return empid + "-" + name + "-" + salary + "-" + yearsOfExp;
	}
}