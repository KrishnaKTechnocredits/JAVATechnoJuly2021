package umakant.collections;

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
		return id + "-" + name;
	}
	

	@Override
	public int compareTo(Employee o) {
		if (!this.name.equals(o.name))
			return this.name.compareTo(o.name);
		else if (!(this.yearsOfExperience == o.yearsOfExperience))
			return this.yearsOfExperience - o.yearsOfExperience;
		else
			return this.salary - o.salary;
	}

}
