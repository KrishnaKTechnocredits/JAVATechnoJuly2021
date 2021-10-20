/*Assignment - 52 : 10th Oct'2021
[Nested Comparision - Comparable -Asc]
Create a class Called Employee.
Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
 */

package santosh_Assignment52;
public class Employee implements Comparable<Employee> {

	int empId; 
	String empName;
	int empSalary;
	int empYearsOfExp;

	Employee(int empId, String empName,int empSalary,int empYearsOfExp){
		this.empId=empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empYearsOfExp = empYearsOfExp;
	}
	@Override
	public int compareTo(Employee o) {
		if (!this.empName.equals(o.empName))
			return this.empName.compareTo(o.empName);
		else if (!(this.empYearsOfExp == o.empYearsOfExp))
			return this.empYearsOfExp - o.empYearsOfExp;
		else
			return this.empSalary - o.empSalary;
	}
	public String toString() {
	return empName+" : "+empYearsOfExp+ " : " + empSalary;
	}
}

