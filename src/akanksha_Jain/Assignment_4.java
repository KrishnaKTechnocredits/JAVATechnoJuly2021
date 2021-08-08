package akanksha_Jain;

public class Assignment_4{
	String name, mName, sName, address, birthday;
	int rNo;

	void studentName(String name, String mName, String sName){
		System.out.println(name);
		System.out.println(mName);
		System.out.println(sName);
	}

	void studentOtherDetails(String birthday, String address, int rNo){
		System.out.println(birthday);
		System.out.println(address);
		System.out.println(rNo);
	}

	public static void main(String[] args){
		Assignment_4 studentInfo = new Assignment_4();
		studentInfo.studentName("Shikha", "Amit", "Patel");
		studentInfo.studentOtherDetails("10th Aug 1998", "G-809, Heaven Apartment, Baner, Pune.", 34);
	}
}
