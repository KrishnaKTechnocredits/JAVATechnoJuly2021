//Student have roll number & name
package kalpesh;

class Student{
     String stdName = "Kalpesh Chaudhari";
	 int stdRno = 10;
	 
	 void displayInfo(){
	 System.out.println("Student roll no. is "+ stdRno);
	 System.out.println("Student name is "+ stdName);
	 
	 }
	 public static void main (String[] args) {
	 Student s1 = new Student();
	 s1.displayInfo();
	 
	 }
}




