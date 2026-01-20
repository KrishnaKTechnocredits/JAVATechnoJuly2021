package shraddha.Assignment52;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {

	int emp_id;
	String name;
	int salary;
	int yearsOfExp;

	public Employee(int emp_id, String name, int salary, int yearsOfExp) {

		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.yearsOfExp = yearsOfExp;
	}

	@Override
	public int compareTo(Employee o) {
		if (!(this.name.equals(o.name)))
			return this.name.compareTo(o.name);
		else if (this.yearsOfExp == o.yearsOfExp)
			return this.yearsOfExp - o.yearsOfExp;
		else
			return this.salary - o.salary;
	}

	@Override
	public String toString() {
		return name + ": " + " : " + salary + " :  " + yearsOfExp;

	}

	public static void main(String[] args) {
		Employee emp4 = new Employee(1, "Shraddha", 100000, 10);
		Employee emp1 = new Employee(2, "Rita", 600000, 5);
		Employee emp2 = new Employee(6, "Seeta", 500000, 9);
		Employee emp3 = new Employee(3, "Geeta", 350000, 7);

		ArrayList<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);

		Collections.sort(list);
		System.out.println(list);
	}

}
