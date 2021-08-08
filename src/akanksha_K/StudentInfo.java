package akanksha_K;

class StudentInfo{

	String name= "Akanksha";
	String midname= "Gajanan";
	String surname= "Karnewar";
	String birthdate= "26th Feb 1997";
	String address= "The woods, wakad, pune";
	int rno= 1;
	
	void studentName(){
	    System.out.println(name);
	    System.out.println(midname);
	    System.out.println(surname);
	}

	void studentOtherDetails(){
	    System.out.println(birthdate);
	    System.out.println(address);
	    System.out.println(rno);
	}

	public static void main (String[] args){
	    StudentInfo studentInfo = new StudentInfo();
	    studentInfo.studentName();
	    studentInfo.studentOtherDetails();
	}
}