// Student has name and rno, it should be printable

package sourabh;

class Student{
	
	String stdName = "Fname";
	int stdRno = 1;
	
    void displayStdInfo(){
		System.out.println(stdName);
		System.out.println(stdRno);
		System.out.println("Student name is "+ stdName);
		System.out.println("Student rno is "+ stdRno);
		//System.out.println("Student name is "+ stdName and "Student rno is "+ stdRno);
	}
	
	public static void main(String[] a){
		Student s1 = new Student();
		s1.displayStdInfo();
	}
	
}