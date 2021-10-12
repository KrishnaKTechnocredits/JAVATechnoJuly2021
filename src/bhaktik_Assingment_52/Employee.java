/*Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
*/
package bhaktik_Assingment_52;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	
	int id;
	String name;
	int salary ;
	int experiance;
	
	Employee(int id, String name, int salary,int experiance){
		this.id=id;
		this.name=name;
		this.salary= salary;
		this.experiance= experiance;
		
		
	}

	@Override
	public int compareTo(Employee o) {
		 if (!this.name.equals(o.name)) {
			 return this.name.compareTo(o.name);
		 }else if (this.experiance!=o.experiance) {
			 return this.experiance-o.experiance;
		 }else
			 return this.salary-o.salary;
	}
	
	public String toString() {
		return this.id+"-"+this.name+"-"+this.salary;
	}

}
