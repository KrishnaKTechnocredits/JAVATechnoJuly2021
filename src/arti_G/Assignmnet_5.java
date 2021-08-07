package arti_G;

//User Details
class Assignment_5 {

	String uName;
	String pass;
	int bankAccountNo;

	void setDetails(String userName, String password, int bankAccountNumber) {
		uName = userName;
		pass = password;
		bankAccountNo = bankAccountNumber;
	}

	void updatePassword(String password) {
		pass = password;
	}

	void displayInfo() {
		System.out.println("Username is " + uName);
		System.out.println("Updated password is " + pass);
		System.out.println("Bank Account Number is " + bankAccountNo);
	}

	public static void main(String[] args) {
		Assignment_5 assignment_5 = new Assignment_5();
		assignment_5.setDetails("Arti Gahlot", "Qwerty", 874788789);
		assignment_5.updatePassword("Welcome@");
		assignment_5.displayInfo();
	}
}
