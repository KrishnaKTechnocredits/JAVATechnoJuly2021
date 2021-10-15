/*Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.*/

package amol_Vyas.Assignment_52;

public class Employee implements Comparable<Employee> {

	int emp_id, salary, yearOfExp;
	String name;

	public Employee(int emp_id, int salary, int yearOfExp, String name) {
		this.emp_id = emp_id;
		this.salary = salary;
		this.yearOfExp = yearOfExp;
		this.name = name;
	}

	public String toString() {
		return "Name : "+ name + " , Exp : " + yearOfExp + " , Salary : " + salary;
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

}
