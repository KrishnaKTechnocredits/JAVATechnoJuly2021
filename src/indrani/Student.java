// Student has name , rno , it should be printable
package indrani;
class Student{
	String stdName = "techno";
	int rno = 1;
	
	void displayInfo(){
		System.out.println("Student name is " + stdName);
		System.out.println("Student roll no is " + rno);
	}
	public static void main(String args[]){
		Student s1 = new Student();
		s1.displayInfo();
	}
}
	
