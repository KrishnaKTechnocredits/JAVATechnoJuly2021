/*Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]

Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
*/
//Assignment - 53 : 11th oct'2021 Pattern Printing 

package ritabrata2.Assignment52;



public class Employee implements Comparable<Employee> {
	int id;
	String name;
	int salary;
	int yearsOfExperience;

	Employee(int id, String name, int salary, int yearsOfExp) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.yearsOfExperience = yearsOfExp;
	}

	@Override
	public int compareTo(Employee e) {
		if (this.name.compareTo(e.name) == 0) {
			if (this.yearsOfExperience == e.yearsOfExperience) {
				return this.salary - e.salary;
			}
			return this.yearsOfExperience - e.yearsOfExperience;
		}
		return this.name.compareTo(e.name);
	}

	public String toString() {
		return name + ":" + yearsOfExperience + ":" + salary;
	}

}
