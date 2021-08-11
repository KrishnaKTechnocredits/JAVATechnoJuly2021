package poojaJoshi;

class StudentInfo{
	
	String name = "Pooja";
	String middleName= "Nandkishor";
	String lastName= "Joshi";
	String birthdate ="17th Aug 1992";
	String address = "802, Splendour County, wagholi";
	int rno=611;
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(lastName);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rno);
	}
	
	public static void main(String[] args){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}

}


