/*Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparison should be years of exp, if years of exp is same, further comparison should be based on salary.*/

package suruchi.Assignment52;

public class Employee implements Comparable<Employee>{

	int emp_id, salary, yearOfExp;
	String name;

	public Employee(int emp_id, String name, int salary, int yearOfExp) {
		this.emp_id = emp_id;
		this.salary = salary;
		this.yearOfExp = yearOfExp;
		this.name = name;
	}

	public String toString() {
		return "Name : " + name + " , Exp : " + yearOfExp + " , Salary : " + salary;
	}

	@Override
	public int compareTo(Employee o) {
		if (!this.name.equals(o.name))
			return this.name.compareTo(o.name);
		else if (this.yearOfExp != o.yearOfExp)
			return this.yearOfExp - o.yearOfExp;
		else
			return this.salary - o.salary;
	}
}