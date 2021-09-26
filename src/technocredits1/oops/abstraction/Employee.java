package technocredits1.oops.abstraction;

public class Employee extends Admin implements Manager {
	String id = "H123";
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.m1();
		System.out.println(emp.id);
		System.out.println(Manager.id);
		System.out.println(emp.id);
	}
}
