package shweta_Bhosale;
class Student{
String stdName = "Ani";
int rollno = 1;

void display(){
System.out.println("Student name is " + stdName);
System.out.println("Rollnbr is " + rollno);
}
public static void main(String[] args){
Student s1= new Student();
s1.display();
}
}