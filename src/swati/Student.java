//Student has name and rno,it should be printable
package swati;
class Student{

	String stdName="swati";
	int rno=1;
	
	void dispalyStudentInfo(){
		System.out.println("Student Name is :"+ stdName);
		System.out.println("Student rno is :"+ rno);
	
	}
	
	public static void main(String[] a){
		Student s1=new Student();
		s1.dispalyStudentInfo();
	}
}