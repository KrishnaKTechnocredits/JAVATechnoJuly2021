package manaswi;

import java.util.ArrayList;
import java.util.Collections;

/*Assignment - 52 : 10th Oct'2021 [Nested Comparision - Comparable -Asc]
Create a class Called Employee.
Employee - id, name, salary, years of exp
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
Sort Employee object based on name, if name is same next comparision should be years of exp, if years of exp is same, further comparision should be based on salary.
*/
public class Assignment_52 implements Comparable<Assignment_52>
{

	int emp_id;
	String name;
	int salary;
	int yearsOfExp;

	public Assignment_52(int emp_id, String name, int salary, int yearsOfExp) 
	{

		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.yearsOfExp = yearsOfExp;
	}

	@Override
	public int compareTo(Assignment_52 o) 
	{
		if(!(this.name.equals(o.name)))
		return this.name.compareTo(o.name) ;
		else if(this.yearsOfExp==o.yearsOfExp)
			return this.yearsOfExp-o.yearsOfExp;
		else
			return this.salary-o.salary;
	}

	@Override
	public String toString() 
	{
		return name+": "+ " : "+ salary+ " :  "+yearsOfExp;

	}

	public static void main(String[] args)
	{
		Assignment_52 emp4=new Assignment_52(2,"Monali",5000,10);
		Assignment_52 emp1=new Assignment_52(5,"Mitansh",6000,7);
		Assignment_52 emp2=new Assignment_52(7,"Monali",5000,8);
		Assignment_52 emp3=new Assignment_52(9,"Jiya",8000,7);

		ArrayList<Assignment_52> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);

		Collections.sort(list);
		System.out.println(list);
	}

}