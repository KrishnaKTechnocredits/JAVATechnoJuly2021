/*Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.*/

package astha.Assignment52;

public class Employee implements Comparable<Employee> {

	int empId, salary, yearsOfExp;
	String name;

	public Employee(int empId, int salary, int yearsOfExp, String name) {
		this.empId = empId;
		this.salary = salary;
		this.yearsOfExp = yearsOfExp;
		this.name = name;
	}

	public String toString() {
		return "Name - " + name + " , Exp - " + yearsOfExp + " , Salary - " + salary;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.name.compareTo(o.name) != 0)
			return this.name.compareTo(o.name);
		else if (this.yearsOfExp != o.yearsOfExp)
			return this.yearsOfExp - o.yearsOfExp;
		else
			return this.salary - o.salary;

	}

}
