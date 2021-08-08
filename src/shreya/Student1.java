package shreya;

class Student1{
	String name="Shreya";
	int rno=22;
	char section='B';
	
	void displayDetails(){
		System.out.println("Student name is "+name +" and roll no is "+rno +" and section is "+section);
	}
	
	public static void main(String[] args){
		Student1 student1=new Student1();
		student1.displayDetails();
	}
}