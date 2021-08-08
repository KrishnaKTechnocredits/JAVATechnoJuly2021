package devendra;

class Assignment_2 {
	String stdName = "DDC";
	int rno = 3;
	
	void displayInfo() {
		System.out.println("Student Name is "+stdName);
		System.out.println("Student's Roll No. is "+rno);
	
	}
	
	public static void main(String[] a){
		Assignment_2 A1 = new Assignment_2();
		A1.displayInfo();
	}
 }