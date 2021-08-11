package ashutosh;

class StudenfInfo{
	void studentName(String name,String middleName,String lastName){
		System.out.println("Name: " +name);
		System.out.println("Middle Nmae: " +middleName);
		System.out.println("Last Name: " +lastName);
	}
	
	void studentDetail(String birthDate,String add,int rno){
		System.out.println("Birth Date: " +birthDate);
		System.out.println("Address: " +add);
		System.out.println("Roll No: " +rno);
	}
	
	public static void main(String[] args){
		StudenfInfo studentInfo = new StudenfInfo();
		studentInfo.studentName("Vijay","Dhinanath","Jadhav");
		studentInfo.studentDetail("1 Aug","Pune",45);
	}
}