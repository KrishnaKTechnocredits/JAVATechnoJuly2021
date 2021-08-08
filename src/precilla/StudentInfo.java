package precilla;

class StudentInfo{
	void studentName(String name,String middleName,String surName){
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
		StudentInfo studentInfo=new StudentInfo();
		studentInfo.studentName("Precilla","Rozita","Aranha");
		studentInfo.studentOtherDetails("16th May 1996","H-#119,New house,Padubelle post,Udupi,Karnataka",122);
	}
}