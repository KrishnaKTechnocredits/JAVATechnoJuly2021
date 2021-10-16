/* Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.
Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary. */

package akanksha_Jain.Assignment_52;

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