/*Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee. 
Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
*/

package harshada.Assignment_52;

import java.util.Comparator;

public class Employee implements Comparable <Employee>{

	int empid;
	String name;
	int yrsOfExp;
	int salary;

	Employee(int empid, String name, int yrsOfExp, int salary) {
		this.empid = empid;
		this.name = name;
		this.yrsOfExp = yrsOfExp;
		this.salary = salary;
	}
	
	public String toString() {
		return name+ "-"+ yrsOfExp +" -"+salary;
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		if(this.name.equals(o.name)) {
			if(this.yrsOfExp==o.yrsOfExp) {
				return this.salary-o.salary;
			}else
				return this.yrsOfExp-o.yrsOfExp;
			
		}
		return this.name.compareTo(o.name);
	}
	
}
