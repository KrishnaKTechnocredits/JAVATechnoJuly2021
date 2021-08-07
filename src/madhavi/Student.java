//Student has name and rno, it should be printable
package madhavi;
class Student{
	
   String stdName="techno";
   int rno=1;

   void displayInfo(){
	  System.out.println("Student name is " + stdName);
	  System.out.println("Student rno is " + rno);
	
    }
	
	public static void main(String[] args){
		Student s= new Student();
		s.displayInfo();
	}
}
