package aniket.assignment_52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Client_52 {

	public static void main(String[] args) {
	Employee_52 e1 = new Employee_52(1111,"Aniket",1500000,3);
	Employee_52 e2 = new Employee_52(1234,"Aniket",1100000,2);
	Employee_52 e3 = new Employee_52(1156,"Aniket",1300000,3);
	Employee_52 e4 = new Employee_52(1151,"Kiya",2500000,5);
	Employee_52 e5 = new Employee_52(1581,"Vihan",350000,1);
	
	ArrayList<Employee_52> alist = new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5));
	System.out.println(alist);
	Collections.sort(alist);
	System.out.println(alist);
	}
}