package sagar_Anasane;

class Patient{
	String patientName = "Nachiket";
	int age = 47;
	String bloodGroup = "AB-";

	void patientDetails(){
		System.out.println("Patient Name is "+patientName);
		System.out.println("Patient Age is "+age);
		System.out.println("Blood Group is "+bloodGroup);
	}
	
	public static void main(String[] a){
		Patient p = new Patient();
		p.patientDetails();
		
	}
} 