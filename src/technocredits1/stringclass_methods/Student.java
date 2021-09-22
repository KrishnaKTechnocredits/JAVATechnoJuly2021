package technocredits1.stringclass_methods;

public class Student extends Object {

	private String name;
	private int rollNum;

	Student(int roll, String name) {
		this.rollNum = roll;
		this.name = name;
	}
	
	void m2() {
		
	}
	
	@Override
	public String toString() {
		return rollNum + "" + name;
	}
}
