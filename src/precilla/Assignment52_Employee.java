package precilla;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment52_Employee implements Comparable<Object> {
	int empid=0;
	String name="";
	int salary=0;
	int yearofexp=0;
	Assignment52_Employee(int id,String name,int sal,int yop){
		this.empid=id;
		this.name=name;
		this.salary=sal;
		this.yearofexp=yop;
	}

	public static void main(String[] args) {
		System.out.println("Sorting based on name ");
		Assignment52_Employee e1=new Assignment52_Employee(1,"Precilla",10000,6);
		Assignment52_Employee e2=new Assignment52_Employee(1,"Aranha",4580,2);
		Assignment52_Employee e3=new Assignment52_Employee(1,"Prathima",47823,4);
		
		ArrayList<Assignment52_Employee>al=new ArrayList<Assignment52_Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("Sorting based on Year of Experience ");
		Assignment52_Employee e41=new Assignment52_Employee(1,"Precilla",10000,6);
		Assignment52_Employee e5=new Assignment52_Employee(1,"Precilla",4580,2);
		Assignment52_Employee e6=new Assignment52_Employee(1,"Precilla",47823,4);
		
		ArrayList<Assignment52_Employee>al4=new ArrayList<Assignment52_Employee>();
		al4.add(e41);
		al4.add(e5);
		al4.add(e6);
		
		Collections.sort(al4);
		System.out.println(al4);

		System.out.println("Sorting based on Salary");
		Assignment52_Employee e7=new Assignment52_Employee(1,"Precilla",10000,6);
		Assignment52_Employee e8=new Assignment52_Employee(1,"Precilla",4580,6);
		Assignment52_Employee e9=new Assignment52_Employee(1,"Precilla",47823,6);
		
		ArrayList<Assignment52_Employee>al5=new ArrayList<Assignment52_Employee>();
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
		Assignment52_Employee emp=(Assignment52_Employee) obj;
		if(!(this.name.equals(emp.name)))
			return this.name.compareTo(emp.name);
		else if(!(this.yearofexp==emp.yearofexp))
			return this.yearofexp-emp.yearofexp;
		else 
			return this.salary-emp.salary;
	}

}
