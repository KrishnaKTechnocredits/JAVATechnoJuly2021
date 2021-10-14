package shantanu.nestedComparison_assignment52;

public class Employee implements Comparable<Employee> {
	//id, name, salary, years of exp
	int id;
	String name;
	int salary;
	int experience;
	
	Employee(int id, String name, int salary, int experience){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}

	@Override
	public int compareTo(Employee o) {
		if(!this.name.equals(o.name))
			return this.name.compareTo(o.name);
		else if(!(this.experience - o.experience == 0))
			return this.experience - o.experience;
		else
			return this.salary - o.salary;
			
	}
	
	public String toString() {
		return name + ":" + salary + ":" + experience;
	}
}
