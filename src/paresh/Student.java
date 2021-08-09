//Student has name and rno, it should be printable
package paresh;

class Student {
	String name="Paresh";
	int rno=101;
	
	void displayInfo(){
		System.out.println("Student role number is: " +rno );
		System.out.println("Student Name is: " + name);
	}
	
	public static void main (String [] args)
	{
		Student s1 = new Student();
		s1.displayInfo();
		
	}
}
	