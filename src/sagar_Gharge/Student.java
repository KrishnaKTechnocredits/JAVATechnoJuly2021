package sagar_Gharge;


class Student {
	
	String studName = " Technocredit";
	int rollnumber = 1;
	
	void displayInfo () {
	
		System.out.println(" student name is " + studName );
		System.out.println (" rollnumber is " + rollnumber );
		
		}
	public static void main ( String [] arg) {
		Student s1 = new Student ();
		s1.displayInfo();
	}


}