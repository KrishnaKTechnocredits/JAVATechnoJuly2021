package monika.Assignment_52;

public class Employee implements Comparable<Employee> {

	int id, salary,yearOfExp;
	String name;
	
	Employee(int id, String name,int salary,int yearOfExp){
		this.id=id;
		this.name = name;
		this.salary = salary;
		this.yearOfExp = yearOfExp;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (this.name.compareTo(o.name) != 0)
			return this.name.compareTo(o.name);
		else if (this.yearOfExp != o.yearOfExp)
			return this.yearOfExp - o.yearOfExp;
		else
			return this.salary - o.salary;
	}
	public String toString() {
		return "Name : "+ name + " , Exp : " + yearOfExp + " , Salary : " + salary;
	}

}
