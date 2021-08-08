// Student has name and rno, it should be printable
package ashit;

class Student{
	String stdName ="techno";
	int rno = 1;

	void displayInfo() {
		System.out.println("Student name is "+stdName);
		System.out.println(rno);
	}	
		public static void main(String[] a){
			Student s1=new Student();
			s1.displayInfo();
	}
}