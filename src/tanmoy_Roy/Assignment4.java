package tanmoy_Roy;
class Assignment4{
	
	String   Name;
	String   middleName;
	String  surName;
	String  birthDate;
	String  address;
	int rollNo;
	
	void studentName(String  Name,String middleName,String  surName){
		System.out.println("Name: "+Name+"\nMiddlename: "+middleName+"\nSurname: "+surName);
	}
	
	void studentOtherDetails(String  birthDate,String address,int rollNo){
		System.out.println("Birthdate: "+birthDate+"\nAddress: "+address+"\nRollNo: "+rollNo);
	}
	
	
	public static void main(String [] args){
		Assignment4 studentInfo = new Assignment4();
		String  Name="Tanmoy";
		String  middleName=null;
		String  surName="Roy";
		String  birthDate="28/02/1996";
		String  address="G-809, Heaven Apartment, Baner, Pune";
		int rollNo=34;
		
		studentInfo.studentName(Name,middleName,surName);
		studentInfo.studentOtherDetails(birthDate,address,rollNo);
		
	
	}

}

