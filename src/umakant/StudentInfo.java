package umakant;
class StudentInfo{
	
	String name;
	String middleName;
	String surName;
	String birthDate;
	String address;
	int rollNumber;
	
	void studendName(String name,String middleName,String surName){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surName);
	}
	
	void studentOtherDetails(String birthDate,String address,int rollNumber){
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.name="Uma";
		studentInfo.middleName="Kant";	
		studentInfo.surName="Sahani";
		studentInfo.birthDate="04 Feb 1995";	
		studentInfo.address="420, J20, Shapoorjee, Kolkata, West Bengal";
		studentInfo.rollNumber=20;
		studentInfo.studendName(studentInfo.name,studentInfo.middleName,studentInfo.surName);	
		studentInfo.studentOtherDetails(studentInfo.birthDate,studentInfo.address,studentInfo.rollNumber);
	}
}