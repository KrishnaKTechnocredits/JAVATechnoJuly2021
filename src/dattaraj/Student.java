package dattaraj;

class Student{
	
	String stdName = "Dattaraj";
	int rno = 1;
	
	void displayinfo(){
		System.out.println(stdName);
		System.out.println(rno);
	}
	
	public static void main(String[] args){
		Student std = new Student();
		std.displayinfo();
		System.out.println("Hello World");
	}
	
}