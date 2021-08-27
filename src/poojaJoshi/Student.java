//student has name and rno, it should be printable
package poojaJoshi;

class Student{

	String stdName="Pooja";
	int rno=1;
	
	void displayInfo(){
		System.out.println("student name is : " +stdName);
		System.out.println("Roll number is : " +rno);
		
	}
	
	public static void main(String[] args){
		Student s1 = new Student();
		s1.displayInfo();
	}
}
