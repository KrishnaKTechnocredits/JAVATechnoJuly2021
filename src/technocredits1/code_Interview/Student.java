package technocredits1.code_Interview;

public class Student implements Cloneable{

	int rno;
	String name;
	// 13
	
	void setRno(int rno) {
		this.rno = rno;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	Student getCopy(Student s1) {
		Student student = null;
		try {
			student = (Student)s1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return student;
	}
	
	void display() {
		System.out.println(rno + " : " + name);
	}
}
