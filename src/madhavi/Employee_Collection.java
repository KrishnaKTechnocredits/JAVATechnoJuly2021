package madhavi;

public class Employee_Collection implements Comparable<Employee_Collection> {
	int empid;
	String name;
	int salary;
	int yearsOfExperience;

	Employee_Collection(int empid, String name, int salary, int yearsOfExperience) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.yearsOfExperience = yearsOfExperience;
	}

	public String toString() {
		return this.empid + "-" + this.name;
	}

	@Override
	public int compareTo(Employee_Collection o) {
		if (!this.name.equals(o.name))
			return this.name.compareTo(o.name);
		else if (!(this.yearsOfExperience == o.yearsOfExperience))
			return this.yearsOfExperience - o.yearsOfExperience;
		else
			return this.salary - o.salary;
	}
}
