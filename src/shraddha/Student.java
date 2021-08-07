package shraddha;
class Student {
	String name = "Shraddha";
	int rno=93;
	
	void displayInfo(){
		System.out.println("Student name is "+name);
		System.out.println("Student rollnumber is "+rno);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.displayInfo();
	}
}