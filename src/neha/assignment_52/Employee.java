package neha.assignment_52;
/*Assignment - 52 : 10th Oct'2021 [Nested Comparison - Comparable -Asc]
Create a class Called Employee.
Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next Comparison should be years of exp, 
if years of exp is same, further Comparison should be based on salary.*/

public class Employee implements Comparable<Employee> {
	int empId;
	String empName;
	int salary;
	int yearsOfExp;

	public Employee(int empId, String empName, int salary, int yearsOfExp) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.yearsOfExp = yearsOfExp;
	}

	@Override
	public int compareTo(Employee employee) {
		if (this.empName.equals(employee.empName)) {
			if (this.yearsOfExp == employee.yearsOfExp)
				return this.salary - employee.salary;
			else
				return this.yearsOfExp - employee.yearsOfExp;
		} else
			return this.empName.compareTo(employee.empName);
	}

	@Override
	public String toString() {
		return empName + "-" + yearsOfExp + "-" + salary + "-" + empId;
	}

}
