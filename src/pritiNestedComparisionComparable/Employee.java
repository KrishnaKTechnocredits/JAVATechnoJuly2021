package pritiNestedComparisionComparable;

public class Employee implements Comparable<Employee>{
	int id;
	String empName;
	int salary;
	int yearsOfExp;
	
	Employee(int id,String empName,int salary,int yearsOfExp ){
		this.id= id;
		this.empName= empName;
		this.salary = salary;
		this.yearsOfExp= yearsOfExp;
	}
	@Override
	public String toString() {
		return this.id+"-"+this.empName+"-"+this.yearsOfExp+"-"+this.salary;
	}
	
	@Override
	public int compareTo(Employee e1) {
		if (this.empName.compareTo(e1.empName)==0){
			if ((this.yearsOfExp-e1.yearsOfExp)==0)
				return this.salary-e1.salary;
			return this.empName.compareTo(e1.empName);
		}
		return this.empName.compareTo(e1.empName);
		
	}

}
/*Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
*/