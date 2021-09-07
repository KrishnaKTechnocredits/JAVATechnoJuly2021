package technocredits1.oops;

public class Employee extends Manager {
	
	int x = 10;
	public static void main(String[] args) {
		Manager mng = new Employee();
		Employee emp = new Employee();
		
		emp = (Employee)mng;
		System.out.println(emp.x);
	}
}
