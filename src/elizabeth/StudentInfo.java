package elizabeth;

class StudentInfo{
	
	void stdName(String name, String middlename, String surname){
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	
	void stdOtherDetails(String birthdate,String address, int rollnum){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollnum);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo=new StudentInfo();
		studentInfo.stdName("Elizabeth","Mary","Simon" );
		studentInfo.stdOtherDetails("1st Dec 1995","#102,Church Street,Bangalore-560045",4521);
		
	}
}
