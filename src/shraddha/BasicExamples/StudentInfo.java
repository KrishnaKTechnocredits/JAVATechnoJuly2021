package shraddha.BasicExamples;
class StudentInfo{ 
	int rollNumber=40;
	String name = "Shraddha";
	String middleName="Abhijeet";
	String surname="Rathi";
	String birthdate="10th September 2018";
	String address="308, La mainson, Al Karama, Dubai, UAE";
 
		public static void main(String[] args){
			StudentInfo sInfo = new StudentInfo();
			sInfo.studentName();
			sInfo.studentOtherDetails();
		}
		
		void studentOtherDetails(){
			System.out.println(birthdate);
			System.out.println(address);
			System.out.println(rollNumber);
		}
		
		void studentName(){ 
			System.out.println(name);
			System.out.println(middleName);
			System.out.println(surname);
		}
}