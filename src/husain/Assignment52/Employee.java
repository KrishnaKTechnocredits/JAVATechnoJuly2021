/*
 * Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
 */
package husain.Assignment52;

public class Employee implements Comparable<Employee> {

	int id;
	int salary;
	String name;
	int years;

	Employee(int id, String name, int salary, int years) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.years = years;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (this.name.compareTo(o.name) != 0)
			return this.name.compareTo(o.name);
		else if (this.years != o.years)
			return this.years - o.years;
		else
			return this.salary - o.salary;
	}

	public String toString() {
		return "Name : "+ name + " , Exp : " + years + " , Salary : " + salary;
	}

}
