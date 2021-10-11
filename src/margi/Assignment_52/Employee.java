package margi.Assignment_52;

/*[Nested Comparision - Comparable -Asc]
Create a class Called Employee.
Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years
of exp, if years of exp is same, further comparision should be based on salary.*/

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
	public int compareTo(Employee e) {
		if (this.name.compareTo(e.name) == 0) {
			if (this.yearsOfExp == e.yearsOfExp) {
				return this.salary - e.salary;
			}
			return this.yearsOfExp - e.yearsOfExp;
		}
		return this.name.compareTo(e.name);
	}

	public String toString() {
		return name + ":" + yearsOfExp + ":" + salary;
	}
}
