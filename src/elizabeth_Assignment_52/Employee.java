/*Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.

Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, 
further comparision should be based on salary.*/




package elizabeth_Assignment_52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Object> {
	
	int id;
	String name;
	int salary;
	int yearOfExp;
	
	Employee(int id,String name,int salary,int yearOfExp){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.yearOfExp=yearOfExp;
	}
	
	@Override
	public String toString() {
		return this.id+ "-" +this.name+ "-" +this.yearOfExp+ "-" +this.salary;
	}
	
	public int compareTo(Object obj) {
		Employee emp=(Employee)obj;
		if(!(this.name.equals(emp.name))) {
			return this.name.compareTo(emp.name);
		}else if(!(this.yearOfExp==emp.yearOfExp)){
			return this.yearOfExp-(emp.yearOfExp);
		}else
			return this.salary-emp.salary;
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(123,"eliza",90000,8);
		Employee e2=new Employee(124,"eliza",80000,5);
		Employee e3=new Employee(128,"eliza",50000,4);
		Employee e4=new Employee(122,"eliza",100000,9);
		
		List<Employee>list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
