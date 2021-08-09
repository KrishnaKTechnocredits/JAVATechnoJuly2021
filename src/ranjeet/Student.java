package ranjeet;



class Student{

	String stdName = "Ranjit";
	int rNo = 1;
	
	void displayInfo(){
		System.out.println("Student name is "+ stdName);
		System.out.println("Student roll number is "+ rNo);
	
	}
	
	public static void main(String[] args){
		Student s1 = new Student();
		s1.displayInfo();
	}
}