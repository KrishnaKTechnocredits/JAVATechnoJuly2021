/*[Nested Comparision - Comparable -Asc]
Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
*/
package nishi.Assignment52;

public class Employee implements Comparable<Employee>{
	String id;
	String name;
	int salary;
	int yearOfExp;
	public Employee(String id, String name, int salary, int yearOfExp) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.yearOfExp = yearOfExp;
	}
	
	@Override
	public int compareTo(Employee o) {
		if(!this.name.equals(o.name))
			return this.name.compareTo(o.name);
		else if(this.yearOfExp!=o.yearOfExp)
			return this.yearOfExp-o.yearOfExp;
		else
			return this.salary-o.salary;	
		
	}	
	
	@Override
	public String toString()
	{
		return this.id+"->"+this.name;
	}
}
