package prajwal;


class Student {
   
   String stdName = "prajwal";
   int rollNo = 23;

void displayInfo(){
	System.out.println("Student Name is" + stdName);
    System.out.println("Roll No is" + rollNo);
   }

public static void main(String[] a){
	Student s1 = new Student();
	System.out.println(s1);
	s1.displayInfo();
   }
}