/*Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
--------------*/
package shalakaAssignment52;

public class Employee implements Comparable<Employee> {
	String empName;
	int id;
	int salary;
	int yearOfExp;

	Employee(String empName, int id, int salary, int yearOfExp) {
		this.empName = empName;
		this.id = id;
		this.salary = salary;
		this.yearOfExp = yearOfExp;
	}

	@Override
	public int compareTo(Employee emp) {
		if (!this.empName.equals(emp.empName))
			return this.empName.compareTo(emp.empName);
		else if (!(this.yearOfExp == emp.yearOfExp)) {
			return this.yearOfExp - emp.yearOfExp;
		} else {
			return this.salary - emp.salary;
		}
	}

	@Override
	public String toString() {
		return empName + "-" + id + "-" + salary + "-" + yearOfExp;

	}
}
