package gauravk.Assignment_52;
/*
 * Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.

-----------------------------------------------------------------
 */
public class Employee implements Comparable<Employee>{
	String id;
	String name;
	int salary;
	int yearsOfExperience;
	
	Employee(String empId, String empName, int empSalary, int experience){
		this.id=empId;
		this.name=empName;
		this.salary=empSalary;
		this.yearsOfExperience=experience;
	}
	
		
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(!this.name.equals(o.name))
			return this.name.compareTo(o.name);
		else if(this.yearsOfExperience!=o.yearsOfExperience)
			return this.yearsOfExperience - o.yearsOfExperience;
		else
			return this.salary - o.salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" : "+yearsOfExperience+" : "+salary;
	}
}
