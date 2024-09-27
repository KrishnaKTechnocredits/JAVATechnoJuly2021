package parthav.parthavD_Assignment52;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	int salary;
	int yearsOfExperience;

	Employee(int id, String name, int salary, int years) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.yearsOfExperience = years;

	}

	@Override
	public String toString() {
		return (id + ":" + name + ":" + salary + ":" + yearsOfExperience);
	}

	@Override
	public int compareTo(Employee obj) {
		if (this.name.equals(obj.name)) {
			if (this.yearsOfExperience == obj.yearsOfExperience) {
				if (this.salary == obj.salary)
					return 0;
				return (this.salary - obj.salary);
			} else
				return (this.yearsOfExperience - obj.yearsOfExperience);

		} else {
			return this.name.compareTo(obj.name);
		}
	}

}
