package precilla.assignment52;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Object> {
	int empid=0;
	String name="";
	int salary=0;
	int yearofexp=0;
	Employee(int id,String name,int sal,int yop){
		this.empid=id;
		this.name=name;
		this.salary=sal;
		this.yearofexp=yop;
	}

	public static void main(String[] args) {
		System.out.println("Sorting based on name ");
		Employee e1=new Employee(1,"Precilla",10000,6);
		Employee e2=new Employee(1,"Aranha",4580,2);
		Employee e3=new Employee(1,"Prathima",47823,4);
		
		ArrayList<Employee>al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("Sorting based on Year of Experience ");
		Employee e41=new Employee(1,"Precilla",10000,6);
		Employee e5=new Employee(1,"Precilla",4580,2);
		Employee e6=new Employee(1,"Precilla",47823,4);
		
		ArrayList<Employee>al4=new ArrayList<Employee>();
		al4.add(e41);
		al4.add(e5);
		al4.add(e6);
		
		Collections.sort(al4);
		System.out.println(al4);

		System.out.println("Sorting based on Salary");
		Employee e7=new Employee(1,"Precilla",10000,6);
		Employee e8=new Employee(1,"Precilla",4580,6);
		Employee e9=new Employee(1,"Precilla",47823,6);
		
		ArrayList<Employee>al5=new ArrayList<Employee>();
		al5.add(e7);
		al5.add(e8);
		al5.add(e9);
		
		Collections.sort(al5);
		System.out.println(al5);

	}
	public String toString() {
		return this.name+" : "+this.salary + " : "+this.yearofexp;
	}
	@Override
	public int compareTo(Object obj) {
		Employee emp=(Employee) obj;
		if(!(this.name.equals(emp.name)))
			return this.name.compareTo(emp.name);
		else if(!(this.yearofexp==emp.yearofexp))
			return this.yearofexp-emp.yearofexp;
		else 
			return this.salary-emp.salary;
	}

}
