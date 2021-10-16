package vivek.Assignment52;

public class Employee implements Comparable<Employee> {

	int empid;
	String name;
	int yrsOfExp;
	int salary;

	Employee(int empid, String name, int yrsOfExp, int salary) {
		this.empid = empid;
		this.name = name;
		this.yrsOfExp = yrsOfExp;
		this.salary = salary;
	}

	public String toString() {
		return name + "-" + yrsOfExp + "-" + salary;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.name.equals(o.name)) {
			if (this.yrsOfExp == o.yrsOfExp) {
				return this.salary - o.salary;
			} else
				return this.yrsOfExp - o.yrsOfExp;
		} else
			return this.name.compareTo(o.name);
	}
}
