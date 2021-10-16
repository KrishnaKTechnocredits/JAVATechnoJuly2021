package arti_G_Assignment52;

/*Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
*/
public class Employee implements Comparable<Employee> {

	int id;
	String name;
	int salary;
	int yearsOfExp;

	Employee(int id, String name, int salary, int yearsOfExp) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.yearsOfExp = yearsOfExp;
	}

	@Override
	public int compareTo(Employee arg0) {
		if (this.name.compareTo(arg0.name) != 0)
			return this.name.compareTo(arg0.name);
		else if (this.yearsOfExp != arg0.yearsOfExp)
			return this.yearsOfExp - arg0.yearsOfExp;
		else
			return this.salary - arg0.salary;
	}

	public String toString() {
		return "Name : " + name + " Years of Exp : " + yearsOfExp + " Salary : " + salary;
	}
}
