package nishi.Assignment52;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	public static void main(String[] args) {
		Employee e1=new Employee("1334A","Nishi",10000,1);
		Employee e2=new Employee("1334B","Nishi",5000,1);
		Employee e3=new Employee("1334C","Saurav",20000,2);
		Employee e4=new Employee("1334D","Rahul",40000,3);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		Collections.sort(al);
		System.out.println(al);
	}
}
