
/*Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
*/
package amol_Pawar.Assignment_52;

public class Employee implements Comparable<Employee>{
	int id, salary, exp;
	String name;
	public Employee(int id, String name,int salary,int exp)
	{
		this.id=id;
		this.name=name;
		this.exp=exp;
		this.salary=salary;
	}
	
	
	@Override
	public String toString() {
		return " [name=" + name + ", salary=" + salary + ", exp=" + exp + ", id=" + id + "]";
	}


	@ Override
	public int compareTo(Employee o)
	{
		if((this.name.compareTo(o.name))!=0)
		{
			return this.name.compareTo(o.name);
		}
		else if(this.exp!=o.exp)
		{
			return this.exp-o.exp;
		}
		else 
		{
			return this.salary-o.salary;
		}
		
	}
}
