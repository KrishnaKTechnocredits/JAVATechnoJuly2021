//Studnt name and rno, it should be printable
package somnath;
class Student{
	String stdName = " SOMNATH N. KALE ";
	int rno =  1;
	
	void displayInfo(){
		System.out.println("Student name is " +stdName);
		System.out.println("Student roll no is " +rno);
		}
	
		public static void main(String[] a){
			Student s1 = new Student();
			s1.displayInfo();
			}
}			