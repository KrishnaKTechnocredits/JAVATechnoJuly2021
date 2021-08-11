package chandni_B;
class StudentInfoo{
	
	void studentName (String name, String middleName, String surname) {
		System.out.println (name);
		System.out.println (middleName);
		System.out.println (surname);
	}
	
	void studentOtherDetails (String birthdate, String address, int rno) {
		System.out.println (birthdate);
		System.out.println (address);
		System.out.println (rno);
	}
	public static void main (String [] args) {
		StudentInfoo studentinfoo = new StudentInfoo ();
		studentinfoo.studentName("Divya", "Ramesh", "Ahuja");
		studentinfoo.studentOtherDetails(("10th May 1995"), ("C Block 10/9, Gaylord Chowk, Pimpri Pune.") , 24);
	}
	
}