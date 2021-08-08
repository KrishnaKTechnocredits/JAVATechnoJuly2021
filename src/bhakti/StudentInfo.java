//Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.
package bhakti;
class StudentInfo{

	void studentName(String name, String middle_name, String surname){
		System.out.println(name);
		System.out.println(middle_name);
	        System.out.println(surname);
	}
	
	void studentOtherDetails(String birthdate, String address, int rollNo){
  		System.out.println(birthdate);
		System.out.println(address);
	        System.out.println(rollNo);
		
	}
	
	public static void main(String [] s){
	 	StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Shikha","Amilt", "Patel");
		studentInfo.studentOtherDetails("9th Dec2018", "G-89, Apartment, link raos / laxmi nagar, Chicnwad 411033", 300 );

	}
}