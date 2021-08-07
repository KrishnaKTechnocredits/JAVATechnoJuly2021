package shreya;

//First java program

class Student{
     String stdName="techno";
	 int rno=1;
	 
	 void displayInfo(){
	    System.out.println("Student rno is "+rno);
		System.out.println("Student name is "+stdName);
	 }
	 
	 public static void main(String[] args){
	    Student s1 = new Student();
		System.out.println(s1);
		s1.displayInfo();
	 }
}