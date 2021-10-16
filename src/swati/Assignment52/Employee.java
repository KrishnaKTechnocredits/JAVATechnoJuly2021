package swati.Assignment52;

public class Employee implements Comparable<Employee> {
	int id,salary,exp;
	String name;
	
	public Employee(int id,String name,int salary,int exp) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.exp=exp;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.name.equals(o.name)) {
		 if(this.exp==o.exp) {
			 return this.salary-o.salary;
		 }else
			 return this.exp-o.exp;
		}else 
			return this.name.compareTo(o.name);	
	}
	
	@Override
	public String toString() {
		
		return id+"-"+name+"-"+exp+"-"+salary;
	}
}

