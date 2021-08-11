package anuja;

class StudentInfo{
	String name="Anuja";
	String middlename="Rajeev ";
	String surname="Shrivastava";
	String birthdate="10th Aug 1998";
	String address="Gold Street";
	int rollno=1;
		void studentName(){
			System.out.println(name);
			System.out.println(middlename);
			System.out.println(surname);
			
		}
		
		void studentOtherDetails (){
			System.out.println(birthdate);
			System.out.println(address);
			System.out.println(rollno);
		}
		
		public static void main(String []a){
			StudentInfo studentInfo=new StudentInfo();
			studentInfo.studentName();
			studentInfo.studentOtherDetails();
			
		}

}