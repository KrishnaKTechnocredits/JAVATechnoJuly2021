package poojaJoshi;

class Student1{
	
	void studentName(String name,String fName,String lName){
		System.out.print(name);
		System.out.print(fName);
		System.out.println(lName);
	}
	
	void studentOtherDetails(String address, String birthday, int rno){
		System.out.println(address);
		System.out.println(birthday);
		System.out.println(rno);
	}
	
	public static void main (String[] args){
		Student1 student1 = new Student1();
		student1.studentName("Pooja ","N ","Joshi");
		student1.studentOtherDetails("f-802 Splendour County","17th Aug 1992",611);
	}
	
	

}