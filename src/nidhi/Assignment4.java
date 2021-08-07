package nidhi;

class StudentInfo{
	
	void studentName(String name,String mname,String sname){
		System.out.println(name);
		System.out.println(mname);
		System.out.println(sname);
	}
	
	void studentOtherDetails(String birthdate,String address,int rollNbr) {
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNbr);
	}
	
	public static void main(String[] ar){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Shikha","Amit","Patel");
		studentInfo.studentOtherDetails("10th Aug 1998","G-809, Heaven Apartment, Baner, Pune",34);
	}
}