package technocredits1.collectionDemo.hashcodeDemo;

public class Employee {

	int id;
	String empname;
	
	Employee(int id, String empname){
		this.id = id;
		this.empname = empname;
	}
	
	@Override
	public int hashCode() {
		return 100;
	}
}
