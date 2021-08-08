package akanksha_Jain;

public class Assignment_5{
	String userName, pwd;
	int bankAccountNumber;

	void setDetails(String uName, String password, int bankAcNo){
		userName= uName;
		pwd= password;
		bankAccountNumber=bankAcNo;
	}

	void updatePassword(String updatePassword){
		pwd = updatePassword;
	}

	void displayInfo(){
		System.out.println("User name= " +userName);
		System.out.println("Password= " +pwd);
		System.out.println("Bank Account Number= " +bankAccountNumber);
	}

	public static void main(String[] args) {
		Assignment_5 bankAccount = new Assignment_5();
		bankAccount.setDetails("Akansha Jain", "Qwertyui", 1234567890);
		bankAccount.updatePassword("Qwerty@12345");
		bankAccount.displayInfo();
	}
}
