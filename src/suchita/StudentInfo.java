package suchita;

class StudentInfo{

	//String name , middle_name , sur_name , birthday , address;
	int roll;
	
	void studentName(String name, String middle_name,String sur_name){
		System.out.println(" Name of the student :: " +  name + middle_name + sur_name);
	//	System.out.println( middle_name);
		//System.out.println(sur_name);
	}
	
	void studentOtherDetails(int roll, String birthday,String address){
		System.out.println(" Student's roll number :: " + roll);
		System.out.println(" Student's Date of birth :: " + birthday);
		System.out.println(" Student's Address ::" + address);
	}
	
	public static void main(String[] args){
	
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName("Om" ," Jay", " Jagdish");
		studentinfo.studentOtherDetails(11, "3rd_Aug_2021" , " Whitefield_Bangalore");
	}
	
}