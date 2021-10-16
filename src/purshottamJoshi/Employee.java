/*
 Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.
Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision 
should be years of exp, if years of exp is same, further comparision should be based on salary.
 */
package purshottamJoshi;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	int salary;
	int yearsOfExperience;

	Employee(int id, String name, int salary, int yearsOfExperience) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.yearsOfExperience = yearsOfExperience;
	}

	public String toString() {
		return this.id + " : " + this.name;
	}



	@Override
	public int compareTo(Employee o) {
		if (!this.name.equals(o.name))
			return this.name.compareTo(o.name);
		else if (!(this.yearsOfExperience == o.yearsOfExperience))
			return this.yearsOfExperience - o.yearsOfExperience;
		else
			return this.salary - o.salary;
	}}
