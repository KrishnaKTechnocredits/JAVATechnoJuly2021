package suchita;
// Assignment 52

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
		return this.id + "-" + this.name;
	}



	@Override
	public int compareTo(Employee obj) {
		
		if (!this.name.equals(obj.name))
			return this.name.compareTo(obj.name);
		else if (!(this.yearsOfExperience == obj.yearsOfExperience))
			return this.yearsOfExperience - obj.yearsOfExperience;
		else
			return this.salary - obj.salary;
	}

}